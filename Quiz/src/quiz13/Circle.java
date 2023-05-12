package quiz13;

public class Circle extends Shape {
	/*
	 * 원은 radius 변수를 가집니다.
	 * 원은 생성될 때 이름과, side를 받을 수 있도록 생성자 선언
	 * getArea() = 원의 넓이를 구하도록 오버라이딩
	 */
	
	int radius;

	public Circle(String name, int radius) {
		super(name);
		this.radius = radius;
	}

	@Override
	public double getArea() {
		
		return radius*radius*Circle.PI;
	}

}
