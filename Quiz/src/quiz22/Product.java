package quiz22;

public class Product {
	
	private String day;
	private String store;
	private String grade;
	private String detail;
	private String price;
	
	
	
	public Product(String day, String store, String grade, String detail, String price) {
		super();
		this.day = day;
		this.store = store;
		this.grade = grade;
		this.detail = detail;
		this.price = price;
	}
	
	
	
	public final String getDay() {
		return day;
	}
	public final void setDay(String day) {
		this.day = day;
	}
	public final String getStore() {
		return store;
	}
	public final void setStore(String store) {
		this.store = store;
	}
	public final String getGrade() {
		return grade;
	}
	public final void setGrade(String grade) {
		this.grade = grade;
	}
	public final String getDetail() {
		return detail;
	}
	public final void setDetail(String detail) {
		this.detail = detail;
	}
	public final String getPrice() {
		return price;
	}
	public final void setPrice(String price) {
		this.price = price;
	}
}
