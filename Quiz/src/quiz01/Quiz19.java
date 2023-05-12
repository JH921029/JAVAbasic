package quiz01;

import java.util.Scanner;

public class Quiz19 {

	public static void main(String[] args) {

		//어떤 금액 x가 주어졌을때
		int[] arr = {1000, 500, 100, 50, 10};


		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();


		for(int i = 0; i<arr.length; i++) {

			System.out.println(arr[i]+"원 : "+a/arr[i]+"개");
//			a=a-(arr[i]*(a/(arr[i])));
			a=a%arr[i];
		}

	}
}
