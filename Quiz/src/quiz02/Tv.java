package quiz02;

public class Tv {
	
	String company = "LG";
	int channel;
	boolean power ; //boolean 초기화 안되있으면 false입니다.
	
	/*
	 * 메서드
	 * changeChannel : int - 매개변수 x번 을 받아서 채널을 변경, 채녈을 리턴
	 * power : void - 켜져있으면 꺼지고, 꺼져있으면 켜지고 동작될수 있도록
	 * 
	 */
	
	Tv( ){
		
	}
	
	int changeChannel(int a){
		
		channel = a;
		System.out.println("채널이 "+a);
		return channel;
	}
	
	void power() {
		
		if(power)
		{
			power = false;
			System.out.println("티비가 꺼졌습니다.");
		} else
		{
			power = true;
			System.out.println("티비가 켜졌습니다.");
		}
	}
}
