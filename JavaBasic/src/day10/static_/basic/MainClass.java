package day10.static_.basic;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		
		String[] arr = {"q","w","e","1","r","3","t"};
		char[] c = {'a','b','c','d','e','f','g'};
		int[] i = {1,2,3,4,5,6,7};
		
		
		System.out.println(MyArrays.printArray(arr));
		System.out.println(MyArrays.printArray(new String[7]));
		
		System.out.println(MyArrays.printArray(c));
		System.out.println(MyArrays.printArray(new char[7]));
		
		System.out.println(MyArrays.printArray(i));
		System.out.println(MyArrays.printArray(new int[7]));
		
		
		
		System.out.println(Init.price);
		System.out.println(Init.price);
		System.out.println(Init.price);
		System.out.println(Init.price);
		
		
	}
	
	
}
