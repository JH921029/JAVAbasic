package quiz01;
/**
 * 백준 영수증
 * 
 * 
 */

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt(); //총금액
		int n = sc.nextInt(); //물건 수

		int i = 1;
		int j = 0;
		int sum = 0;

		while(i<=n)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();

			j = a*b;
			sum +=j;  // sum = sum + j


			i++;
		}
		if(x==sum)
		{
			System.out.println("yes");
		}else
			System.out.println("no");

	}

}

