package day09.poly.basic2;

import java.util.Arrays;

public class MainClass {
	public static void main(String[] args) {
		
		Person p = new Person("이순신",20 );
		Student s1 = new Student("홍길동", 20, "123123");
		Student s2 = new Student("홍길자", 30, "345345");
		Teacher t1 = new Teacher("박찬호", 40, "야구");
		Teacher t2 = new Teacher("손흥민", 40, "축구");
		Employee e1 = new Employee("강감찬", 50, "역사부");
		
		
		
		
		//부모타입을 활용한 배열의 다형성
		Person[] pArr = {s1, s2, t1, t2, e1};
		
		
		for(Person per : pArr) {
			
			System.out.println(per.info());
		}
		
		System.out.println("==================================================================================================================");
	
		House h = new House();
		h.inHouse(s1);
		h.inHouse(s2);
		h.inHouse(p);
		h.inHouse(t1);
		h.inHouse(t2);
		h.inHouse(e1);
		
		h.whoAreYou(e1);

	}

}
