package quiz01;

import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("정수 입력해주세요 : ");
		int a = sc.nextInt();

		System.out.println("연산을 선택하세요 [+, -, *, /] > ");
		String c = sc.next();


		System.out.println("정수 입력해주세요 : ");
		int b = sc.nextInt();

		sc.close();


		switch (c) {
		case "+":
			System.out.println("두수의 합은 : "+(a+b));
			break;

		case "-":
			System.out.println("두수의 차는 : "+(a-b));
			break;

		case "*":
			System.out.println("두수의 곱은 : "+(a*b));
			break;

		case "/":
			System.out.println("두수의 나눈 몫은 : "+(a/b));
			break;

		default:
			System.out.println("연산자를 잘못 입력 하셨습니다.");
			break;
		}
	}
}
