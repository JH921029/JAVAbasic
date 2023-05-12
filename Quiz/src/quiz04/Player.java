package quiz04;

public class Player {
	
	//공통된 부분을 갖고있는 super클래스
	
	String name;
	int hp;
	int mp;
	
	void info() {
		System.out.println("케릭명:" + name);
		System.out.println("hp:" + hp);
		System.out.println("mp:" + mp);
	}

}
