package quiz10;

public class User {

	private String name;
	private int rnn;
	private int age;

	
	User(){
	}
	
	User(String name, int rnn, int age){
		
		this.name = name;
		this.rnn = rnn;
		this.age = age;
		
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setRnn(int rnn) {
		this.rnn = rnn;
	}
	
	public int getRnn() {
		return rnn;
	}
	
	public void setAge(int age) {
		this.age = age;
		
	}
	
	public int getAge() {
		
		return age;
	}
	
	public String toString() {   //toString 오버라이딩해서 출력해야 참조변수 객체 출력가능???
		
		return name+" "+rnn+" "+age;
	}
	
	
}
