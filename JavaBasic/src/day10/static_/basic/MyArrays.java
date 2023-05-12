package day10.static_.basic;

public class MyArrays {

	/*
	 * Arrays클래스에 toString메서드 똑같이 만들기
	 * 
	 * 1.외부에서 객체 생성하지 못하도록 생성자에 접근제어자를 붙입니다.
	 * 2.printArray() 메서드 생성하는데, 배열을 매개변수로 받아서 toString처럼 리턴 되도록
	 * 	메서드 오버로딩 (String) (int) (char) 복붙
	 * 
	 * 
	 */

	static String printArray(String[] arr){

		String str = "[";

		for(int i = 0; i < arr.length; i++) {
			if(i==arr.length-1) {
				str = str + arr[i];
			}else if(i<arr.length-1) {
				str = str + arr[i]+", ";
			}
		}

		str = str + "]";

		return str;
	}
	static String printArray(char[] arr){

		String str = "[";

		for(int i = 0; i < arr.length; i++) {
			if(i==arr.length-1) {
				str = str + arr[i];
			}else if(i<arr.length-1) {
				str = str + arr[i]+", ";
			}
		}

		str = str + "]";

		return str;
	}
	static String printArray(int[] arr){

		String str = "[";

		for(int i = 0; i < arr.length; i++) {
			if(i==arr.length-1) {
				str = str + arr[i];
			}else if(i<arr.length-1) {
				str = str + arr[i]+", ";
			}
		}

		str = str + "]";

		return str;
	}

}
