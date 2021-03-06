package Test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

class Main {

	public static void main(String[] args) {

		Connection conn = null;
		try {
			String user = "hr"; 
			String pw = "hr";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";

			Class.forName("oracle.jdbc.driver.OracleDriver");        
			conn = DriverManager.getConnection(url, user, pw);

			System.out.println("Database에 연결되었습니다.\n");

		} catch (ClassNotFoundException cnfe) {
			System.out.println("DB 드라이버 로딩 실패 :"+cnfe.toString());
		} catch (SQLException sqle) {
			System.out.println("DB 접속실패 : "+sqle.toString());
		} catch (Exception e) {
			System.out.println("Unkonwn error");
			e.printStackTrace();
		}

		Employee employees = null;
		List<Employee> list = new ArrayList<>();

		String sql = "select employee_id, first_name, last_name, salary, email, job_id, department_id from employees where department_id is not null";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();			

			while(rs.next()) {
				employees = new Employee();
				employees.setEmployeeId(rs.getString("employee_id"));
				employees.setFirstName(rs.getString("first_name"));
				employees.setLastName(rs.getString("last_name"));
				employees.setSalary(rs.getDouble("salary"));
				employees.setEmail(rs.getString("email"));
				employees.setJobId(rs.getString("job_id"));
				employees.setDepartment(rs.getString("department_id"));
				
				list.add(employees);

			}

			System.out.println(" empNo	FirstName	LastName	Email		Job		Salary	DepartmentId");
			System.out.println("--------------------------------------------------------------------------------------------");
			list.stream().forEach(System.out::println);  //여기까지 3번 
			
			
			// 4번 답 
			System.out.println();
			System.out.println(" 4번 문제 : Alexander 찾아서 출력 ");
			list.stream()
				.filter(s -> s.getFirstName().equals("Alexander"))
				.forEach(System.out::println);







		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}

	}
}
