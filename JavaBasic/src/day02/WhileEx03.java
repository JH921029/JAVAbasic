package day02;

import java.util.Scanner;

public class WhileEx03 {

	public static void main(String[] args) {
		//어떤 수를 입력받아서 입력받은 수가 소수인지 판별

		Scanner sc = new Scanner(System.in);
		System.out.println("판별할 소수를 입력 > ");
		int num = sc.nextInt();


		//간단한게 제일 좋다 
		int i = 2;

//		if(num==1) {
//			System.out.println(num+"은 소수입니다");
//		}else

		{
			while(num % i != 0) {

				i++;
			}
			System.out.println(num == i ? i+"는 소수입니다" : "소수가 아닙니다");
		}
	}

}
