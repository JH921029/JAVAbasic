package study02;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Method {

	static String method01(int a, int b) {
		String[] str = {"토요일","일요일", "월요일", "화요일", "수요일", "목요일", "금요일"}; 
		int[] arr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int day = 0;
		for (int i = 0; i < a-1; i++) {
			day+=arr[i];
		}
		String s = str[((day + b)%7)]; 
		return s;
	}
	
	static String[] method01(String str, String str2) {
		String s = str.replace(" ", "");
		String s2 = str2.replace(" ", "");
		
		String s3 = s+s2;
		String[] arr = s3.split("");
		Arrays.sort(arr);

		
		return arr;
	}
	
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("월을 입력 > ");
		int a = sc.nextInt();
		System.out.print("일 입력 > ");
		int b = sc.nextInt();
		
		System.out.println(method01(a,b));
		System.out.println("=======================");
		sc.nextLine();
		
		
		System.out.println("문자열 입력 > ");
		String s = sc.nextLine();
		System.out.println("문자열 입력 > ");
		String s2 = sc.nextLine();
		
		System.out.println(Arrays.toString(method01(s,s2)));


	}
}
