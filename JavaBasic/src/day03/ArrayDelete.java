package day03;

import java.util.Arrays;

public class ArrayDelete {

	public static void main(String[] args) {
		
		//배열은 삭제가 없습니다.
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int[] newArr = new int[arr.length-1];
		int index = 5;
		
		for(int i = index; i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		
		System.out.println(Arrays.toString(arr));
		for(int i = 0; i<newArr.length; i++) {
			newArr[i] = arr[i];
		}
		arr = null;
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(newArr));
	}
}
