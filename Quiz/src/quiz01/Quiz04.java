package quiz01;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {

		//1. 두 정수를 입력받고, 큰수를 출력하면 됩니다.
		//단, 같은 수라면 "같은 수 입니다" 출력.

		Scanner scan = new Scanner(System.in);

		System.out.println("두 정수를 입력해주세요.");

		
		System.out.print("> ");
		int a = scan.nextInt();
		System.out.print("> ");
		int b = scan.nextInt();

		scan.close();

		if(a>b)
		{
			System.out.println(a);
		}
		else if(a<b)
		{
			System.out.println(b);
		}
		else
		{
			System.out.println("같은 수 입니다");
		}

	}
}
