package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(); // 정수 갯수
		
		int[] arr = new int[a];
		
		for(int i = 1; i<=a; i++) {
			int b = sc.nextInt();
			arr[i-1] = b;
		}
		//System.out.println(Arrays.toString(arr));
		System.out.println(arr[1]);

	}

}
