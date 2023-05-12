package day09.poly.basic;


public class MainClass {
	public static void main(String[] args) {
		System.out.println("========== 부모 ============");
		Parent p1 = new Parent();
		p1.method01();
		p1.method02();
		
		System.out.println("========== 자식 =============");
		
		Child c = new Child();
		c.method01();
		c.method02();
		c.method03();
		
		System.out.println("=======자식객체를 부모에저장===========");
		Parent p = c;
		p.method01();
		p.method02();
		
		System.out.println(p); //parent
		System.out.println(c); //child
		System.out.println(p==c);//child로 생성된 자식은 원래의 객체를 유지함
		
		System.out.println("클래스 강제 형변환");
		//원본이 child로 생성되었다면, 강제 형 변환이 가능합니다.
		
		
		Parent pp = new Child();
		System.out.println(pp); //원본 child
		
		Child cc = (Child)pp; //강제 형변환
		
		cc.method01();
		cc.method02();
		cc.method03();
		
		//주의할점 => 다형성이 적용되었던 객체만 강제형변환이 가능합니다.
//		Object obj = new Object();
//		Child ccc = (Child)obj;//runtime exception 에러
		
		
		System.out.println("==========다형성의 또다른 예시===========");
		
		String str = "홍길동";
		Object ob = str;
		System.out.println(ob);
		
		String st = (String)ob;
		
		System.out.println(st);
	}

}
