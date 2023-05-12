package day02;

public class ForEx01 {

	public static void main(String[] args) {

		int sum = 0;

		for(int a = 1; a <= 10; a++) {    //for(시작; 조건; 증감){}

			sum += a;

		}
		System.out.println(sum);


		for(int a = 10; a >= 1; a--) {
			System.out.println(a);
		}

	}
}
