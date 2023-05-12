package day02;

import java.util.Scanner;


public class SwitchEx02 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("정수입력 > ");
		int a = scan.nextInt();

		
		//swit ctrl + space
		//변수의 연산식이 들어갈 수 있습니다.
		switch (a/10) {
		case 9:
			
			if(a>=95) {
				System.out.println("A+");
			}
			else
				System.out.println("A");
			
			break;
		case 8:
			System.out.println("B");
			
			break;
		case 7:
			System.out.println("C");
			
			break;
		case 6:
			System.out.println("D");
			
			break;

		default:
			System.out.println("재수강");
			break;
		}
		
	}

}
