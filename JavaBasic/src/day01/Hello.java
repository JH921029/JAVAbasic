package day01;

/**
 * 2023-04-06
 * @author 이준희
 * 문서용 주석
 */
public class Hello {

	public static void main(String[] args) { //main 컨트롤 스페이스 엔터
		//\n은 줄바꿈입니다.
		/* 
		 * 여러줄 주석
		 * 
		 * 코드이동 : alt + 방향키
		 * 코드복사 : alt + ctrl + 방향키
		 * 되돌리기 : ctrl + z
		 * 전체선택 + 정렬 : ctrl + a, ctrl + i
		 * 한줄삭제 : ctrl + d
		 * 행주석 : ctrl + /
		 * 
		 */
		System.out.println("Hello...?");//ln은 줄바꿈
		System.out.print("안녕하세요\n"); //실행은 컨트롤 f11, \n은 줄바꿈
		System.out.print("반가워요"); //alt 방향키로 줄 이동 가능
		System.out.println(1);
		System.out.println("1");
		
		//개행문자 \n 가 없는 print
		System.out.print("");
		
		//개행문자를 마지막에 포함해주는 println
		System.out.println();
		
		//형식 지정 출력문 printf
		/*내가 출력하고 싶은 문자열에 구멍을 뚫어놓고 사용하는 방식
		 * 
		 * %d - 정수를 대입 할 수 있음 
		 * %f - 실수를 대입 할 수 있음
		 * %s - 문자열을 대입 할 수 있음
		 * 
		 * \t - 8칸 공백을 잡고 정렬
		 * 
 		 */
		System.out.printf("제 이름은 %s 입니다\n", "이준희");
		System.out.printf("원주율은 %.2f 입니다\n", 3.14); //.2는 소숫점 둘쩃자리 반올림이 됨
		System.out.printf("오늘은 %d일 입니다.\n",7);
		System.out.printf("제 생일은 \t %d년 %d월 %d일 입니다.",1992,10,29);
		
	
	}
}
