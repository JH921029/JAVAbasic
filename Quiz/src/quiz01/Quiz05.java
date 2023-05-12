package quiz01;

import java.util.Scanner;


public class Quiz05 {

	public static void main(String[] args) {
		/*
		 * 1. 하나의 정수를 받습니다.
		 * 2. 이 정수가 짝수인지 홀수인지 음수인지 0인지 판별하는 프로그램 코드를 작성 해봅시다.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("하나의 정수를 입력하세요 : ");
		int a = scan.nextInt();

		scan.close();
		
		if(a>0)
		{
			System.out.println("양수이고 ");
			
			if(a%2 == 0)
			{
				System.out.println("짝수입니다");
			}
			else if(a%2 != 0)
			{
				System.out.println("홀수입니다");
			}
		}
		else if(a<0)
		{
			System.out.println("음수이고");
			
			if(a%2 == 0)
			{
				System.out.println("짝수 입니다");
			}
			else if(a%2 != 0)
			{
				System.out.println("홀수 입니다.");
			}
		}
		else
		{
			System.out.println("0입니다");
		}
		/*
		 * if(a>0 && a%2 == 0)
		{
			System.out.println("양수이고 짝수 ");
		}
		else if(a%2 != 0)
		{
			System.out.println("양수이고 홀수");
		}
		else if(a<0 && a%2 == 0)
		{
			System.out.println("음수이고 짝수");
		}
		else if(a%2 != 0)
		{
			System.out.println("음수이고 홀수");
		}
		else
		{
			System.out.println("0입니다");
		}
		 */
	}

}
