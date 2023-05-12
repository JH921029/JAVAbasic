package day02;

public class MultiForEx01 {

	public static void main(String[] args) {

		
		//바깥 9, 안쪽 9
//		int count = 0;
//		for(int i = 1; i <= 9; i++) {
//			
//			for(int j = 1; j<=9; j++) {
//				
//				System.out.println("i = "+i+" j = "+j);
//				count++;
//			}
//		}
//		System.out.println(count);
		
		
		
		//2단부터 9단까지 구구단을 전부다 찍어봅시다
		
		for(int i = 2; i <= 9; i++) { //구구단의 단을 나타내는 숫자
			
			System.out.println("구구단 : "+i+"단"); //단의 시작
			for(int j = 1; j <= 9; j++) {
				
				System.out.println(i+" X " +j+ " = "+i*j);
			}
			System.out.println("-------------------------------");
		}
		
		
	}
}
