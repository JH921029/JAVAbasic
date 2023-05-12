package day08.modi.member.pac2;

import day08.modi.member.pac1.A;

public class C {

	//사용
	A a = new A();			//public  o
//	A a2 = new A(1);		//default x
//	A a3 = new A("홍길동");	//private x

	public C() {
		a.val1 = 1 ;		//public  o
//		a.val2 = 1 ;		//default x
//		a.val3 = 1 ;		//private x

		a.method1();		//public  o
//		a.method2();		//default x
//		a.method3();		//private x
	}
}
