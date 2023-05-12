package day04;

public class MethodEx01 {

	public static void main(String[] args) {

		/*
		 * 메서드는 생성과 호출이 있습니다.
		 * 메서드는 메서드안에서 생성 할 수 없습니다.
		 * 
		 * 
		 */
		//1~10까지 합을 구하는 반복문
	
		System.out.println("1~10까지합: "+calSum());
		
		int result = calSum();
		
		System.out.println("1~10까지합: "+result);

		
		
		calSum2();
		System.out.println("A~Z까지합: "+calSum2());
		
		
	}


	//반환유형 이름()
	//메서드 안에서 모든문법 가능
	static int calSum() {

		
		int sum = 0;
		for(int i = 1; i<=10; i++) {
			sum += i;
		}
		
		
		return sum;// 합계를 반환한다
	}

	
	static String calSum2() {
		
		//A~Z문자열 합
		String str = "";
		for(char c = 'A'; c<='Z';c++) {
			str += c;
		}
		
		return str;  //스트링은 일단 null로 반환해 놓는다.
	}

	
}

