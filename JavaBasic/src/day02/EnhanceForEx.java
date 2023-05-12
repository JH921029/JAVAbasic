package day02;

import java.util.Scanner;

public class EnhanceForEx {

	public static void main(String[] args) {
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		int a =  sc.nextInt();
		
		int[] arr = {1,2,3,4,5,6,7};
		String[] arr2 = {"월","화","수","목","금","토","일"};
		
		
		for(int a:arr) {
			System.out.println(a);
		}
		
		for(String a:arr2) {
			System.out.println(a+"요일");
		}
		System.out.println("-----------------------------------------------------------------------------------------------");		
		//이 값들의 합계와, 평균을 출력
		int[] score = {50,40,30,20,10};
		int sum = 0;

		for(int a:score) {
		sum+=a;
		}
		System.out.println("합 :"+sum+"평균 :"+(double)sum/score.length);
		
	}
}
