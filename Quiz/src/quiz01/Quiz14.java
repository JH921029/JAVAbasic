package quiz01;

import java.util.Scanner;

public class Quiz14 {
	public static void main(String[] args) {

		/*
		 * 1.가로와 세로길이를 입력 받습니다.
		 * 2.가로,세로 길이만큼의 사각형을 출력합니다.
		 *  ex) 5 4                                                                                         
		 *     *****                                  
		 *     *   *                                
		 *     *   *                                         
		 *     ***** 이렇게 출력해라
		 */  

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(); //    가로
		int y = sc.nextInt(); //행  세로

		for(int i = 1; i<=y; i++) {  //행 y
			for(int j = 1; j<=x ;j++) {  // i행일때 
				
//				if(i>1 && i<y && j>1 && j<x) {
//				System.out.print(" ");
//				}
//				
//				else {
//					System.out.print("*");
//				}
				
				if(i == 1 || i == y || j == 1 || j == x) {
					System.out.print("*");
				}else
					System.out.print(" ");
				
			}
			System.out.println();
		}
	}

}


