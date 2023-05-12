package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		int[] arr = new int[i];
		
		int a = 1;
		
		int sum = 0;
		while(a<=i) {
			
			
			System.out.println(a);
			sum += a;
			arr[a-1] = a;
			
			a++;
			
			//a가 11이 되지만 10번 반복이 끝
		}
		System.out.println(sum);
		System.out.println(Arrays.toString(arr));

//		int i = 1;
//		int sum = 0;
//		while(i <= 10) {
//		
//			if(i % 2 == 0) {  //짝수 2로 나눴을때 0
//				sum += i;
//				
//			}
//			i++;
//		}
//		System.out.println(sum);
		
	}
}
