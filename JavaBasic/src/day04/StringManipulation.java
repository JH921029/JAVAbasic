package day04;

import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args) {
		//문자열다루기
		//문자열은 사실 배열입니다.

		String str = "안녕하세요~ 영어로하면 하이!";

		//문자열을 다루는 다양한 메서드를 제공

		char c = str.charAt(5);//문자열 한글자 자르기
		System.out.println(c);


		int idx = str.indexOf("하");  //indexOf가 -1을 반환하면 문자가 없다, 앞에서부터 첫번쨰 문자열 하의 위치
		System.out.println("문자의 위치 : "+idx);

		int lastIdx = str.lastIndexOf("하");// 뒤에서부터 첫번째 문자열 하의 위치
		System.out.println(lastIdx);

		//문자열 변환 toUpperCase, toLowerCase
		String s = "abcDEF";
		String result = s.toLowerCase();//대문자를 소문자로
		System.out.println(result);;
		System.out.println(s);//**********주의 원본은 안변합니다.********************

		String result2 = s.toUpperCase();//소문자를 대문자로
		System.out.println(result2);
		System.out.println(s);

		System.out.println("===========================================================================================");
		//문자열 변경 replace
		s ="abcdefaaa";

		String result3 = s.replace("a", "x");
		System.out.println(result3);

		System.out.println(s);

		String result4 = s.replaceFirst("a","x");
		System.out.println(result4);

		System.out.println("===========================================================================================");

		//공백제거 trim
		str = "    010-1222-1333    ";
		String result5 = str.trim(); //앞뒤 공백을 제거해서 반환
		System.out.println(result5);

		str = " 안녕하세요? 오늘은 4월 19일 입니다.  ";
		str = str.replace(" ", "");
		System.out.println(str);

		System.out.println("===========================================================================================");


		//문자열 자르기
		//substring - 인덱스 기준으로 자름

		str = "010-1111-2222";
		String result6 =str.substring(9); //length까지 자름
		System.out.println(result6);



		String result7 = str.substring(4, 8); //4< str.length <=8
		System.out.println(result7);

		System.out.println(str);//원본은 변화없음


		//split - 특정 문자를 기준으로 자름(제대로 사용하려면 정규표현식)

		String[] arr = str.split("-");
		System.out.println(Arrays.toString(arr));

		String[] arr2 = str.split("");
		System.out.println(Arrays.toString(arr2));  //String 배열



		//toCharArray - 한글자씩 char형으로 자름
		char[] arr3 = str.toCharArray();
		System.out.println(Arrays.toString(arr3));  //char 배열
		System.out.println("===========================================================================================");


		//문자열의 길이
		str = "안녕하세요";
		int len = str.length();
		System.out.println("문자열 길이: "+len);



		//문자열의 비교 equals()
		if(str.equals("안녕하세요")) {
			System.out.println("두 문자가 같음");
		}else
		System.out.println("두 문자가 다름");

		
		
		//문자열의 포함여부 contains()
		if(str.contains("녕")) {
			System.out.println("얍얍");
		}else
			System.out.println("놉");
	}
}