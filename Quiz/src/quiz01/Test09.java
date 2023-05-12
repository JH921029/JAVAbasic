package quiz01;

import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();


		for(int i = 1; i<=n; i++) {
			//공백찍는건 똑같죠
			for(int j = 1; j <=n-i; j++) { 
				System.out.print(" ");
			}
			//별찍기
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
