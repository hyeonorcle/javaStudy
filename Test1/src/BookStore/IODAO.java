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

			System.out.println("Database에 연결되었습니다.\n");

		} catch (ClassNotFoundException cnfe) {
			System.out.println("DB 드라이버 로딩 실패 :"+cnfe.toString());
		} catch (SQLException sqle) {
			System.out.println("DB 접속실패 : "+sqle.toString());
		} catch (Exception e) {
			System.out.println("Unkonwn error");
			e.printStackTrace();
		}//db접속환경
		return conn;
	}
	
	public void insertIOPorc(IODTO dto) {
		getConnection();

		try {
			CallableStatement cstmt = conn.prepareCall("{call ");
			

			int r = cstmt.executeUpdate();

			System.out.println(r+ " 건 입력되었습니다.(Proc)");

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
