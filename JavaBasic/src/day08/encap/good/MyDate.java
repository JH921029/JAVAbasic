package day08.encap.good;

public class MyDate {


	private int year;
	private int month;
	private int day;
	private String idcard;


	/*
	 *  은닉된 변수에 접근할 때, 미리 생성해놓은
	 *  getter/setter를 시용합니다.
	 * 
	 *  setter메서드
	 *  1. 값을 저장하는 용도의 메서드
	 *  2. 접근제어자닌 public으로 선언하고 이름은 (set+멤버변수명)으로 지정
	 * 
	 */

	public void setYear(int year) {

		if(year < 1900 || year > 2023) {
			System.out.println("잘못된 값 입력인데요?");
			return;
		} else {
			this.year = year;
		}

	}
	public int getYear() {

		return year;

	}
	
	/*
	 * getter메서드
	 * 1. 은닉변수의 값을 조회하는 메서드
	 * 2. 접근제어는 public, 반환유형이 있고, 이름은 get + 멤버변수명
	 * 
	 */

	public void setMonth(int month) {
		
		if(month >=1 && month<=12) {
			this.month = month;
		} else {
			System.out.println("입력이 잘못됐습니다.");
		}

	}

	public int getMonth() {

		return month;
	}


	
	
	
	public void setDay(int day) {
		
		if(day >= 1 && day<=31) {
			this.day=day;
		}
		else {
			System.out.println("입력이 잘못됐습니다.");
		}
		
	}

	public int getDay() {

		return day;
	}

	
	
	
	
	

	public void setIdCard(String idcard) {
		
		idcard = idcard.replace("-", "");
		
		if (idcard.length()!=13) {
			System.out.println("주민번호는 13자리 입니다.");
		}
		else {
			this.idcard = idcard;
		}
	}


	public String getIdCard() {

		return idcard;
	}





}
