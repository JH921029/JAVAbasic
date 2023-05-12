package day04;

//QUEUE
//QUEUE
//QUEUE
//QUEUE
//QUEUE
//QUEUE
//QUEUE
//QUEUE
//QUEUE


import java.util.Arrays;

public class MethodEx06 {

	public static void main(String[] args) {
		
		for(int i = 1; i<=5; i++) {
			push(i);
			System.out.println(Arrays.toString(arr));
		}
		
		System.out.println("==============================================");
		for(int i = 1; i<=5; i++) {
				int d = pop();
				System.out.println(Arrays.toString(arr));
				System.out.println("빠진 값 : "+d);
		}
		
	}
	
	static int[] arr = {};
	
	//큐(Queue) FIFO 선입선출
	static void push(int data) {
		//1. 배열의 크기를 +1 한 새로운 배열을 만든다.
		int[] temp = new int[arr.length+1];
		//2. arr배열의 요소를 복사한다.
		for(int i = 0; i<arr.length; i++) {
			temp[i] = arr[i];
		}
		//3. 마지막에 추가
		temp[temp.length-1] = data;
		//4.원본배열을 temp로 변경
		arr=temp;
		//5.temp지움
		temp = null;
	}
	
	
	//배열의 맨 앞 요소부터 삭제 되도록 처리
	static int pop() {
		
		if(arr.length>0) {
			
			int del = arr[0];
			int[] temp = new int[arr.length-1];
			
			for(int i = 0; i< temp.length ;i++) {
				temp[i] = arr[i+1];
			}
			arr = temp;
			temp = null;
			
			return del;
			
			
		}
		
			
		return 0;
	}
}
