package quiz12_answer;

public class MainClass {
	public static void main(String[] args) {

		
		
		Computer c = new Computer();
		Radio r = new Radio();
		Tv t = new Tv();
		
		
		
		
		MyCart cart = new MyCart(10000);
		
		cart.buy(t);
		cart.buy(r);
		cart.buy(t);
		cart.buy(c);
		cart.buy(t);
		cart.buy(r);
		cart.buy(t);
		cart.buy(c);
		cart.buy(t);
		cart.buy(r);
		cart.buy(t);
		cart.buy(c);
		cart.buy(t);
		cart.buy(r);
		cart.buy(t);
		cart.buy(c);
		cart.buy(t);
		cart.buy(r);
		cart.buy(t);
		cart.buy(c);
		cart.buy(t);
		cart.buy(r);
		cart.buy(t);
		cart.buy(c);
		cart.buy(t);
	}
}
