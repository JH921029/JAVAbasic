package quiz01;

import java.nio.file.spi.FileSystemProvider;
import java.util.Arrays;
import java.util.Scanner;

public class MethodQuiz03 {

	static String method6(char[] c) {
		
		String str = "";
		for(int i = 0; i<c.length;i++) {
			str = str + c[i];
		}
		
		return str;
	}
	
	
	static int method7(int[] a) {
		int sum = 0;
		for(int i = 0; i<a.length; i++) {
			sum += a[i];
		}
		
		return sum;
	}
	
	static String[] method8(String a, String b) {
		String[] arr = new String[2];
		arr[0] = a;
		arr[1] = b;
		
		
		return arr;
	}

	
	static int inputI() {

		System.out.print("정수의 입력> ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		return a;
	}
	
	static String inputS() {
		
		System.out.print("문자열 입력> ");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		return s;
	}
	
	static int[] arr(int j) {
		int[] arr = new int[j];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = i;
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		
		
		char[] c = {'a','b','c','d','e'};
		String str = method6(c);
		System.out.println(str);
		
		System.out.println("입력한 숫자까지의 합");
		int i = inputI();
		int[] arr = arr(i+1);
		int sum = method7(arr);
		System.out.println(sum);
		
		System.out.println("입력한 길이의 배열");
		int i2 = inputI();
		int[] arr2 = arr(i2);
		System.out.println(Arrays.toString(arr2));
		
		System.out.println("입력한 문자열을 배열로 저장");
		String a = inputS();
		String b = inputS();
		String[] s = method8(a,b);
		System.out.println(Arrays.toString(s));
	}

}
