package day02;

public class SwitchEx01 {

	public static void main(String[] args) {

		int a = 10;


		//switch문장의 소괄호에는 변수나, 변수의 연산식 등이 들어갑니다.
		//타입은 정수, 문자, 문자열만 가능합니다.

		switch( a ) 
		{
		case 0:

		case 1:           //case 값 콜론
			System.out.println("1입니다");
			break;        //switch 탈출
		case 2:
			System.out.println("2입니다");
			break;        //switch 탈출
		case 3:
			System.out.println("3입니다");
			break;        //switch 탈출
		case 4:
			System.out.println("4입니다");			
			break;        //switch 탈출

		default:
			System.out.println("1~4가 아닙니다"); //if문의 else와 같다
		}
	}
}
