package day01;

public class Casting03 {
	public static void main(String[] args) {

		char c = 'C';
		int i = 2;

		//1.서로 다른 타입의 연산에서 큰 타입에 맞추어 자동 형변환이 됩니다.
		char cc= (char)(c+i);
		System.out.println(cc);

		int ii = c + i;
		System.out.println(ii);

		//2.int형보다 작은 타입의 연산의 결과는 무조건 int
		byte b1 = 100;
		byte b2 = 10;
		byte b3 = (byte)(b1 + b2);//32나 64비트 연산만 가능하고 8비트는 계산 못해서 바이트를 인트로 바꿔서 계산을 하기때문에 byte에 못들어감 굳이 넣을려면 저렇게해


		short s1 = 100;
		byte b = 10;
		short s2 = (short)(s1 + b);
		System.out.println(s2);



	}

}
