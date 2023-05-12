package quiz06;



public class Account {

	/* 한 사람의 은행 계좌입니다.
	 * 
	 * acountNumber변수 - 식별아이디
	 * password변수 - 비밀번호
	 * balance변수 - 잔고
	 * 
	 * 생성자
	 * 3가지를 모두 받아서 초기화하는 생성자
	 * 
	 * 메서드
	 * deposit : void - 잔고에 매개변수를 누적하는 기능
	 * withDraw : void - 잔고에서 매개변수를 차감하는 기능
	 * getBalance : int - 잔고를 리턴하는 기능
	 * 
	 */

	String accountNumber;
	String password;
	int balance;
	
	Account(){
		
	}
	
	
	//생성자
	Account(String a, String pw, int bal){
		accountNumber = a;
		password = pw;
		balance = bal;

	}
	
	
	
	
	void deposit(int a) { //잔고에 매개변수를 누적
		if(a>0) {
		balance += a;
		System.out.println("변수만큼 누적"+balance);
		} else System.out.println("입금할수없습니다");
	}
	
	void withDraw(int a) { //잔고에서 매개변수 차감
		if(balance<a) {
			System.out.println("출금할수없습니다");
		}else
		balance -= a;
		System.out.println("변수만큼 차감"+balance);
	}
	
	int getBalance() { //잔고를 리턴하는 기능
		
		
		return balance;
	}
	
}

