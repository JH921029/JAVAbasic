package day04;

//STACK
//STACK
//STACK
//STACK
//STACK
//STACK
//STACK
//STACK
//STACK


import java.util.Arrays;

public class MethodEx05 {

	public static void main(String[] args) {
		//배열의 한계점 -> 크기가 정적이다
		//stack

		push(4);
		System.out.println(Arrays.toString(arr));
		push(5);
		System.out.println(Arrays.toString(arr));
		push(6);
		System.out.println(Arrays.toString(arr));
		push(7);
		System.out.println(Arrays.toString(arr));
		

		
		int del = pop();
		System.out.println(Arrays.toString(arr));
		System.out.println(del);

	}


	static int[] arr = {1,2,3};



	//스택

	//push 특정 요소를 마지막에 추가
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

	//pop 마지막 요소를 제거(반환 - 삭제된 데이터)
	static int pop() {


		if(arr.length > 0)
		{
			//1. 삭제할 데이터를 백업
			int del = arr[arr.length-1];
			//2. 사이즈가 arr보다 -1인 사본배열 생성
			int[] temp = new int[arr.length-1];
			//3. 원본배열을 사본으로 복사(맨 마지막 데이터만 제외)
			for(int i = 0; i<temp.length; i++) {
				temp[i]=arr[i];
			}
			//4. 사본배열을 원본배열로 변경
			arr = temp;

			//5. temp 삭제
			temp = null;
			return del;
		}
		
		return 0;
	}
}























