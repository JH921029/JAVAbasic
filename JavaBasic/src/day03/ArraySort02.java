package day03;

import java.util.Arrays;

public class ArraySort02 {

	public static void main(String[] args) {
		
		
//		//버블정렬 - 가장느림 (큰 값을 뒤로 보낸다)
//		

		int[] arr = {5,23,1,43,200,100,40};
//		
//		//5, 1, 23, 43, 100, 40, 200 //1회전
//		//1, 5, 23, 43, 40, 100, 200 //2회전
//		//1, 5, 23 ,40, 43, 100, 200 //3회전
//		
//		//바깥 반복문의 회전수
//		//안쪽반복문이
//		
//		for(int i = 0; i<arr.length-1; i++) {
//			for(int j = 0; j<arr.length-1; j++) {
//				System.out.println(i+" "+j);
//				if(arr[j] > arr[j+1]) {
//					
//					int temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1]= temp;
//				}
//			}
//		}System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr); //정렬 해줍니다. 가장 빠른 정렬
		System.out.println(Arrays.toString(arr));
	}
}
