package quiz22;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz02 {

	public static void main(String[] args) {

		String str = "123123-1231231 GS25(치킨마요) 4,400원";
		String str2 = "123123-1231232 GS25(주부18단) 5,000원";

		String p1 = "\\d{6}-\\d{7}";
		String p2 = "[A-Z]+[0-9]+";
		String p3 = "\\(+[가-힣0-9]+\\)";
		String p4 = "[0-9,]+원";
		
		
		List<String> list = Arrays.asList(str,str2);
		
		
		for(String s : list) {
			
			Matcher m1 = Pattern.compile(p1).matcher(s);
			Matcher m2 = Pattern.compile(p2).matcher(s);
			Matcher m3 = Pattern.compile(p3).matcher(s);
			Matcher m4 = Pattern.compile(p4).matcher(s);
			
			if(m1.find() && m2.find() && m3.find() && m4.find()) {
				System.out.println(m1.group());
				System.out.println(m2.group());
				System.out.println(m3.group());
				System.out.println(m4.group());
			}
			
		}
		
		
		
		
		
		
		
		
		
		


	}
}
