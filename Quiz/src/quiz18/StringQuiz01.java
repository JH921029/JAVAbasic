package quiz18;

import java.util.Scanner;

public class StringQuiz01 {

	public static void main(String[] args) {
		/*
		 * 스캐너르 사용해서 id를 입력받습니다.
		 * 아이디는 공백을 포함해서 받을 수 있습니다. nextLine();
		 * 
		 * 단, 공백을 제거한 아이디가 5글자 미만이면 다시 입력받습니다.
		 * 5글자 이상이라면 "id가 등록되었습니다." 출력후 종료
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		while(true) {

			String str = sc.nextLine(); //공백도 들어갈수있다

			if((str.replace(" ","")).length()>=5) {
				System.out.println("id가 등록 되었습니다.");
				break;

			}else 
				System.out.println("다시 입력해주세요");
		}
	}
}
