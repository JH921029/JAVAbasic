package quiz13;

public abstract class Shape {
	
	
	public static final double PI = 3.14;
	
	private String name;
	
	public Shape(String name) {
		this.name = name;
	}
	
	//오버라이딩이 필요합니다
	public abstract double getArea();
	
	//name의 게터
	public String getName() {
		return "도형이름 :" + name;
	}

}
