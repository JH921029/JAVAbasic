package day01;

public class Operator05 {
	public static void main(String[] args) {
		//프로그램에서 랜덤한 값을 발생시키느 기능
		
	    //1~10까지 랜덤한 값
		double d = Math.random() * 10;//1미만의 랜덤한 double값 Math.random
		int a = (int)d + 1 ; // int a = (int)d; 0~9,   int a = (int)d +1; 1~10
		System.out.println(a);
		
		int result = (int)(Math.random()*10+1);
		System.out.println(result);
		System.out.println("--------------------------------------------------------------");
	
		
		//삼항연산식
		             //조건 ? true면 연산1 : false면 연산2
		String s = result % 2 == 0 ? "짝수" : "홀수" ;
		System.out.println(result +" 은(는) "+s);
		
	}

}
