package quiz01;

/**
 * 백준 반복 합
 * 
 */


import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 1;
		int sum = 0;
		
		while(a<=n) {
			
			sum += a ;
			
			
			
			a++;
		}
		System.out.println(sum);
		
	}

}
