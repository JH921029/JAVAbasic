package day11.inter.basic3;

public class MainClass {
	public static void main(String[] args) {
		Printed pt = new Lg();// 인터페이스 타입으로 저장저장저장입니다.
		
		pt.print("hello world");
		pt.colorPrint("hello world2", "파란색");
		int result = pt.copy(5);
		
		new Samsung();
	}

}
