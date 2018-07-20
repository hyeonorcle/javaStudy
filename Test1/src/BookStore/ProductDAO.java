package BookStore;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ProductDAO {
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

	public void insertProProc(ProductDTO dto) {
		getConnection();

		try {
			CallableStatement cstmt = conn.prepareCall("{call insert_prod_proc (?,?,?,?)");

			cstmt.setString(1, dto.getPcode());
			cstmt.setString(2, dto.getPname());
			cstmt.setString(3, dto.getPcontent());
			cstmt.setString(4, dto.getBstock());

			int r = cstmt.executeUpdate();

			System.out.println(r+ " 건 입력되었습니다.(Proc)");

		} catch (SQLException e) {

			e.printStackTrace(); 
		}finally {
			try {
				conn.close();
			}catch(SQLException e) {
				e.printStackTrace();			}
		}
	}

	public List<ProductDTO> getProdList() {
		getConnection();

		ProductDTO dto = null;
		List<ProductDTO> list = new ArrayList<>();

		String sql = "select pcode,pname,pcontent,bstock from product";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();			//반환 타입이 Resultset

			while(rs.next()) {
				dto = new ProductDTO();
				dto.setPcode(rs.getString("pcode"));
				dto.setPname(rs.getString("pname"));
				dto.setPcontent(rs.getString("pcontent"));
				dto.setBstock(rs.getString("bstock"));
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
	public ProductDTO getProdOneList(String pcode) {
		getConnection();

		ProductDTO dto = null;
		
		String sql = "select pcode,pname,pcontent,bstock from product where pcode=?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,pcode);
			ResultSet rs = pstmt.executeQuery();			//반환 타입이 Resultset

			if(rs.next()) {
				dto = new ProductDTO();
				dto.setPcode(rs.getString("pcode"));
				dto.setPname(rs.getString("pname"));
				dto.setPcontent(rs.getString("pcontent"));
				dto.setBstock(rs.getString("bstock"));
				
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

		return dto;

	}
	
	

}






