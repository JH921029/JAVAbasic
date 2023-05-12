package quiz18_answer;

public class StringQuiz03 {
	public static void main(String[] args) {

		System.out.println(palindrome("기러기"));
		System.out.println(palindrome("토마토"));
		System.out.println(palindrome("스위스"));
		System.out.println(palindrome("인도인"));
		System.out.println(palindrome("23456432"));
		//회문비교 -> "다시 합창 합시다"
		/*
		      1. String palindrome(String)함수는 매개변수로 String 값을 받아, 회문 여부를 검사하는 static 메서드입니다.
		      2. 회문: 똑바로 읽으나 거꾸로 읽으나 똑같은 단어나 문장.
		      3. ex) 다시 합창 합시다, 다 같은 것은 같다, 아 좋다 좋아 등
		      4. 문장은 공백을 포함하여 받을 수 있습니다.
		      5. 회문이라면 "회문입니다", 아니라면 "회문이 아닙니다" 를 리턴합니다.
		         조건
		         빌더의 reverse() 는 금지 입니다.

		      6. 힌트)
		 * 공백은 없어져야 비교가 됩니다. 
		 * 회문은 첫글자와, 마지막글자 가 똑같습니다.
		 * 
		 */

	}

	public static String palindrome(String word) {
		
//		word = word.replace(" ","");
//		
//		for(int i = 0; i < word.length() / 2; i++) {
//			char a = word.charAt(i);//앞에서 출발하는 커서
//			char b = word.charAt(word.length()-1-i);
//			
//			if(a!=b) {
//				return "회문이 아님";
//				
//			}
//		}
//
//		return "회문이다";
		
		word = word.replace(" ","");
		StringBuilder sb = new StringBuilder(word);
		return sb.reverse().toString().equals(word) ? "회문" : "회문이아님";//반환을 보고 .을 또 찍을수 있습니다.
		
		
	}
}
