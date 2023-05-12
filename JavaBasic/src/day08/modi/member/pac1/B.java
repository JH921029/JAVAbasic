package day08.modi.member.pac1;

public class B {
	
	//사용
	A a = new A();			//public  o
	A a2 = new A(1);		//default o
//	A a3 = new A("홍길동");	//private x
	
	
	public B() {
		
//		A a = new A();   //객체생성이라고 합니다.
		a.val1 = 1 ;
		a.val2 = 1 ;
//		a.val3 = 1 ;
		
		a.method1();
		a.method2();
//		a.method3();
		
	}
	
	
	
}
