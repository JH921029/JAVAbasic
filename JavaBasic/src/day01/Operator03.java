package day01;

public class Operator03 {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		
		//if뒤에 소괄호가 true면 if중괄호 실행, false면 else문 실행
		if(x != 10 & ++y ==21) {            //&,| 연산자는 뒤에꺼를 실행해본다
			System.out.println("참 입니다");
		} else {
			System.out.println("거짓 입니다");
			
		}
		System.out.println("x값 : " + x);
		System.out.println("y값 : " + y);
		System.out.println("------------------------------------------------");
		
		if(x == 10 | ++y == 21) {
			System.out.println("참 입니다");
		}else {
			System.out.println("거짓 입니다");
		}
		System.out.println("x값 : " + x);
		System.out.println("y값 : " + y);
		System.out.println("------------------------------------------------");

		x = 10;
		y = 20;
		
		if(x != 10 && ++y ==21) {           //&&,|| 는 false인 경우 뒤에는 실행도 안한다. 두개짜리가 더 빠르다
			System.out.println("참 입니다");
		} else {
			System.out.println("거짓 입니다");
			
		}
		System.out.println("x값 : " + x);
		System.out.println("y값 : " + y);
		System.out.println("------------------------------------------------");
		
		if(x == 10 || ++y == 21) {
			System.out.println("참 입니다");
		}else {
			System.out.println("거짓 입니다");
		}
		System.out.println("x값 : " + x);
		System.out.println("y값 : " + y);
		System.out.println("------------------------------------------------");
		
		
		
	}

}
