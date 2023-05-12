package quiz01;

import java.util.Scanner;

public class Quiz17 {
	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		int count1 = 0;
		int count2 = 0;

		while(true) {
			int a = (int)(Math.random()*100+1);
			int b = (int)(Math.random()*100+1);
			int i = (int)((Math.random()*2));

			
			System.out.println("-----------------------------------");
			System.out.println(a+(i == 0 ? "+" : "-")+b+"= ");
			System.out.print(" > ");
			int answer = sc.nextInt();
			System.out.println("문제를 그만 푸시려면 0을 입력하세요");
			
			int correct = i == 0 ? a+b : a-b; //정답
			
			if(answer==0) {
				System.out.println("정답횟수: "+count1);
				System.out.println("오답횟수: "+count2);
				break;
			}
			
			if(answer == correct) {
				System.out.println("정답입니다");
				
				count1++;
			} else {
				System.out.println("오답입니다");
				
				count2++;
			}
			
			
		}

	}
}
