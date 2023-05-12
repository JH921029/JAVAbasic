package day07.overload;

public class Basic {
	
	void input(int a) {
		System.out.println("정수 1");
	}
	void input(String a) {
		System.out.println("문자열 1");
	}

	void input(int a, double b) {
		System.out.println("정수 1 실수 1");
		
	}
	
	void input(double a, int b) {
		System.out.println("실수 1 정수 1");
		
	}
	
	void input(int a, char b, double c) {
		System.out.println("정수 1 문자 1 실수 1");
		
	}
	
	
}