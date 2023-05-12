package quiz08;


public class MyCart extends Cart {

	/*
	 * 1.생성자는 money를 전달받고 money값 초기화, tv =300, com = 400, raid = 500;
	 * 
	 * 2.buy, add, info 오버라이딩
	 * 
	 * buy(상품명)기능
	 * 매개변수가 tv || computer || radio 라면 금액에서 상품가격을 차감하고, add()메서드 실행
	 * 단, 올바른 상품이 아니거나, 금액이 부족할 경우에는 적절한 처맅 
	 * 
	 * add(상품명)기능
	 * 매개변수로 넘어온 상품을 cart배열에 순서대로 담아줍니다.
	 * 단, cart배열이 꽉 찼으면, 2배 크기의 카트 배열로 옮겨주세요.
	 * 
	 * 마지막에는 info() 메서드를 호출합니다
	 * 
	 * info()는 
	 * 카트배열에 담긴 물건 목록만(null 제외)
	 */



	MyCart(int money){

		this.money = money;

	}




	void buy(String product) {
		if(product.equals("tv"))
		{	
			if(money>=300) 
			{
				this.money = money-300;
				System.out.println("300이 차감됐습니다. 잔액 : "+this.money);
				add(product);
			}
			else
			{
				System.out.println("잔액이 부족합니다");
				System.out.println("현재 잔액 : "+this.money);
			}
		}

		else if(product.equals("radio")) 	
		{	
			if(money>=500) 
			{
				this.money = money-500;
				System.out.println("500이 차감됐습니다. 잔액 : "+this.money);
				add(product);		
			}
			else
			{
				System.out.println("잔액이 부족합니다");
				System.out.println("현재 잔액 : "+this.money);
			}
		}

		else if(product.equals("computer")) 
		{	
			if(money>=400) 
			{
				this.money = money-400;
				System.out.println("400이 차감됐습니다. 잔액 : "+this.money);

				add(product);
			}
			else
			{
				System.out.println("잔액이 부족합니다");
				System.out.println("현재 잔액 : "+this.money);
			}
		}

		else
			System.out.println("올바른 상품이 아닙니다");
	}


	void add(String product) {
		if(this.i==cart.length) {

			String[] temp = new String[(cart.length)*2];

			for(int i = 0; i<cart.length; i++) 
			{
				temp[i]=cart[i];

			}
			cart=temp;

			cart[this.i] = product;

		} 
		else
			cart[this.i] = product;
		this.i++;


	}




	void info() {

		String str = "[";

		for(int i = 0; i<this.i ;i++) {
			str += cart[i] + " ";

		}
		str +="]";

		System.out.println(str);
	}
}


