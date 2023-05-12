package quiz01;

import java.util.Scanner;

public class Baek2018 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int count = 0;
		
		for (int j = 1; j <= i; j++) {
			
			int sum = 0;
			
			for (int j2 = j; j2 <= i; j2++) {
				
				if((sum+=j2)==i) {
					count++;
				}
				else if(sum>i) {
					break;
				}
				
			}
		}
	
		System.out.println(count);
	}
}
