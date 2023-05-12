package day12.api.lang.object;

import java.io.PrintStream;

public class Main {
	public static void main(String[] args) {
		
		Person p = new Person("홍길동");
		
		
		Person p2 = new Person("홍길동");
		
		
		//객체의 name변수가 같다면 true로 반환
		boolean q = p.equals(p2);//같은 객체인지 확인해주는 기능
		System.out.println(q);
		
		//toString - 주소값을 문자열로 반환
		//toString메서드는 멤버변수 값을 출력하도록 오버라이딩 많이 사용된다~
		System.out.println(p.toString());
		
		try {
			Person clonePeople = (Person)p.clone();
			
			System.out.println(clonePeople.getName());
			
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		
		//객체의 주소를 해시알고리즘을 통해 변경한 값을 반환
		int result = p.hashCode();
		System.out.println(result);
		
		PrintStream ps = System.out; // System.out은 PrintStream의 객체
		ps.println("출력");
		
		
		
	}
}

