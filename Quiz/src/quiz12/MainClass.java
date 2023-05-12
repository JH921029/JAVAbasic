package quiz12;

public class MainClass {
	public static void main(String[] args) {
		
		Radio r = new Radio();
		
//		r.setPrice(10000);
//		System.out.println(r.getPrice());
//		System.out.println(r.getName());
		
		
		MyCart my = new MyCart(3000);
		
		Computer com = new Computer();
		Tv tv = new Tv();
		Radio radio = new Radio();
		
		my.buy(com);
		my.buy(tv);
		my.buy(radio);
		my.buy(com);
		my.buy(tv);
		my.buy(radio);
		my.buy(com);
		my.buy(tv);
		my.buy(radio);
		
		my.info();
	}

}
