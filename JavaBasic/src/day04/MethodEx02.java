package day04;

public class MethodEx02 {

	public static void main(String[] args) {
		
		/*
		 * 매개변수(parameter)
		 * 메서드가 전달받는 매개값
		 * 여러개 받을 수도 있고, 박지 않을 수도 있습니다.
		 * 
		 */
		int result = calSum(10);
		System.out.println("result :"+result );
		calSum(10);//calSum(여기에 맞는 정확한 값을 주면 됩니다);
		System.out.println(calSum(100));
		
		
		
		System.out.println(calSum2(5,9));
		
		
		String result4 = calSum3(5,"가");
		System.out.println(result4);
		System.out.println(calSum3(5,"문자열"));
		
	}//main 끝
	
	
	//1~매개변수까지의 합계
	static int calSum(int a) {
		
		int sum = 0;
		for(int i = 1; i <= a; i++) {
			sum += i;
		}
		
		
		return sum;
	}
	
	
	//매개변수를 2개 받음
	static int calSum2(int a, int b) {
		return a+b;		
	}
	
	
	
	//정수, 문자열을 전달받는 String calSum3() 생성
	static String calSum3(int a, String s) {
		
		String str ="";
		for(int i = 1; i<=a; i++) {
			str+=s+" ";
		}
		
		
		
		return str;
	}
	
	
	
	
}
