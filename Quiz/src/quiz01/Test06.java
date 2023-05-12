package quiz01;
/**
 * 백준 A+B-7 답
 * 
 */
import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		int c = 1;
		String str = "";
		

		while(c<=t) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			str = str + "Case #"+c+": "+(a+b)+"\n";
			
			c++;
		}
		System.out.println(str);
	}

}
