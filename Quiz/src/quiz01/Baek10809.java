package quiz01;

import java.util.Scanner;

public class Baek10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		for(char c = 'a'; c <= 'z';c++ ) {
			int idx = s.indexOf(c);
			
			System.out.print(idx+" ");
		}
	}

}
