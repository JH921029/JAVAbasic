package quiz11;

public class Computer {
	
	//1. 키보드, 마우스, 모니터 클래스를 저장하는 변수를 선언하세요
	private KeyBoard key;
	private Mouse mou;
	private Monitor mon;
	

	
	//2.기본생성자를 생성하고, 변수를 클래스로 초기화 하세요

	Computer(){
		this.key = new KeyBoard();
		this.mou = new Mouse();
		this.mon = new Monitor();
		
	}



	
	

	//3.KeyBoard, Mouse, Monitor를 전달받는 생성자를 생성하세요.
	public Computer(KeyBoard key, Mouse mou, Monitor mon) {
		super();
		this.key = key;
		this.mou = mou;
		this.mon = mon;
	}

	

	
	

	//4.키보드, 모니터, 마우스 정보를 출력하는 computerInfo() 메서드를 생성하세요
	void computerInfo(){
		key.info();
		mon.info();
		mou.info();
	}
	
	
	






	//5.키보드, 모니터, 마우스에 대한 getter/setter도 생성하세요
	public KeyBoard getKey() {
		return key;
	}
	
	public void setKey(KeyBoard key) {
		this.key = key;
	}
	
	public Mouse getMou() {
		return mou;
	}
	
	public void setMou(Mouse mou) {
		this.mou = mou;
	}
	
	public Monitor getMon() {
		return mon;
	}
	
	public void setMon(Monitor mon) {
		this.mon = mon;
	}
	
	
		
	
	//6.메인메서드에서 getter로 접근하여 모니터에 대한 정보를 확인하세요

	
	
}
