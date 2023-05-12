package day04;

public class MethodEx03 {

	public static void main(String[] args) {
		
		/*
		 * return이란
		 * 1. 메서드에서 리턴은 실행결과를 돌려주는 값에 대한 타입
		 * 2. 리턴이 있는 메서드는 다른 메서드의 매개값으로도 사용이 됩니다.
		 * 3. 반환값은 없을 수도 있습니다. 없을경우 void로 선언 합니다.
		 * 4. void 메서드도 return을 사용 할 수 있지만, 값을 돌려주지는 못하고, 종료의 의미
		 * 
		 * 
		 */
	
	int result = add( add( 1, 2 ), add( 3, 5 ) );
	System.out.println("결과 : " + result);
	
	
	sub();// void sub 호출
	div(6,3);// void div 호출
	
	

	noReturn("hello");
	
	}
	
	static int add(int a, int b) {
		return a + b;
	}
	
	//리턴이 없기때문에 호출만 가능 반환x, 매개변수x
	static void sub(){
		System.out.println("5 -3 = 2");
	}
	
	
	
	//반환x, 매개변수o
	static void div(int a, int b) {
		
		System.out.println(a/b);
		
	}
	
	static void noReturn(String s) {
		
		if(s.equals("hello")) {//문자열 비교는 s.equals() s라는 문자열이 "hello"랑 같으면 트루
			System.out.println("메서드를 종료합니다");
			return; //메서드 종료
		}
		
		System.out.println("hello를 전달해야 할껄요??");
		
	}
}
