package day16.api.regex;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx02 {
	public static void main(String[] args) {
		/*
		 * [0-9]{2,4} 숫자중 2~4개 연속듼 형태
		 * [0]{3} 0~9숫자중 3개 연속된 형태
		 * [A-Z]+ 대문자 한개이상
		 * [a-zA-Z]? 알파뱃 0~1개 나오는 경우
		 * [가-힣]* 한글 0회 이상
		 * 
		 * 정규표현식에 속하지 않는 문자는 그냥 사용할 수 잇습니다.
		 * [0-9]{3}-[0-9]{4} 숫자3개-숫자4개 나오는 형태
		 * 정규표현식에 포함되는 문자를 스고 싶다면
		 * \\+ \가 한개 이상
		 * \?+ ?가 한개 이상
		 * 
		 * 정확히 일치하는 문자
		 * \?. 정확히 ?에 일치하는
		 * [0-9]{3}원 000원 형식을 찾음
		 * \\d  [0-9]와 같은 의미
		 * \\w [a-zA-Z]와 같은 의미
		 * 
		 */
		
		String info = "홍길동/주소/02-123-4567/aaa123@naver.com";
		String info2 = "이순신/주소/010-1234-1234/bbb123@gmail.com";
		
		
		//전화번호형식
		String pattern1 = "\\d{2,3}-\\d{3,4}-\\d{4}";
		//이메일 형식 (숫자문자@문자.문자)
		String pattern2 = "[a-zA-Z0-9]+@[a-z]+.[a-z]+";
		
		//페턴을 컴파일
		Pattern p = Pattern.compile(pattern1);
		Pattern p2 = Pattern.compile(pattern2);
		
		
		//찾는 작업
		Matcher m = p.matcher(info2);
		Matcher m2 = p2.matcher(info2);
		//
		
		
		//find()-일치하는 부분이 있다면 true
		//start()-일치하는 부분의 첫번째 인덱스
		//end()-일치하는 부분의 마지막 인덱스
		//group()-일치하는 부분의 추출
		
		while(m.find()) {//while로하는 이유는 같은 패터이 나오면 여러번 찾기 위해서 입니다.
			
			System.out.println("첫번째인덱스:"+m.start());
			System.out.println("마지막인덱스:"+m.end());
			System.out.println(m.group());
		}
		
		if(m2.find()) {//while로하는 이유는 같은 패터이 나오면 여러번 찾기 위해서 입니다.
			
			System.out.println("첫번째인덱스:"+m2.start());
			System.out.println("마지막인덱스:"+m2.end());
			System.out.println(m2.group());
		}
		
		System.out.println("============================================================================");
		List<String> list = Arrays.asList(info, info2);
		System.out.println(list.toString());
		
		for (int i = 0; i < list.size(); i++) {
			
			String str = list.get(i);
//			//패턴생성
//			Pattern x = Pattern.compile(pattern1);
//			Matcher y = x.matcher(str);
			
			Matcher x = Pattern.compile(pattern1).matcher(str);
			Matcher y = Pattern.compile(pattern2).matcher(str);
			
			if(x.find() && y.find()) {
				
				System.out.println(x.group());
				System.out.println(y.group());
				
			}
		}
		
		
		
	}

}
