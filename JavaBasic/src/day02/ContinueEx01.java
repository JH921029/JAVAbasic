package day02;

public class ContinueEx01 {

	public static void main(String[] args) {
		
		//continue는 반복문을 건너뜀
		//for문에서 증/감식으로 이동합니다.
		for(int i = 1; i <= 10; i++) {
			if(i==5) {
				continue;
			}
			System.out.println(i);
		}
		
		
		
		//while은 증감식을 만나지 못합니다.
		//while문에서 continue를 쓸려면 잘 써야합니다.
		int i = 1;
		while(i <= 10) {
			
			if(i==5) {
        //				i++;
				continue;
			}
			
			System.out.println(i);
			
			
			i++;
		}
	}
}
