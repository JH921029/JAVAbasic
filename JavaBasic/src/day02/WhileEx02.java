package day02;

import java.util.Scanner;

public class WhileEx02 {
	public static void main(String[] args) {
		
		
		//1~100까지 수 중에서 짝수의 합
		
/*		int a = 2;
		int sum = 0;
		
		while(a<=100) {
			sum +=a;
			a += 2;
		}
		System.out.println(sum);
*/		

		//5를 받으면 5까지반복, 10을 받으면 10까지 반복, 1000을 받으면 1000번 반복
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 > ");
		int num = sc.nextInt();
		
		int i = 1;
		int sum = 0;
		
		
		while(i <= num){ //num번 반복
			
			if(i % 2 == 0) {
				sum += i;
			}
			
			System.out.println(i);
			i++;

		}
		
		System.out.println("1부터"+num+"까지의 짝수의 합:"+sum);
		
		
	}

}
