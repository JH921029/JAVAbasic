package day08.encap.bad;

public class MainClass {

	public static void main(String[] args) {
		
		//변수가 public 이면 , 누구나 다 사용할 수 있고, 잘못된 값이 저장될 수도 있습니다.
		MyDate me = new MyDate();
		
		me.day = 32;
		me.month = 100;
		me.year = 2022;
		me.idcard = "이게 뭐야 ㅋ";
		
		me.info();
	}
}