package quiz11;

public class Main {

	public static void main(String[] args) {
		
		KeyBoard key = new KeyBoard();
		Mouse mou = new Mouse();
		Monitor mon = new Monitor();
		
		Computer com = new Computer(key, mou, mon);
		com.computerInfo();
		
		//get
		Monitor m = com.getMon();
		m.info();
		
		
		
		
		
		
		Computer c = new Computer();
		c.computerInfo();
	}
}
