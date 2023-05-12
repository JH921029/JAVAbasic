package day08.modi.member.pac1;

public class A {
	
	//사용
	A a = new A();			//public  o
	A a2 = new A(1);		//default o
	A a3 = new A("홍길동");	//private o
	
	
	
	
	
	
	//생성자
	public A() {
		this.val1 = 1 ;
		this.val2 = 1 ;
		this.val3 = 1 ;
		
		method1();
		method2();
		method3();
		
	}
	
	A(int i) {}	
	
	private A(String s) {}

	
	
	//멤버변수 메서드
	
	public int val1;
	int val2;
	private int val3;
	
	
	public void method1() {}
	void method2() {}
	private void method3() {}
	
	

}
