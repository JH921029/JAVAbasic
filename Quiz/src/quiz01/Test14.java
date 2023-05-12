package quiz01;


/**
 * 2차배열 구구단
 */

import java.util.Arrays;

public class Test14 {
	public static void main(String[] args) {
		
		int[][] arr = new int[8][9]; //[세로][가로]
		for(int i = 1; i<=8; i++) {
			for(int j = 1; j<= 9;j++) {
				arr[i-1][j-1]=(i+1)*j;
			}
		}
		for(int i = 0; i<arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}
}
