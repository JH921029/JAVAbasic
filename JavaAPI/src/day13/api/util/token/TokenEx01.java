package day13.api.util.token;

import java.util.StringTokenizer;

public class TokenEx01 {
	public static void main(String[] args) {

		//빠른 문자열 분리
		//split() 정규표현식 활용
		//toCharArray()

		String str1 = "오늘은 날씨가 맑고, 매우 시원하지 않습니다";

		StringTokenizer token1 = new StringTokenizer(str1);
		int cnt = token1.countTokens();
		System.out.println("나눠진 문자열 갯수 : "+cnt);
		//토큰의 여부 확인
		System.out.println(token1.hasMoreTokens());


		while(token1.hasMoreTokens() != false) {

			//다음 토큰 확인
			System.out.print(token1.nextToken());
		}


		System.out.println("==================================================");



		String str2 = "2023/11/26/홍길동/010-1111-1111/www.qwer.net";

		//다양한 구분자를 한번에 지정해서 토큰화 가능
		StringTokenizer token2 = new StringTokenizer(str2, "/-");

		while(token2.hasMoreTokens()!=false) {
			System.out.println(token2.nextToken());
		}
		
		System.out.println("===============================================================");
		
		//구분자로 문자열을 나누고 구분자도 출력에 포함
		StringTokenizer token3 = new StringTokenizer(str2, "/", true);
		
		for(int i = 1;token3.hasMoreTokens();i++) {
			
			System.out.println(token3.nextToken());
		}

	}

}
