package quiz04;

public class Main {
	public static void main(String[] args) {
		Warrior w = new Warrior("전사");
		Wizard wi = new Wizard("마법사");
		
		System.out.println("==========================");
		w.info();
		w.bash();
		w.info();
		
		
		System.out.println("==========================");
		wi.info();
		wi.iceArrow();
		wi.info();
		
		
		
	}

}
