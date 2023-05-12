package quiz01;

/**
 * 백준 10871
 */

import java.util.Scanner;

public class Test12 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();  //배열 갯수
		int b = sc.nextInt();  //입력값
		
		int[] arr = new int[a];
		
		for(int i = 1; i <= a; i++) {
			int c = sc.nextInt();  //배열을 채울 숫자
			arr[i-1]=c;
			
		}
//		System.out.println(Arrays.toString(arr));
		
		for(int i = 1; i <= arr.length; i++) {
			
			
			if(arr[i-1]<b) {
				System.out.print(arr[i-1]+" ");
			}
		}
	}

}
