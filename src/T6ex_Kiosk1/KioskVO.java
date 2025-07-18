package T6ex_Kiosk1;

public class KioskVO {
	private int idx; 					//고유번호
	private String part;			//상품분류
	private String product;		//상품명
	private String detail;		//상품 간단설명
	private String content;  	//상품 상세설명
	private int calorie;			// 칼로리
	private String image;			// 상품이미지
	private int price;     		// 상품 가격
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getPart() {
		return part;
	}
	public void setPart(String part) {
		this.part = part;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getCalorie() {
		return calorie;
	}
	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "KioskVO [idx=" + idx + ", part=" + part + ", product=" + product + ", detail=" + detail + ", content="
				+ content + ", calorie=" + calorie + ", image=" + image + ", price=" + price + "]";
	}
	
}
