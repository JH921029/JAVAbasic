package day04;

import java.util.Arrays;

public class MethodEx04 {
	
	static void method01(char[] c) {
		
		for(int i = 0; i<=c.length-1; i++) {
			System.out.println(c[i]);
		}	
	}
	static int[] method02() {
	
		int[] arr = new int[3];
		arr[0] =1;
		arr[1] =2;
		arr[2] =3;
		
		return arr; //배열도 리턴 널로 가능
	}
	

	public static void main(String[] args) {
		
		/*
		 * 배열을 매개변수로 전달 할 수 있을까요?
		 * 
		 * 배열을 반환유혀으로 전달 받을 수 있습니다.
		 */
		char[] arr = {'a','b','c','d','e'};
		
		method01(arr); //변수명으로 주면 됩니다.
		
		int[] result = method02();
		System.out.println(Arrays.toString(result));
	}
}
