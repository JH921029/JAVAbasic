package day01;

public class Operator02 {
	public static void main(String[] args) {
		//2항 연산자
		int i = 7 / 3; //몫을 저장해라 2
		int j = 7 % 3; //나머지 1
		int k = 7 * 3; //21
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		
		
		
		//비교연산 <, <=, >=, >, !=
		System.out.println(i == j);  //false
		System.out.println(i <= j);  //false
		System.out.println(i >= j);  //true
		System.out.println(i < j);   //false
		System.out.println(i > j);   //true
		System.out.println(i != j);   //true
		System.out.println(k % 2 != 0); //홀수라는 표현
		System.out.println(k % 2 == 1); //홀수라는 표현
		
		
		
		//비트연산자 - 참고용
		int a = 5; // 0000 0101
		int b = 3; // 0000 0011
		
		System.out.println(a & b); // 둘다 1 이면 1 0000 0001 = 1
		System.out.println(a | b); //  1이 있으면 1 0000 0111 = 7
		System.out.println(a ^ b); // 서로 다르면 1 0000 0110 = 6

		
		//비트 쉬프트 - 참고용
		int h = 100; 
		System.out.println(h << 2);// 0000 0000 0110 0100 -> 0000 0001 1001 0000 왼쪽으로 2칸 
		
		
		
	}

}
