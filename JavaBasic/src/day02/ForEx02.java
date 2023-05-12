package day02;

import java.util.Scanner;

public class ForEx02 {
	public static void main(String[] args) {
		
		/*
		 * 입력받은 정수가 소수인지 for문으로 판별해봅시다
		 * 소수의 특징은 약수의 개수가 2개다
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("정수입력>");
		int num = sc.nextInt();
		
		int count = 0;
		
		for(int i = 1; i <= num; i++) {
			
			if(num%i == 0) {  //약수
				count++;
			}
			
		}System.out.println(count == 2 ? num + "은 소수입니다 " : num + "은 소수가 아닙니다"); //1은 소수가 아닙니다
		
		
	}

}
