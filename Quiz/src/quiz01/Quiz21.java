package quiz01;

import java.util.Arrays;

public class Quiz21 {

	public static void main(String[] args) {


		/**
		 * 1. 1~9까지 절대 중복되지 않는 숫자를 추출
		 *   arr를 랜덤하게 10번 섞어줍니다.
		 *   0~2번째 값을 새로운 배열로 옮겨 담아보세요
		 * 
		 */

		int[] arr1 = {1,2,3,4,5,6,7,8,9};
		int[] arr2 = new int[9];
		int temp = 0;

		
		
		for(int i = 0; i<10; i++) {
			int a = (int)(Math.random()*9);
			int b = (int)(Math.random()*9);
			
			temp = arr1[a];
			arr1[a] = arr1[b];
			arr1[b] = temp;
					
			System.out.println(Arrays.toString(arr1));
		}
		System.out.println(Arrays.toString(arr1));
		arr2 = arr1;
		System.out.println(arr2[0]+" "+arr2[1]+" "+arr2[2]);
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
	}
}
