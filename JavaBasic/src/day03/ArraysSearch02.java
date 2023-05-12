package day03;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysSearch02 {
	public static void main(String[] args) {
		
		//이진탐색 - 반을 분할해서 찾아가는 방법
		//조건 - 순서대로 렬 돼있어야 한다
		/*
		 * 1. 포인터(start, end)를 처음과 끝에 2개를 배치
		 * 2. 중간값을 구함
		 * 3. 중간이 찾는 값인지 확인
		 * 4. 중간값이 찾는값보다 크면, end를 중간값 -1 로 내린다
		 * 5. 중간값이 찾는값보다 작으면, start를 중간값 +1로 올린다
		 */
		
		int[] arr = {1, 3, 5, 10, 20, 30, 50, 80, 100};
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("찾을값> ");
//		int find = sc.nextInt();
//		
//		int start = 0;         // 시작 인덱스
//		int end = arr.length-1;// 마지막 인덱스
//		int count = 0;
//		
//		
//		while(start <= end) {
//			count++;
//
//			
//			//중간값
//			int mid = (start + end)/2;
//			
//			if(arr[mid] == find) {
//				System.out.println("회전수:"+count);
//				System.out.println("찾을 값은:"+mid+"번째 존재합니다.");
//				break;
//			}
//			
//			
//			//찾을값이 중간값보다 큰경우
//			if(arr[mid] < find) {
//				start = mid+1;
//			} else {
//				end = mid - 1;
//			}
//			
//			
//		}
//		if(start > end) {
//			System.out.println("찾는값이 없습니다.");
//		}
//		
		
		System.out.println(Arrays.binarySearch(arr, 25));
			
	}

}
