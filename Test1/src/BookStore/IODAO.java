package BookStore;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
	
	public void insertIOProc(IODTO dto) {
		getConnection();

		try {
			
			CallableStatement cstmt = conn.prepareCall("{call insert_product (?,?,?) ");
			cstmt.setString(1, dto.getPcode());
			cstmt.setString(2, dto.getIo_amount());
			cstmt.setString(3, dto.getStorecode());
			
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
	public List<IODTO> getIOList() {
		getConnection();

		IODTO dto = null;
		List<IODTO> list = new ArrayList<>();

		String sql = "select iocode, pcode, io_amount, storecode from io";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();			//��ȯ Ÿ���� Resultset

			while(rs.next()) {
				dto = new IODTO();
				dto.setIocode(rs.getString("iocode"));
				dto.setPcode(rs.getString("pcode"));
				dto.setIo_amount(rs.getString("io_amount"));
				dto.setStorecode(rs.getString("storecode"));
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}

		return list;

	}
	

}
