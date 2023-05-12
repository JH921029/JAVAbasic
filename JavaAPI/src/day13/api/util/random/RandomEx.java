package day13.api.util.random;

import java.util.Random;

public class RandomEx {
	public static void main(String[] args) {
		
//		double d =Math.random();
		
		Random r = new Random();
		
		double d = r.nextDouble();
		System.out.println(d);
		
		int i = r.nextInt(10);
		System.out.println(i);
		
		
	}

}
