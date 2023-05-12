package day01;

import java.util.Arrays;

public class ArrayEx {
	public static void main(String[] args) {
		
		//배열선언
		int[] arr;
		
		//배열의 생성- 생성할 당시에 크기를 지정함
		arr = new int[5];// 대괄호 안에 크기를 명시하면됩니다. arr = new int[크기];
		
		//배열의 초기화 - index를 사용하여 값을 지정
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		arr[3] = 400;
		arr[4] = 500;
		
		//배열의 사용
		System.out.println("배열의 3번째 값:" + arr[2]);
		arr[2] = 30; //값의 변경
		System.out.println("배열의 3번째 값:" + arr[2]);
		
		//배열의 모형을 문자열로 확인
		System.out.println(arr); //주소값 - 배열의 위치가 나옵니다
		
		System.out.println(Arrays.toString(arr)); //배열 5개의 값이 다 나옵니다.
		
		//배열의 길이
		System.out.println("배열의 길이:" + arr.length); //길이는 5다

		//배열의 선언과 생성을 동시에 하는 방법
		byte[] arr2 = new byte[10]; //자동으로 0으로 채워져있음
		
		//배열의 선언과 생성, 초기화까지 동시에 하는 방법
		int[] arr3 =new int[] {1,2,3,4,5,6,7}; // 같은 표현이다 int[] arr4 = {1,2,3,4,5,6,7};
		
		System.out.println(Arrays.toString(arr3));
		
		int[] arr4 = {1,2,3,4,5,6};
		System.out.println(Arrays.toString(arr4));
		
		//배열의 초기값 지정을 하지 않으면 기본값으로 초기값이 들어갑니다.
		//int = 0, double = 0.0, String = null
		
		System.out.println(Arrays.toString(arr2));
		
		//string[] arr5 = new String[7];
		String[] arr5 = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
		arr5[2] = "목요일";
		System.out.println(Arrays.toString(arr5));
		
		}
		
		

}
