package day08.encap.good;

public class MainClass {

	public static void main(String[] args) {
		
		MyDate me = new MyDate();
		me.setYear(1992);
		int year = me.getYear();
		System.out.println(year);
		
		
		me.setMonth(12);
		int month = me.getMonth();
		System.out.println(month);
		
		
		me.setDay(30);
		int day = me.getDay(); 
		System.out.println(day);
		
		me.setIdCard("123456-7894561");
		String idcard = me.getIdCard();
		System.out.println(idcard);
		
	}
}
