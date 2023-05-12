package day11.trycatch;

public class ThrowsEx02 {

	public ThrowsEx02() throws Exception {  
		System.out.println("생성자 시작");
		aaa();
		System.out.println("생성자 종료");
	}
	
	public void aaa() throws Exception {
		System.out.println("aaa 시작");
		bbb();                  //생성자로 던져
		System.out.println("aaa 종료");
		
	}
	
	public void bbb() throws Exception {
		System.out.println("bbb 시작");
		
		System.out.println(10/0); //오류다 aaa로 던져
		
		System.out.println("bbb 종료");
//		try {
//			System.out.println(10/0);  //
//			
//		} catch (Exception e) {
//			System.out.println("예외처리 끝");
//
//		}
//		System.out.println("bbb 종료");
	}
	
	
	public static void main(String[] args) {
		
		try {
			ThrowsEx02 th = new ThrowsEx02();
			
		} catch (Exception e) {
			System.out.println("예외처리 끝");
		}
		
		
	}
}
