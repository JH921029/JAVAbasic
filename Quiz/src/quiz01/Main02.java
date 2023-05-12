package quiz01;

import java.util.Scanner;


public class Main02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int min = sc.nextInt();
		
		int time = sc.nextInt();

		if((min+time)>=60)
		{
			hour += (min+time)/60;
			
			if(hour>=24)
			{
				hour = hour-24;
				System.out.println(hour+" "+(min+time)%60);
			}else
			{
				
			}
				
		}else

		System.out.println(hour+" "+(min+time));
	}
}
