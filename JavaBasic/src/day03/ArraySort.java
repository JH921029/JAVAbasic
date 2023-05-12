package day03;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		
		//배열을 정렬 = 정렬은 대략 6개
		//선택 정력
		int[] arr = {5,23,1,43,200,100,40};
		
		//바깥반복문은 회전수
		//안쪽 반복문은 비교할 값
		
		/*
		 * 1, 23, 5, 43, 200, 100, 40
		 * 1, 5, 23, 43, 200, 100, 40 
		 * 1, 5, 23, 43, 200, 100, 40
		 * 1, 5, 23, 40, 200, 100, 43
		 * 1, 5, 23, 40, 42, 200, 100
		 * 1, 5, 23, 40, 42, 100, 200
		 */
		
		
		
		for(int i = 0; i < arr.length-1; i++) {  //0~5까지  
			
			for(int j = i+1; j < arr.length; j++) {
//				System.out.println(i +" "+j);
				
				if(arr[i]>arr[j]) { //비교대상이 작다면, swap 오름차순             arr[i]<arr[j] 면 내림 차순

					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
				
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}
}
