package quiz16;

import java.util.Scanner;

public class Quiz16 {
	public static void main(String[] args) {

		int b = (int)(Math.random()*100+1); // 랜덤수
		Scanner sc = new Scanner(System.in);
		int count = 0;



		while(true) {
			
			try {

				System.out.print("정수를 입력하세요 ");
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

			} catch (Exception e) {
				System.out.println("정수만 입력!!");
				sc.nextLine();
				count++;
			}

		}




	}
}
