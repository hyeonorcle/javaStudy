package Stream;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import CollectionTest.EmployeeDTO;

class Employee {
	private String firstName;
	private String lastName;
	private double salary;
	private String department;

	public Employee() {

	}

	public Employee(String firstName, String lastName, double salary, String department) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.department = department;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	// return Employee's first and last name combined
	public String getName() {
		return String.format("%s %s", getFirstName(), getLastName());
	}

	@Override
	public String toString() {
		// return "Employee [firstName=" + firstName + ", lastName=" + lastName + ",
		// salary=" + salary + ", department=" + department + "]";
		String str = "==================================================\n";
		str.replace("=", "-");
//		return String.format("%-8s %-8s %8.2f   %s", firstName, lastName, salary, department);
		return String.format("%-8s %8.0f",firstName, salary);
	}

}

public class Main {

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

		String sql = "select first_name, last_name, salary, department_id as department from employees where department_id is not null";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();			

			while(rs.next()) {
				employees = new Employee();
				employees.setFirstName(rs.getString("first_name"));
				employees.setLastName(rs.getString("last_name"));
				employees.setSalary(rs.getDouble("salary"));
				employees.setDepartment(rs.getString("department"));
				list.add(employees);

			}
			
			// display all Employees
			System.out.println("Complete Employee list:");
			list.stream().forEach(System.out::println);

			// group Employees by department
			System.out.printf("%nEmployees by department:%n");
			Map<String, List<Employee>> groupedByDepartment = 
					list.stream()
					.collect(Collectors.groupingBy(Employee::getDepartment));
			groupedByDepartment.forEach((department, employeesInDepartment) -> {
				System.out.println(department);
				employeesInDepartment.forEach(employee -> System.out.printf(" %s%n", employee));
			});

		

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


}// end of main
}

