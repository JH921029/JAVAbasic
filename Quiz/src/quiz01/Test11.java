package quiz01;
/**
 * 백준
 * 10807
 */
import java.util.Scanner;

public class Test11 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int[] arr = new int[a];
		
		for(int i = 1; i <= a; i++) {
			
			int b = sc.nextInt();
			arr[i-1] = b; 
		}		

		int count = 0;
		int b = sc.nextInt();
		for(int i = 0; i<arr.length ;i++) {
			if(arr[i]==b) {
				count++;
			}
		}
		System.out.println(count);
	}
}
