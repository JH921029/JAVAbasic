package quiz01;

import java.util.Scanner;

public class MethodQuiz02 {
	
	static void show() {
		
		System.out.println("두 수의 합을 구합니다.");
	}
	
	
	
	static int input() {
		
		System.out.print("정수의 입력> ");
		Scanner sc = new Scanner(System.in);     //메서드로 만들어서 두번 호출
		int a = sc.nextInt();
		
		return a;
	}
	
	
	
	static int add(int a, int b) {
		int result = a+b;
	
		
		return result;
	}
	
	
	static void print(int a) {
		System.out.println("두수의 합은 : "+a);
	}
	
	
	
	
	public static void main(String[] args) {
		
//		/*
//		 * 정수 2개를 받아서 합을 출력하는 문장
//		 * 
//		 */
//		System.out.println("두 수의 합을 구합니다");  //show()로 출력
//		
//	
//		//반환은 있고, 매개변수는 없는 메서드 input() 두번출력
//		Scanner sc = new Scanner(System.in);     //메서드로 만들어서 두번 호출
//		System.out.print("정수입력>");
//		int num1 = sc.nextInt();
//		
//		
//		System.out.print("정수입력>");
//		int num2 = sc.nextInt();
//		
//		//add()
//		int result = num1 + num2;
//		
//		//매개변수로 result를 받아서 단순히 출력하는 메서드 print()
//		System.out.println("두 수의 합 : "+result);
		
		show();
		
		int a = input();
		int b = input();
			
		int result = add(a,b);
	
		print(result);
	}

}
