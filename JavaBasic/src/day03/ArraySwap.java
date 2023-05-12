package day03;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySwap {

	public static void main(String[] args) {
//		
//		int x = 5;
//		int y = 10;
//		
//		int temp = 0;
//		
//		temp=y;
//		y=x;
//		x=temp;
//		
//		System.out.println("x : "+x+"  y : "+y);
		
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		//두 수를 입력받아서 두 수의 위치를 변경
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(); //0~9 사이의 값
		int b = sc.nextInt(); //0~9 사이의 값
		
		int temp = 0;
		temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		
		System.out.println(Arrays.toString(arr));
		
		
	}
	
}
