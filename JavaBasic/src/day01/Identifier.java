package day01;

public class Identifier {
	
	public static void main(String[] args) {
	
		//대소문자를 구분함
		int age = 27;
		int Age = 28;
		
		System.out.println(age);
		System.out.println(Age);
		
		//숫자로 시작 할 수 없음
		
		int num4 = 10;
		System.out.println(num4);
		
		//카멜표기법
		int phonenumber = 10; // X
		int phoneNumber = 10; // O
		
		System.out.println(phonenumber+phoneNumber);
		//키워드로는 이름을 못 지음 ex) int class
	}
}
