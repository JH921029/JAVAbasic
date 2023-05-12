package day02;

import java.util.Scanner;

public class ContinueEx02 {

	public static void main(String[] args) {
		
		//continue의 활용
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int sum = 0;


		x:for(int i = 1; i <= a; i++) {

			int count = 0;
			
			for(int j = 1; j<=i; j++) {
				//System.out.println(i+" "+j);

				if(i%j==0) {
					count++;
				}
				
					
				
				if( count > 2 ) continue x;  //continue활용법 약수가 2개 이상은 생략하고 for문 x로 이동
				
				
				
				
			}//end 안쪽 for문
			
			if(count==2) {
				sum+=i;	
				System.out.println(i);
			}
		}//바깥쪽 for문 end
		System.out.println("소수의 합 : "+sum);
	}
}
