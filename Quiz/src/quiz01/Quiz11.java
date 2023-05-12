package quiz01;

import java.util.Scanner;

public class Quiz11 {

	public static void main(String[] args) {
		/*
		 * 정수를 입력받습니다.
		 * 입력받은 수까지 약수의 합을 구하세요.
		 * 
		 * 예시
		 * 입력수 10
		 * 출력은 18(1+2+5+10)
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int a = 1;
		int sum = 0;
		String str = "";

		while(a<=i) {

			if(i % a == 0) {
				sum += a; 
				str += a + " ";
			}

			a++;

		}
		System.out.println(sum);
		System.out.println(str);





		//		Scanner sc = new Scanner(System.in);
		//		int a = sc.nextInt();
		//		int b = 1;  //1부터 출발이 좋습니다.
		//		int sum = 0;
		//
		//		sc.close();
		//		
		//		while(b<=a) 
		//		{
		//
		//			if(a%b == 0) 
		//			{
		//				System.out.println(b);
		//				sum = sum+b;
		//			}
		//			b++;    //++는 마지막에 하는게 좋음
		//
		//		}
		//		System.out.println("약수의 합은 : "+sum);
	}
}
