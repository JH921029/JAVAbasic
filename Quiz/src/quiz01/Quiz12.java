package quiz01;

public class Quiz12 {
	public static void main(String[] args) {

		//1000까지 정수 중에서 4의 배수이면서, 8의 배수가 아닌 수의 count(갯수)

//		int count = 0;
//		
//		
//		int i = 1;
//
//		
//		
//		while(i<=1000) {
//			if(i % 4 == 0 && i % 8 != 0) {
////			System.out.println(i);
//				count++;
//			}
//			i++;
//		}System.out.println(count);

		//50~100까지의 합계


		int a = 50;
		int sum = 0;
		int count = 0;
		
		
		while(a <= 100) {
			sum+=a;
			count++;
			a++;
		}

		
		System.out.println(sum);
		System.out.println(count);
	}

}
