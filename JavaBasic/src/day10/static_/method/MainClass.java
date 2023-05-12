package day10.static_.method;

public class MainClass {
	public static void main(String[] args) {
		
		Count c = new Count();
		c.method01();
		c.method02();
		
		//static메서드의 사용(메인은 스태틱이라 스태틱 바로 호출 가능)
		Count.method02();
		
	
		//자바 안에는 static 메서드가 많이 있습니다.
		
	
	}
}