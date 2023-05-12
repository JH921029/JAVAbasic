package day11.inter.basic;

public interface Inter1 {

	int A = 10; //자동 상수 앞에 public static final이 자동으로 붙어서 상수 취급, 상수는 초기값 지정해줘야함
	
	//인터페이스에서 메서드를 선언하면 자동으로 추상 메서드가 됩니다.
	void method01();
	
	
	//인터페이스에는 static, default메서드 선언이 가능함
	public static void method03() {
		System.out.println("스태틱 메서드");
	}
	
	public default void method4() {      //default는 나중에 나온 문법임
		System.out.println("디폴트 메서드");
	}
}
