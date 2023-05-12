package day11.trycatch;

import java.util.Scanner;

public class TryCatchEx03 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
//		
//		//next, nextInt, nextDouble, nextLine(한줄)
//		
//		System.out.println("정수>");
//		int num = scan.nextInt();
//		
//		
//		scan.nextLine(); 엔터입력을 날려주기
//		
//		
//		System.out.println("문자열>");
//		String info = scan.nextLine();
//		
//		
//		System.out.println(num);
//		System.out.println(info);
		
		while(true) {
			
			try {
				System.out.print(">");
				int num = scan.nextInt();
				
				System.out.println(num);
				
			} catch (Exception e) {
				System.out.println("숫자로 입력하실래요?");
				scan.nextLine();//처리가 안된 문자 엔터값을 대신 처리 해줍니다.
			}
		}
		
		
		
	}
	

}
