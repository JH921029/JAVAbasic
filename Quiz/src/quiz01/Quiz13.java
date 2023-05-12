package quiz01;

import java.util.Scanner;

public class Quiz13 {

	public static void main(String[] args) {

		System.out.println("----------------------------------------------------------------------------------");
		//		1번 7~100까지 정수중에 7의 배수만 가로로 출력
		for(int a = 1; a<=100 ;a++) {
			if(a%7==0) {
				System.out.print(a+" ");
			}
		}
		System.out.println();

		for(int a = 7; a<=100 ;a+=7) {
				System.out.print(a+" ");
		}
		System.out.println();

		System.out.println("----------------------------------------------------------------------------------");
		
		//		2번 1~200까지 정수 중에 9의 배수의 갯수를 출력
		int count = 0;
		for(int a = 1; a<=200 ;a++) {
			if(a%9==0) {
				count++;
			}
		}System.out.println(count);



		System.out.println("----------------------------------------------------------------------------------");


		//		3번 50~100 두수 사이의 합
		int sum = 0;
		for(int a = 50; a<=100 ;a++) {
			sum +=a;
		}
		System.out.println(sum);

		System.out.println("----------------------------------------------------------------------------------");

		//		4번 A~Z까지 가로로 붙여서 출력, A=65, Z=90
		for(int a = 65; a<=90 ;a++) {

			System.out.print((char)a);
		}
		System.out.println();
		
		String str = "";
		for(char c = 'A'; c <= 'Z' ;c++) {
			System.out.print(c);
			str +=c;
		}
		System.out.println();
		System.out.println(str);
		
System.out.println("----------------------------------------------------------------------------------");


		//		5번 입력받은 정수의 팩토리얼 값 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 > ");
		int i = sc.nextInt();
		System.out.print(i+" 의 팩토리얼은  > ");
		int mul = 1;
		
		for(int a = 1; a<=i ;a++) {

			mul *=a;

		}
		System.out.println(mul);

		System.out.println("----------------------------------------------------------------------------------");
	}
}
