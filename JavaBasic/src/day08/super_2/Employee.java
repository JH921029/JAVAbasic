package day08.super_2;

public class Employee extends Person {
	
	String department;
	
	Employee(String name, int age, String department){
		super(name, age);
		this.department = department;
	}
	
	
	
	String info() {
		return "이름:"+name;
	}

}
