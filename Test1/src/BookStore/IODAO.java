package BookStore;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import CollectionTest.EmployeeDTO;

public class IODAO {
	Connection conn = null;

	public Connection getConnection() {


		try {
			String user = "java"; 
			String pw = "java";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";

			Class.forName("oracle.jdbc.driver.OracleDriver");        
			conn = DriverManager.getConnection(url, user, pw);

			System.out.println("Database�� ����Ǿ����ϴ�.\n");

		} catch (ClassNotFoundException cnfe) {
			System.out.println("DB ����̹� �ε� ���� :"+cnfe.toString());
		} catch (SQLException sqle) {
			System.out.println("DB ���ӽ��� : "+sqle.toString());
		} catch (Exception e) {
			System.out.println("Unkonwn error");
			e.printStackTrace();
		}//db����ȯ��
		return conn;
	}
	
	public void insertIOPorc(IODTO dto) {
		getConnection();

		try {
			CallableStatement cstmt = conn.prepareCall("{call ");
			

			int r = cstmt.executeUpdate();

			System.out.println(r+ " �� �ԷµǾ����ϴ�.(Proc)");

		} catch (SQLException e) {

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
