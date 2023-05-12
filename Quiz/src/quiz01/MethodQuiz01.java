package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class MethodQuiz01 {

	static void method1() {
		//안녕 출력
		System.out.println("안녕");
	}	
	static String method2(String s) {
		//전달 받은 매개 변수 리턴

		return s;
	}
	static int method3(int a, int b, double c) {
		//세 매개변수 합 리턴
		return a+b+(int)c;
	}
	static String method4(int a) {
		//매개 변수가 짝수면 짝수, 홀수면 홀수 리턴
		//방법1	String s = "";
		//		
		//		if(a%2==0) {
		//			s="짝수";
		//		} else if(a%2!=0) {
		//			s="홀수";
		//		}
		//		return s;

		//방법2	if(a % 2 == 0) {
		//			return "짝수";
		//		} else {
		//			return "홀수";
		//		}

		//방법3	
		return a % 2 == 0 ? "짝수" : "홀수";



	}
	static void method5(int a, String s) {
		//매개 변수 int만큰 String반복
		String str = "";
		for(int i = 1; i<=a; i++) {
			str+=s;
		}
		System.out.println(str);
	}
	static void maxNum(int a, int b) {
		//매개변수 2개를 입력받아 큰수리턴	

		if(a>b) {
			System.out.println(a);;
		}
		else if(a<b) {
			System.out.println(b);
		}
	}
	static int abs(int a) {
		//절대값 리턴
		int b = 0;
		if(a<0) {
			b = -a;
		}else if(a>0) {
			b = a;
		}

		return b;
	}
	//return a > 0 ? a : -a;

	static String method6(char[] arr) {

		String str = "";

		for(int i = 0; i<arr.length; i++) {
			str += arr[i];
		}

		return str;
	}
	static int method7(int[] arr) {

		int sum = 0;
		for(int a : arr) {
			
			sum += a;
//		int sum = 0;
//
//		for(int i = 0; i<a.length; i++) {
//			sum += a[i];
		}

		return sum;
	}
	static String[] method8(String a, String b) {


		String[] str = new String[2];
		str[0] = a;
		str[1] = b;	

		return str;
		
		//return new String[] {a,b};
		
	}

	public static void main(String[] args) {


		method1();

		String r1 = method2("가");
		System.out.println(method2(r1));

		int r2 = method3(1,2,3);
		System.out.println(r2);

		System.out.println(method4(4));

		method5(5,"문자열");

		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자 입력 >");
		int a = sc.nextInt();
		System.out.println("두번째 숫자 입력 >");
		int b = sc.nextInt();
		maxNum(a,b);
		sc.close();

		System.out.println(abs(-10));


		//method6()
		char[] c = {'a','b','c','d'};
		String result = method6(c);
		System.out.println(result);

		//method7()
		int[] i = {1,2,3,4,5,6,7,8,9,10};
		int result2 = method7(i);
		System.out.println(result2);

		//method8()
		System.out.println(Arrays.toString(method8("가나다라마바사", "아자차카타파하")));




		
		String str = java(9);
		System.out.println(str);
	}

	static String java(int a) {

		String str = "";
		for(int i = 1; i<=a; i++)
		{
			if(i%2!=0) {
				str = str + "자";
				
			}else if(i%2==0) {
				str = str + "바";

			}
		}


		return str;
	}
}
