package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Baek9086 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String s = "";
		String[] str = new String[a];
		
		for(int i = 0; i < a; i++) {
			s = sc.next();
			String t= "";
			
			char b = s.charAt(0);             //첫번째 인덱스
			char c = s.charAt(s.length()-1);  //마지막 인덱스
			
			s= t+b+c;
			
			str[i] = s;
		}	
		
		for(int i = 0; i < a; i++) {
			System.out.println(str[i]);
		}
	}
}
