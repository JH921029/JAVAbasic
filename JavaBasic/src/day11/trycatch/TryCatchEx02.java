package day11.trycatch;

public class TryCatchEx02 {
	public static void main(String[] args) {
		//반복문에서의 예외처리
		String[] arr = {"홍","이","박"};
		
		int i =0;
		while(i < 4) {
			
			try {
				System.out.println(arr[i]);
				
			} catch (Exception e) {
				
				System.out.println("배열의 범위를 벗어남");
			} 
			
			finally {
				System.out.println("이문장은 무조건 실행되는 문장입니다.");
			}
			i++;
			
		}
		System.out.println("프로그램 정상 종료");
		
	}

}
