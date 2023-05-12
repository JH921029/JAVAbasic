package day13.collection.set;

import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		
		//set + 정렬
		TreeSet<Integer> set = new TreeSet<>();
		
		
		
		set.add(100);
		set.add(110);
		set.add(200);
		set.add(500);
		set.add(130);
		set.add(160);
		set.add(170);
		System.out.println(set.toString());
		
	
		for(int a : set) {
			System.out.println(a);
		}
		
		
	
	}
}
