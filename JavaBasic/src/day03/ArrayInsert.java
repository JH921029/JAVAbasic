
package day03;

import java.util.Arrays;

public class ArrayInsert {

	public static void main(String[] args) {

		int[] arr = {10,20,30,40,50};
		int[] newArr = new int[6];

		int data = 100; //중간에 추가할 값
		int targetIndex = 2;//추가 할 위치

		for(int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		
		arr = newArr;
		newArr = null;
		
		
		System.out.println(Arrays.toString(arr));

		for(int i = arr.length-1; i>targetIndex ;i--) {

			arr[i]=arr[i-1];

		}
		System.out.println(Arrays.toString(arr)); //[10, 20, 30, 30, 40, 50]


		arr[targetIndex] = data;
		System.out.println(Arrays.toString(arr));//[10, 20, 100, 30, 40, 50]
	}
}
