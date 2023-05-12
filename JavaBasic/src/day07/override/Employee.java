package day07.override;

public class Employee extends Person {
	
	String department;
	
	String info() {
		return "이름:"+name;
	}

}
