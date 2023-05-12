package quiz01;

import java.util.Scanner;


public class Quiz06 {

	public static void main(String[] args) {

		/*
		 * if구문 밖에 선언된 변수를 잘 활용합니다.
		 *  정수 3개를 입력 받습니다.
		 *  큰값, 중간값, 작은값을 구분해서 출력 단, 같은 수는 없다
		 *  
		 */

		Scanner scan = new Scanner(System.in);

		int max = 0;
		int mid = 0;
		int min = 0;

		System.out.println("3개의 정수를 입력하세요");

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		scan.close();
		
		if(a>b && a>c)
		{
			max = a;
			if(b>c)
			
			{
				mid = b;
				min = c;
				System.out.println("max : "+max+" mid : "+mid+" min : "+min);
			}
			else
				
			{
				mid = c;
				min = b;
				System.out.println("max : "+max+" mid : "+mid+" min : "+min);
			}


		}
		if(b>a && b>c)
		{
			max = b;
			if(a>c)
			
			{
				mid = a;
				min = c;
				System.out.println("max : "+max+" mid : "+mid+" min : "+min);
			}
			else
				
			{
				mid = c;
				min = a;
				System.out.println("max : "+max+" mid : "+mid+" min : "+min);
			}
		}
		if(c>a && c>b)
		{
			max = c;
			if(a>b)
			
			{
				mid = a;
				min = b;
				System.out.println("max : "+max+" mid : "+mid+" min : "+min);
			}
			else
				
			{
				mid = b;
				min = a;
				System.out.println("max : "+max+" mid : "+mid+" min : "+min);
			}
		}
	}
}

