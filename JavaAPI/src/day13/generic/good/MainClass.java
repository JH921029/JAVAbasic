package day13.generic.good;

public class MainClass {

	public static void main(String[] args) {
		
		//ABC abc = new ABC();
		ABC<String> abc = new ABC<String>();
		
		abc.setT("홍길동");
		String name = abc.getT();
		System.out.println(name);
		
		ABC<String> abc2 = new ABC<>();//생성자의 꺽쇠는 생략이 가능합니다.
		
		
				ABC<Object> abc3 = new ABC<Object>();
				
				
				//제네릭타입은 원시타입 x
				//<Integer>로 사용 해야합니다.
				//ABC<> abc4 = new ABC<>();
		DEF<Integer, String> def= new DEF<Integer, String>();		
	}
}
