package day02;

public class BreakEx03 {

	public static void main(String[] args) {

		//		//변수를 사용하는 방법
		//		boolean flag = false; //탈출을 위한 변수
		//
		//		for(char c = 'A'; c<='Z'; c++) {
		//
		//			for(char l = 'a'; l <= 'z';l++) {
		//
		//				System.out.println(c+" "+l);
		//
		//				if(l == 'f') {
		//					
		//					flag = true; //탈출을 위해 true로 변경 
		//					break;
		//				}
		//			}
		//			if(flag) break;
		//		}


		x:for(char c = 'A'; c<='Z'; c++) {               //x: <- for문에 이름 붙인거임(label방식)
			for(char l = 'a'; l <= 'z';l++){
				
				System.out.println(c + "-" + l);
				if(l =='f') {
					break x;
				}
			}
		}


	}

}
