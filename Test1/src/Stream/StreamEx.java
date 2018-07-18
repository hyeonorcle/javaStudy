package Stream;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamEx {

	public static void main(String[] args) {
		//		int ar[] = {1,2,3,4,5,6,7,8,9};
		//		int sum = Arrays.stream(ar)
		//						.filter(n -> n%2==1)
		//						.sum();
		//		System.out.println(sum);

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
		try {
			String sql = "select first_name,salary from employees where first_name is not null";

			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();		

			while(rs.next()) {
				employees = new Employee();
				employees.setFirstName(rs.getString("first_name"));
				employees.setSalary(rs.getDouble("salary"));
				list.add(employees);

			}
			
			System.out.println("이름의 길이가 7보다 큰 리스트");
			list.stream()
				.filter(s -> s.getFirstName().length() >7)
				.forEach(System.out::println);
			
			System.out.println();
			System.out.println("이름이 Alexander");
			
			list.stream()
				.filter(s-> s.getFirstName().equals("Alexander"))
				.filter(s -> s.getFirstName().length() >7)
				.forEach(System.out::println);
			
			System.out.println();
			System.out.println("salary가 700이상인 사원");
			
			list.stream()
			    .filter(s -> s.getSalary() >= 700.0)
			    .forEach(System.out::println);
				
			
			
			

		} catch (SQLException e) {
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
