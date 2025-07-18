package T6ex_Kiosk1;

import java.sql.SQLException;

public class KioskDAO extends DBconn {

	KioskVO vo = null;

//	 상품 가입처리
	public int actionPerformed(KioskVO vo) {
		int res = 0;
		try {
			sql = "insert into burgerking values (?,?,?,?,?,default,?)";
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return res;
	}
	
	
	// 상품 중복처리?
	public KioskVO getNamesearch(String product) {
		vo = new KioskVO();
		try {
			sql = "select * from burgerking where product = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(2, product);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				vo.setProduct(rs.getString("product"));
				vo.setDetail(rs.getString("detail"));
				vo.setCalorie(rs.getInt("calorie"));
				vo.setPrice(rs.getInt("price"));
				}
			} catch (SQLException e) {
				System.out.println("sql오류(getNameSearch) : " + e.getMessage());
			} finally {
				rsClose();
			}
			return vo;
	}

}
