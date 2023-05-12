package quiz15;

import java.util.Arrays;

public class MainClass {
	public static void main(String[] args) {
		IBag ar = new Array();
		
		ar.insert("a");
		ar.insert("b");
		ar.insert("c");
		ar.insert("d");
		ar.insert("e");
		ar.insert("f");
		ar.insert("g");
		ar.print();
		
		System.out.println(ar.search("b"));
		System.out.println(ar.delete("b"));
		
		
		
		
		
	}
}

