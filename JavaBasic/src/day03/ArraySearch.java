package day03;

public class ArraySearch {

	public static void main(String[] args) {
		//큰 값찾기
		int[] arr = {1, 12, 54, 23, 12, 76, 99, 8, 2, 3, 9};
		
		int max = arr[0];
		int min = arr[0];
		
		
		for(int i = 1; i<arr.length; i++) {
			if(arr[i-1]>max) {
				max=arr[i-1];
			}
		
		}
		
		for(int i = 1; i<arr.length; i++) {
			if(arr[i-1]<min) {
				min=arr[i-1];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}
}
