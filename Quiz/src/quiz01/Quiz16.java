package quiz01;

import java.util.Scanner;

public class Quiz16 {
	public static void main(String[] args) {

		//		Scanner sc = new Scanner(System.in);
		//
		//		while(true) {
		//
		//			System.out.println("4 X 3 = >");
		//			int answer = sc.nextInt();
		//
		//			if(answer==12) {
		//				System.out.println("정답!");
		//				break;
		//			} else {
		//				System.out.println("오답!");
		//			}
		//		}


		/*
		 * updown게임
		 * 
		 * 1~100까지 랜덤한 수를 1번 생성합니다. (반복문 밖에서)
		 * 
		 * 스캐너를 통해서 값을 입력받습니다.
		 * 랜덤 수가 입력받은 값보다 작으면 "더 작은수를 입력하세요"
		 * 랜덤 수가 입력받은 값보다 크면 "더 큰수를 입력하세요"
		 * 
		 * 장답을 맞추면 시도횟수: x회를 출력하고 종료
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		int b = (int)(Math.random()*100+1); // 랜덤수

		int count = 0;
		
		System.out.print("정수를 입력하세요 ");
		while(true) {
			int a = sc.nextInt(); // 입력값
			System.out.println("------------------------");
			count++;
			
			if(a==b) {
				System.out.println("정답입니다");
				System.out.print("시도 횟수는 : > "+count);
				break;
			}
			else if(a<b) {
				System.out.print("더 큰수를 입력하세요 ");
			}
			
			else if(a>b) {
				System.out.print("더 작은수를 입력하세요 ");
			}

		}

	}
}
