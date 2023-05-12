package quiz10_answer;

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
	
	
	
}
