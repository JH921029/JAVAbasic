package day08.encap.obj;

public class MainClass {

	public static void main(String[] args) {
		
		Hotel h = new Hotel();
		
		Chef c = h.getChef();//Hotel 안에 있는 Chef를 꺼냄
		c.cooking();
		
		
		//Chef를 생성해서 Hotel한테 전달
//		Chef chef = new Chef();
//		h.setChef(chef);               같은말입니다.
		h.setChef(new Chef());
	}
}
