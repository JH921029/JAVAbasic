package quiz01;
/**
 * 백준 5597
 */
import java.util.Arrays;
import java.util.Scanner;

public class Test16 {
	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
		Scanner sc = new Scanner(System.in);


		for(int i = 0; i<28; i++) {
			int a = sc.nextInt();


			for(int j = 0; j<arr.length; j++) {

				if(a==arr[j]) {
					arr[j]=0;
				}

			}
		}
		System.out.println(Arrays.toString(arr));

		for(int i = 0; i<arr.length;i++) {
			if(arr[i]!=0) {
				System.out.println(arr[i]);

			}
		}
	}
}
