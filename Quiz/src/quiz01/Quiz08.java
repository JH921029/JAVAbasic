package quiz01;

public class Quiz08 {

	public static void main(String[] args) {

		String[] arr = {"안녕", "hello", "오하요", "니하오", "$@#"};
		/*
		 * 랜덤수를 생성하고 이 랜덤수를 이용해서 배열에 랜덤한 값이 출력되게 합니다.
		 * 출력된 문자열이 어느 나라 언어인지 판별해서 출력해줘
		 */

		int a = (int)(Math.random()*arr.length); //5곱하면 0~4, 100곱하면 0~99 

		//System.out.println(a);
		switch (a) {
		case 0:
			System.out.println(arr[0]+"는 한국말 입니다");
			break;
		case 1:
			System.out.println(arr[1]+"는 영어 입니다");
			break;
		case 2:
			System.out.println(arr[2]+"는 일본어 입니다");			
			break;
		case 3:
			System.out.println(arr[3]+"는 중국어 입니다");			
			break;
		case 4:
			System.out.println(arr[4]+"는 알수없는 언어 입니다");						
			break;

		default:
			break;
		}
	}
}
