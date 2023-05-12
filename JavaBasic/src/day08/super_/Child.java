package day08.super_;

public class Child extends Parent {
	
	String me;
	
	/*
	 * 부모님의 기본생성자가 없을 때 해결방안 2가지
	 * 1. 부모님의 기본생성자를 만든다. (옳지않은 방법입니다.)
	 * 2. 자식에서 super()통해서 부모님의 생성자와 강제 연결한다.
	 * 
	 */
	
	Child(String me){
		super("김씨", "이씨");
		this.me = me;
	}
	
	

}
