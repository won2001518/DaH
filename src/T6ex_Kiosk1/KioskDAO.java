package T6ex_Kiosk1;

import java.sql.SQLException;

public class KioskDAO extends DBconn {

	KioskVO vo = null;

	
	// 상품 중복처리?
	public KioskVO getNamesearch(String product) {
		vo = new KioskVO();
		try {
			sql = "select * from kiosk where product = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, product);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				vo.setProduct(rs.getString("product"));
				vo.setDetail(rs.getString("detail"));
				vo.setCalorie(rs.getInt("calorie"));
				vo.setPrice(rs.getInt("price"));
				}
			} catch (SQLException e) {
				System.out.println("sql오류(getNamesearch) : " + e.getMessage());
			} finally {
				rsClose();
			}
			return vo;
	}


	// 상품 등록처리
	public int setKioskInput(KioskVO vo) {
		int res = 0;
		try {
			sql = "insert into kiosk values (default,?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getPart());
			pstmt.setString(2, vo.getProduct());
			pstmt.setString(3, vo.getDetail());
			pstmt.setString(4, vo.getContent());
			pstmt.setInt(5, vo.getCalorie());
			pstmt.setString(6, vo.getImage());
			pstmt.setInt(7, vo.getPrice());
			res = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("sql오류(setKioskInput) : " + e.getMessage());
		} finally {
			pstmtClose();
		}
		return res;
	}

}
