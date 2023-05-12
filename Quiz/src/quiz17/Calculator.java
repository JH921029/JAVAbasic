package quiz17;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Calculator ca = new Calculator();
		
		try {
			ca.input();
		} catch (Exception e) {
			System.out.println(e.getMessage());// 쓰로우뉴엑셈션만 받음
//			e.printStackTrace(); 오류를 알려줌
		}
	}


	public int input() throws Exception {
		/*
		 * 1. 정수2개를 입력(스캐너) 받아서 두 수의 합을 반환하는 기능
		 * 2. 입력된 값이 정수라면 합계를 반환
		 * 3. 예외가 발생하면, 직접예외를 생성하고 예외 메시지를 외부로 전달하면 됩니다.
		 * 4. scan.close()는 finally에서 처리하세요
		 */
		Scanner scan = new Scanner(System.in);
		
		
		try {
			//예외가 발생하면 가장 가까운 catch문으로 이동됩니다.
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			return a+b;
			
			
		} catch (Exception e) {
			
			throw new Exception("정수만 입력해줘"); //예외 생성이죠
		}
		finally {
			scan.close();
		}
	}
}