package day10.final_.basic;

public class Person {

	//final변수는 반드시반드시 초기화가 되어야함
	//방법
	//1. 생성자를 통한초기화 or 2. 직접 초기화
	public final String nation="대한민국";
	public final String ssn;
	public String name;
	
	public Person(String ssn, String name) {
		this.name = name;
		this.ssn = ssn;
		
	}
	
}
