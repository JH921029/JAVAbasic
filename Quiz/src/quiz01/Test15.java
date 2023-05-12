package quiz01;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 백준 10813
 * 
 *
 *
 */
public class Test15 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		int[] arr = new int[a];
		for(int i = 1; i<=arr.length; i++) {
			arr[i-1] = i;
		}

		System.out.println(Arrays.toString(arr));

		int temp = 0;

		int b = sc.nextInt();
		for(int i = 1; i<=b; i++) {

			int c =sc.nextInt();
			int d =sc.nextInt();

			temp = arr[c-1];
			arr[c-1] = arr[d-1];
			arr[d-1] = temp;

		}
		
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
//		System.out.print(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]);


	}
}

