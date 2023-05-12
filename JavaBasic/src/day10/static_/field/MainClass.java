package day10.static_.field;

public class MainClass {
	public static void main(String[] args) {
		
		Count c1 = new Count();
		c1.a++;
		c1.b++;
		
		System.out.println(c1.a);
		System.out.println(c1.b);
		
		Count c2 = new Count();
		c2.a++;
		c2.b++;
		
		System.out.println(c2.a);
		System.out.println(c2.b);
		
		
		Count c3 = new Count();
		c3.a++;
		c3.b++;
		
		System.out.println(c3.a);
		System.out.println(c3.b);
		
		//현재 c1.b 는 3입니다.
		
		System.out.println("=============");
		/*
		 * static은 클래스 밖에 1개가 생성이 되기때문에
		 * 객체생성없이 클래스이름.변수명으로 사용됩니다.
		 * 
		 */
		Count.b = 100;
		Count.b++;
		System.out.println(Count.b);
	

	}

}
