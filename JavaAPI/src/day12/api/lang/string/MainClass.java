package day12.api.lang.string;

import java.util.Arrays;

public class MainClass {
	public static void main(String[] args) {

		//		char[] arr = {'a','b','c'};
		//		String str = new String(arr);
		//		
		//		System.out.println(str);



		String str = "안녕하세요~";
		System.out.println(str);

		// 인덱스의 문자 반환 charAt();
		char c = str.charAt(0);
		System.out.println(c);
		System.out.println(str.charAt(1));


		//찾으면 인덱스번호를 반환, 못찾으면 -1 indexOf();
		System.out.println(str.indexOf("안")); // 0번째
		System.out.println(str.indexOf("~")); // 5번째
		System.out.println(str.indexOf("ㅋ")); // 없으면 -1

		if(str.indexOf("안녕") != -1) {
			System.out.println("문자에 값이 존재함");
		}


		//문자열 끝에서부터 값을 찾음 lastIndexOf();
		System.out.println(str.lastIndexOf("안녕"));
		
		
		//contains("문자열"); - 있으면 true, 없으면 false
		if(str.contains("안녕")) {
			System.out.println("문자의 값이 존재함");
		}
		
		
		
		//length
		System.out.println("문자열길이:"+str.length());
		
		
		System.out.println("=============================================================================================");
		
		
		//문자열 변경 replace();
		str = "자바의 기원은, 자바칩프라페치노 커피집에서 시작되었습니다.";
		
		System.out.println(str.replace("자바", "java"));
		System.out.println((str.replaceFirst("자바", "java")));
		System.out.println(str.replace(" ", "")); //공백지우기
		
		//문자열 자르기 subString();
		System.out.println((str.substring(9))); //9미만 절삭
		System.out.println(str.substring(9,18)); //9초과 17이하 추출
		
		//split();
		String[] arr = str.split(" ");   // 공백을 기준으로 문자열을 나눕니다.
		System.out.println(Arrays.toString(arr));
		
		String[] arr2 = str.split(" ",3); //최대 배열의 길이는 3
		System.out.println(Arrays.toString(arr2));
		
		
		//toCharArray(); 문자열을 한글자씩 배열에 담는다. 
		char[] arr3 = str.toCharArray();
		System.out.println(Arrays.toString(arr3));
		
		
		System.out.println("============================================================================================");
		
		//문자열의 비교
		
		//equals();
		str = "홍길동";
		System.out.println(str.equals("홍길동")); //true가 나오면 똑같다
		
		
		//compareTo();
		//사전 등재순으로 비교
		System.out.println(str.compareTo("홍길동")); // 0 은 같은문자
		System.out.println(str.compareTo("홍길하")); // str이 홍길하 보다 사전등재순 앞에 위치함
		System.out.println(str.compareTo("홍길가")); // str이 홍길가 보다 사전등재순 뒤에 위치함
		
		
		//join(); 특정 구분자로 문자열 연결 
		System.out.println(String.join("@@@","hello","world","!!!", "~~~"));
		
		
		//valueOf();  기본타입을 문자열로 변경
		System.out.println(String.valueOf(String.valueOf(1)+String.valueOf(2)));
		System.out.println(""+1+2);
	}

}

