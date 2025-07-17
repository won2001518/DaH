package T02__Database_CRUD;

public class HoewonRun {
	public static void main(String[] args) {
		HoewonDAO dao = new HoewonDAO();
		
		// '홍길동' hoewon자료 검색
		HoewonVO vo = dao.getNameSearch("소나무2");
		
		System.out.println("==> 검색 결과 : ");
		if(vo != null) System.out.println("VO : " + vo);
		else System.out.println("검색한 자료가 없습니다.");
		dao.connClose();
	}
}
