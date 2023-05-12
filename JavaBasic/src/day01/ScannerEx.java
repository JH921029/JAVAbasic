package day01;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		//자바의 입력
		Scanner scan = new Scanner(System.in);
		

		//스캐너가 가지고 있는 입력기능을 사용해서 데이터를 입력받음
		System.out.print("이름을 입력하세요 :"); 
		
		String name = scan.next(); //입력받을 값을 name에 저장 하겠다 next 문자열을 받는다 문자열 입력값
		System.out.println("입력값의 이름은 :"+name);
		
		
		System.out.print("나이를 입력하세요");
		int age = scan.nextInt();         //인트형 입력값 (정수)
		System.out.println("입력한 나이는 :"+age);
		
		System.out.println("키를 입력하세요");
		double tall = scan.nextDouble();  //더블형 입력값 (실수)
		System.out.println("입력한 키는"+tall);

		System.out.println("\n이름 : " + name + "\n나이 : " + age + "\n신장 : " + tall);
		
		scan.close(); //스캐너 자원해제
	}
}
