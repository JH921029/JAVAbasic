package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Baek11659 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		

		int[] arr = new int[a];

		for (int i = 0; i < arr.length; i++) {
			int c = sc.nextInt();
			arr[i] = c;
		}
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < b; i++) {
			int c = sc.nextInt();
			int d = sc.nextInt();
			int sum = 0;
			for (int j = c; j < d; j++) {
				sum += arr[j];
			}
			System.out.println(sum);
		}
	}
}
