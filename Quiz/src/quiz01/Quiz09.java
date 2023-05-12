package quiz01;

import java.util.Scanner;

	public class Quiz09 {
		public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		System.out.println("정수를 입력하세요 : ");
		int N = sc.nextInt();
		System.out.println("구구단 "+N+"단");

		int b = 0;

		sc.close();
		while(b<9) {
			b++;
			System.out.println(N+" X "+b+" = "+N*b);

		}

	}
}
