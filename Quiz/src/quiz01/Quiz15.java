package quiz01;

import java.util.Scanner;

public class Quiz15 {

	/*
	 * 1.입력받은 a수까지의 소수들의 합 중첩반복문으로
	 *  입력이 7이면 바깥 반복문은 7까지 회전 합니다.
	 * 
	 * 
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int sum = 0;


		for(int i = 1; i <= a; i++) {

			int count = 0;
			
			for(int j = 1;j<=i; j++) {
				//System.out.println(i+" "+j);

				if(i%j==0) {
					count++;
				}
			}//end 안쪽 for문
			
			if(count==2) {
				sum+=i;	
				System.out.println(i);
			}
		}//바깥쪽 for문 end
		System.out.println("소수의 합 : "+sum);

	}
}
