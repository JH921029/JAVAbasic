package quiz01;

import java.util.Scanner;

public class Quiz10 {
	public static void main(String[] args) {
		/*
		 * 정수를 입력받습니다
		 * 입력받은 정수까지 수 중에서 3의 배수이거나, 4의 배수일 경우에는 가로로 출력
		 * 
		 * 예시
		 * 입력수 10일경우
		 * 3 4 6 8 9
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요> ");

		int a = sc.nextInt();
		int b = 1;
		String str = "";
		
		
		while(b<=a) {

			if(b % 3 == 0 || b % 4 == 0) {
//				System.out.print(b + " "); 
				str += b + " "; //문자열도 더해서 늘릴수있다.
			}
			b++;
		}System.out.println(str);



	}

}
