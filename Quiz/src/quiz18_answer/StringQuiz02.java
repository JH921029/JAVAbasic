package quiz18_answer;

public class StringQuiz02 {
	public static void main(String[] args) {
		
		try {

			System.out.println(masking("950101-1000000"));
		    System.out.println(masking("9501012000000"));
		    System.out.println(masking("950101-5000000"));
		    System.out.println(masking("9501015000000"));
		    System.out.println(masking("950101511111"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static String masking(String ssn) throws Exception {
		ssn = ssn.replace("-", "");
		
		if(ssn.length() == 13) {
			switch (ssn.charAt(6)) {
			case '1':			
			case '3':
				System.out.println("남자");
				break;
				
				
			case '2':
			case '4':
				System.out.println("여자");
				break;

			default:
				System.out.println("잘못 입력했습니다.");
				break;
			}
		}else {
			System.out.println("주민번호는 숫자 13자리 입니다");
			throw new Exception();
		}
		
		return ssn.substring(0,6)+"-"+"*".repeat(7); //repeat()문자열 만복
	}

}
