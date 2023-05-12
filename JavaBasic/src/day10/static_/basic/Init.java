package day10.static_.basic;

public class Init {
	
	public static int price;
	static {
		System.out.println("단 한번 실행됩니다.");
		
		price = 1000;
	}
}
