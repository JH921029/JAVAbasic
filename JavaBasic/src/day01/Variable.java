package day01;

public class Variable {
	public static void main(String[] args) {
		/*
		 * 변수의 선언방법
		 * <데이터타입> 이름;
		 * 
		 * int는 integer의 약자로 정수를 저장하는 타입
		 * 
		 * 
		 */

		int num; //선언
		num = 10; //초기화

		System.out.println(num);

		//선언과 초기화를 동시에
		int num2 = 20;
		System.out.println(num2);

		//같은 이름으로 변수를 생성 할 수 없음
		//언제든지 값을 바꿀 수 있음

		num2 = 40;
		System.out.println(num2);
		num2 = 50;
		System.out.println(num2);
		
		
		//변수에는 다른 변수의 값, 또는 연산한 결과도 저장 할 수 있다.
		int result = num + num2;
		System.out.println(result);

		//문자열 String에 저장 할 수 있다. S가 대문자인 이유는 클래스라서임 지금은 암기
		String s = "홍길동";
		
		
		int result2 = num + 20;
		result2 = 100;
		result2 = 10 + result2;
		
		System.out.println(result2);
		System.out.println(s);
		
		
		
	}

}
