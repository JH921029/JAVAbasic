package quiz18_answer;

import java.util.Arrays;

public class ArrayQuiz01 {

	public static void main(String[] args) {
		/*
		 * arr과 arr2는 길이가 1 차이납니다.
		 * arr은 마라톤 참가자입니다.
		 * arr2는 마라톤 완주자입니다.
		 * 완주하지 못한 사람을 리턴하는 메서드를 만드세요
		 * 
		 */
		
		String[] arr = {"홍길동", "이순신","세종대왕", "신사임당"};
		String[] arr2 = {"홍길동","이순신","신사임당"};

		
		String str = test(arr,arr2);
		System.out.println(str);
	}
	
	public static String test(String[] arr, String[] arr2) {

		Arrays.sort(arr);
		Arrays.sort(arr2);
		
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		
		for (int i = 0; i < arr2.length; i++) {
			if(!arr[i].equals(arr2[i])) {
				return arr[i];
			}
		}
		return arr[arr.length -1];
	}
}