package day02;

import java.util.Scanner;

public class WhileEx04 {
	public static void main(String[] args) {
		/*
		 *입력을 받을 횟수를 지정
		 *처음 5를 입력받으면
		 *5번 입력받을 수 있도록 처리
		 *
		 * 입력받은 값들의 합
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("반복수>");
		int size = sc.nextInt();
		
		int sum = 0; //합계 누적할 변수
		int a = 1;
		while(a <= size) {
			
			System.out.println(">");
			int x =sc.nextInt();
			sum += x;
			
			
			a++;
		}
		System.out.println(sum);
	}

}
