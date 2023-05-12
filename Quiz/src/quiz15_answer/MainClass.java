package quiz15_answer;

import java.util.Arrays;

public class MainClass {
	public static void main(String[] args) {
		IBag bag = new MyBag();
		
		bag.insert("tv");
		bag.insert("tv");
		bag.insert("tv");
		bag.insert("tv");
		bag.insert("radio");
		bag.insert("radio");
		bag.insert("radio");
		
		bag.print();
		System.out.println(bag.search("radio"));
		
		System.out.println(bag.delete("radio"));
	}
}

