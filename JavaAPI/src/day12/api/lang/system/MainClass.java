package day12.api.lang.system;

public class MainClass {

	
	public static void main(String[] args) {
		
		//시스템 클래스는 전부 static메서드로 선언되어 있다.
		
//		System.exit(0);//프로그램 강제 종료
		
		//1970년 1월 1일 ~ 현재까지 시간을 밀리초(1000분의 1초)로 반환
		//간단한 프로그램 시간 체크
		
		long start =System.currentTimeMillis();
		
		long sum = 0;
		for(long i = 0; i < 1000000000; i++) {
			sum += i;
		}
		
		long end =System.currentTimeMillis();
		
		
		System.out.println((end - start) * 0.001);
		
	}
}
