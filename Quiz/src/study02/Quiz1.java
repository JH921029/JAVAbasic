package study02;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Quiz1 {


	/*1. 복권을 구매하러 왔습니다. 구매한 복권의 번호를 출력합니다.
	    (복권 숫자는 랜덤이고 범위는 1~45 까지 입니다!)
	    (Random 클래스는 API 주제여서 사용하진 않았으나, 사용하셔도 됩니다.)

	2. 이번 주 당첨 번호를 출력하고 6,11,16,19,21,32

	3. 구매한 복권 번호와 이번 주 복권 번호를 비교해서
	   꽝인지, 당첨이 됐는지 출력해봅시다.
	   (당첨 유무 출력은 자유롭게 해주시면 됩니다!)

	4. 단, 복권을 구매할 때 수동으로 번호 3개를 지정합니다.
	    (수동으로 3개, 자동으로 3개 출력되면 됩니다.)

	    ex. lotto(3,7,10);	
	         출력시 -> [3,7,10,39,36,43]

	 */
	
	static void lotto(int a,int b, int c) {     //메인에서 입력받은 숫자 3개
		

		int[] lotto = new int[6];               //로또번호길이
		for (int i = 0; i < lotto.length; i++) {
			lotto[i]=(int)(Math.random()*45+1); //랜덤메서드로 1~45사이의 숫자를 생성해서 배열에 저장
			
			for (int j = 0; j < i; j++) {       //i번째 배열을 만들었을떄 포문을 한번 더 돌림,(0부터 i미만 인덱스 사이)
				if(lotto[i]==lotto[j]) {        //만약 i번째 배열의 숫자가 지금까지 나온 숫자중에 있다면 i--
					i--;
				}
			}

		}

		int[] pick = new int[6];                
		pick[0] = a;//입력받은 숫자
		pick[1] = b;//입력받은 숫자
		pick[2] = c;//입력받은 숫자
		
		for (int i = 3; i < pick.length; i++) {
			pick[i]=(int)(Math.random()*45+1);
			for (int j = 0; j < i; j++) {
				if(pick[i]==pick[j]) {
					i--;
				}
			}
		}

		
		
		int count = 0;                                    //당첨여부를 확인하기위한 카운트
		for (int i = 0; i < lotto.length; i++) {          //로또번호 당첨번호와 로또번호를 비교해서 같은값이 있다면 카운트 증가
			for (int j = 0; j < pick.length; j++) {
				if(lotto[i]==pick[j]) {
					count++;
				}
			}
		}

		System.out.println(Arrays.toString(lotto));
		System.out.println(Arrays.toString(pick));

		if(count==6) {
			System.out.println("1등입니다!!");
		} else if(count==5) {
			System.out.println("2등입니다!!");
		} else if(count==4) {
			System.out.println("3등입니다!!");
		} else if(count==3) {
			System.out.println("4등입니다!!");
		} else {
			System.out.println("꽝입니다");
		}

	}
	
	public static void main(String[] args) {
		lotto(3, 7, 10);


	}

}
