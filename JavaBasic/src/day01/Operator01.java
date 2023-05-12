package day01;


public class Operator01 {
	public static void main(String[] args) {
		
		//부호연산자 +, -
		int i = -3;
		int j = -i; //j는 3
		
		
		//증감연산자 ++, --
		int k = 1;
		int h = ++k; //전위연산 - 먼저 값을 증가시키고, 마지막에 대입
		
		System.out.println("k는 : "+k); //2
		System.out.println("h는 : "+h); //2
		
		int x = 1;
		int y = x++; //후위연산 - 대입을 먼저하고, 자신을 증가시킴
		
		System.out.println("x : "+x); //2    
		System.out.println("y : "+y); //1   1을 y에 먼저넣고 x를 1 증가시킴
		
		x = 1;
		x++;
		++x;
		
		x = 1;
		System.out.println(++x); //2   1을 더하고 2를 출력함
		System.out.println(x++); //2   2를 먼저 출력하고 1을 더했음
		
		System.out.println(x); //3
		
		
		byte b = 10;
		
		System.out.println(~b+1); // -10 뒤집고 1 더하면 보수가 된다.
		
		System.out.println("---------------------------------------------------");
		
		//!논리연산자 - 부정의 의미(not)
		boolean bool = !true;
		System.out.println(bool);   //false
		System.out.println(!bool);  //true

	}

}
