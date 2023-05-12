package quiz12_answer;


public class MyCart {


	//1. 모든 변수와 메서드에 접근제한자를 선언하세요.
	private int money;  //잔고입니다
	private Product[] cart = new Product[1]; //상품을 저장할 배열
	private int i = 0;  //카트순서

	//2. MyCart의 생성자는 money만 받아서 초기화
	MyCart(int money){
		this.money = money;
	}
	/*
	 * 3. buy(상품들의 부모타입) : void
	 * 
	 * 가진돈과 전달된 물건의 가격을 비교해서 돈이 적으면 "금액부족" 출력후 종료
	 * 가진돈이 충분하면 물건의 가격을 money에 빼고  add(상품) 메서드를 호출
	 */ 	
	
	public void buy(Product product) {
		if(this.money < product.getPrice()) {
			System.out.println("금액부족");
			return;
		}
		
		this.money -= product.getPrice();
		
		add(product);
		
	}



	/*
	 * 4. add(상품들의 부모타입) : void
	 * 매개변수로 넘어온 상품을 cart배열에 순서대로 담아줍니다.
	 * 단, cart배열이 꽉 찼다면, 2배 크기의 카트배열로 옴겨주세요.
	 * 
	 * 마지막에는 info() 메서드를 호출합니다.
	 */
	
	private void add(Product product) {     // 중요한 기능이기 때문에 private 언선
		
		if(i == cart.length) {
			
			Product[] newArr = new Product[cart.length*2];
			for(int j = 0; j<i; j++) {
				newArr[j] = cart[j];
				
			}
			cart = newArr; //변경
			newArr = null; //초기화
		}
		
		cart[i] = product;
		i++;
//		System.out.println(Arrays.toString(cart));
		
		info();
	}

	/*
	 * 5.info()
	 * 장바구니 안에 담긴 물건의 목록(name)을 출력한다.
	 * 장바구니 안에 담긴 물건의 가격을 모두 더해서 출력

	 * 메인에서 buy메서드 실행해서 확인합니다.
	 * 
	 */
	
	public void info() {
		
		String str = "";
		int sum = 0;
		
		
		for(int j = 0; j < i ;j++) {
			
			Product p = cart[j];
			
			str += p.getName()+ " ";
			sum += p.getPrice();
		}
		
		System.out.println("목록[" + str + "]");
		System.out.println("총합[" + sum + "]");
	}
	
	

}
