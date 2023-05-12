package day12.api.lang.object;

public class Person extends Object implements Cloneable{

	//모든 클래스는 오브젝트를 상속받는다.
	
	private String name;
	private int age;
	
	public Person(String name) {
		
		this.name = name;
	}
	  

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	//오버라이드/implement 메서드 는 이 클래스에서 오버라이드 할 수 있는걸 나타내줌
	@Override
	public boolean equals(Object obj) {

		//멤버변수 name 이름이 같다면 true를 반환하게
		
		if(obj instanceof Person) { //obj의 형변환
			Person p = (Person)obj;
			
			if(p.getName()!=null) {
				if(p.getName().equals(this.name)) {
					
					return true;
				}
			}
		}
		
		return false;
	}




	//이 객체 안에 있는 이름을 빨리 확인하고 싶을때
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}


	@Override
	protected void finalize() throws Throwable {
	
		//객체가 사라지는 시점에서 자동으로 호출
		System.out.println(this.name+"님이 소멸되었습니다.");
		
	}


	/*
	 * 객체 복사 메서드
	 * 클로너블을 상속 받으면 사용 할 수 있다.
	 */
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	
	

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	
	
	
	
	
	
	
}
