package quiz08;

public class CartMain {

	public static void main(String[] args) {
		MyCart my = new MyCart(3000);
		
		my.buy("tv");
		my.buy("computer");
		my.buy("radio");
		my.buy("tv");
		my.buy("radio");
		my.buy("tv");
		my.buy("radio");
		my.buy("tv");
	


	
		my.info();
	}
}
