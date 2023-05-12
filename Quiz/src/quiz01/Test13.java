package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Test13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		int[] arr = new int[9];
		int max = arr[0];
		int index1 = 0;

		for(int i = 1; i<=9; i++) {

			int a = sc.nextInt();
			arr[i-1] = a;

		}
		
		
		int min = arr[0];  //
		int index2 = 0;
		
		
		System.out.println(Arrays.toString(arr));

		for(int i =1; i<10; i++) {
			if(arr[i-1]>max) {
				max=arr[i-1];
				index1=i;
			}
		}

		for(int i =1; i<10; i++) {
			if(arr[i-1]<min) {
				min=arr[i-1];
				index2=i;
			}

		}
		System.out.println(max);
		System.out.println(index1);
		System.out.println("-------------");
		System.out.println(min);
		System.out.println(index2);

	}

}


