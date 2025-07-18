package T5_insa1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBconn {
	public Connection conn = null;
	public PreparedStatement pstmt = null;
	public ResultSet rs = null;

	String sql = "";
	
	public DBconn() {
		String url = "jdbc:mysql://localhost:3306/springgroup";
		String user = "atom";
		String password = "1234";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 검색 실패");
		} catch (SQLException e) {
			System.out.println("데이터베이스 연동 실패");
			e.printStackTrace();
		}
	}
	
	//connClose
	public void connClose() {
		try {
			conn.close();
		} catch (Exception e) {}
	}
	// pstmtClose()
	public void pstmtClose() {
		try {
			if(pstmt != null) pstmt.close();
		} catch (Exception e) {}
	}
	
	// rsClose()
	public void rsClose() {
		try {
			if(rs != null) rs.close();
		} catch (Exception e) {}

		
	}
		
}




