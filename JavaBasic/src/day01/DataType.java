package day01;

public class DataType {
	public static void main(String[] args) {
		//정수형타입
		byte a = 127;   //127까지
		byte a1 = -128; //-128까지 
		
		short b = 32767; //32767까지
		short b1 = -32768; //-32768까지
		
		int c = 2147483647; //2147483647까지
		int c1 = -2147483648; //-2147483648까지
		
		long d = 334242422222222233L; //L을 붙여줘야 롱타입이야 
		
		//2진수, 8진수, 16진수
		int bin = 010; //8진수는 앞에 0을 붙임
		System.out.println("8진수 010은 : " + bin + "입니다"); //더하기로 연걸하기 변수랑 문자열은 더하기로 붙이기
		
		int bin2 = 0b111;  //2진수
		System.out.println("2진수 111은 : " + bin2);
		
		int hexa = 0xa9;  //16진수
		System.out.println("16진수 A9는 : " + hexa);
		System.out.println("----------------------------------------------------");
		
		
		float f1 = 3.14F; //F를 붙여줘야 플롯이야
		double d1 = 3.14;
		
		System.out.println(f1);
		System.out.println(d1);
		
		float f2 = 3.14159777777f; //7자리까지 유효함
		double d2 = 3.141597777777777; //15자리까지 유효함
		System.out.println(f2);
		System.out.println(d2);

		
		System.out.println("-----------------------------------------------------");
		
		
		boolean bool1 = true;
		boolean bool2 = false;
		
		System.out.println(bool1);
		System.out.println(bool2);
		
		
		
	}

}
