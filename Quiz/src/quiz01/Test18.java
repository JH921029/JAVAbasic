package quiz01;

import java.util.Scanner;

public class Test18 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		for(int i = 1; i<=2*a-1; i++) {
			if(i<=a) {
				for(int j = 1; j<=a-i ; j++) {
					System.out.print(" ");

				}
				for(int j = 1; j<=2*i-1 ;j++) {
					System.out.print("*");
				}
				System.out.println();

			}
			else if(i>a) {
				for(int j =1; j<=i-a; j++) {
					System.out.print(" ");

				}
				for(int j = 1; j<=2*(a-(i-a))-1 ;j++) {
					System.out.print("*");
				}
				System.out.println();
			}

		}
	}
}



