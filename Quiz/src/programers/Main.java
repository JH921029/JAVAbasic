package programers;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Solution so = new Solution();

		int arr[] = {0,1,2,3,4,5};
		int query[] = {4,1,2};
		
		so.solution(arr, query);
		
		System.out.println(Arrays.toString(arr));
	}

}
