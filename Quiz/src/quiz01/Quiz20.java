package quiz01;
/**
 * 백준 10818번 문제
 * 
 * 
 */
import java.util.Scanner;

public class Quiz20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int[] arr = new int[a];
		
		for(int i = 0; i<arr.length; i++) {
			int b = sc.nextInt();
			arr[i]=b;
		}
		
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
			
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println(min+" "+max);
	}
}
