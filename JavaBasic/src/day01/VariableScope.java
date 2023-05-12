package day01;

public class VariableScope {
	public static void main(String[] args) {
		//변수는 중괄호 안에서 선언되고, 중괄호 안에서만 유효합니다.
		
		
		// int num1 = 10, int num2 = 20; 같은표현
		int num1 = 10;
		int num2 = 20;
		int num4 = 0;
		
		if (true) {
			int num3 = num1 + num2;
			System.out.println(num3);
			num4 = 1000;
			
		}
		
        //System.out.println(num3); if문 중괄호 밖이라서 num3은 사용불가 새로 선언은 가능
		System.out.println(num4);
	}
}
