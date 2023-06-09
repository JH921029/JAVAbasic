
package day10.abstract_.good;

public abstract class Store {
	
	/*
	 * 1. 메서드에 abstract를 붙이면 추상메서드 됩니다.(오버라이딩을 강제화 하고싶을때)
	 * 2. 추상메서드는 몸체가 없는 메서드 선언입니다.
	 * 3. 추상메서드 쓰고싶으면 추상클래스가 되어야 한다.
	 * 4. 추상클래스도 메서드, 생성자, 변수 전부다 가질 수 있습니다.
	 */
	
	public abstract void apple();
	public abstract void grape();
	public abstract void orange();
	public abstract void melon();
	
	
	public String name = "호식이치킨";
	public Store() {
		System.out.println("추상클래스 생성자 호출");
	}
	
	public void newMenu() {
		System.out.println("본점만 가지고 있는 신메뉴");
	}
	
	//name
	public String getName() {
		return name;
	}

}
