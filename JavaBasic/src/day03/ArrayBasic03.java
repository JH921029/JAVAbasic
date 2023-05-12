package day03;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayBasic03 {

	public static void main(String[] args) {
		
		//크기가 100인 배열에 1~100까지 수를 저장해봅시다
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<arr.length; i++) {
			
			int a = sc.nextInt();
			
			arr[i]=a;
					
		}
		System.out.println(Arrays.toString(arr));

	
	}
}
