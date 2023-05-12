package quiz01;
/**
 * 백준 3003번 체스
 */
import java.util.Arrays;
import java.util.Scanner;

public class Test17 {
	public static void main(String[] args) {
		
		int[] arr = {1,1,2,2,2,8};
		
		Scanner sc = new Scanner(System.in);
		
		
		for(int i = 0; i<arr.length;i++) {
			int a = sc.nextInt();
			if((arr[i] - a)==0) {
				arr[i]=0;
			} else if((arr[i]-a)!=0){
				arr[i]=arr[i]-a;
			}
			
		}
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
}
