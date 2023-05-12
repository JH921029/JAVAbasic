package day12.api.util.arrays;

import java.util.Arrays;

public class ArraysEx {
	public static void main(String[] args) {
		
		int[] arr = {3,1,2,5,6,7};
		
		Arrays.sort(arr);
		//배열을 문자열로
		System.out.println(Arrays.toString(arr));
		
		
		//정렬이 필수로 되어있어야 합니다.
		int result = Arrays.binarySearch(arr, 4); //배열명 찾을값
		System.out.println(result); //음수가 나오면 값은 없다.
		
		int result1 = Arrays.binarySearch(arr, 5);
		System.out.println(result1);
		
		
		int[] newArr = Arrays.copyOf(arr, arr.length); //복사할 배열, 새로운 배열의 길이

		
		System.out.println(Arrays.toString(newArr));
		System.out.println(arr==newArr); //완전히 새로운 배열을 만들었기때문에 깊은 복사입니다. 그래서 false
		
		int[] newArr2 = Arrays.copyOf(arr, arr.length*2);
		System.out.println(Arrays.toString(newArr2));
		
		
		
		//배열 크기지정 복사                    배열   이상 미만
		int[] newArr3 = Arrays.copyOfRange(newArr, 1, 3); //원본 배열에서 1이상 3미만을 복사합니다.
		System.out.println(Arrays.toString(newArr3));
		
		
		
		
		
		if(Arrays.equals(newArr, arr)) {// 주소의 비교가 아닌 요소들의 비교
			System.out.println("배열의 원소가 정확히 일치함");
		}

	}

}
