package day02;

import java.util.Scanner;


public class IfEx02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("점수 입력 > ");
		int point = scan.nextInt();

		scan.close();

		if(point>=90) 
		{   
			if(point >=95)
			{
				System.out.println("A+");
			}
			else                                  //90보다 크거가 같은경우 A
			System.out.println("A");
	
		}
		
		else if (point >=80)            //90보다 클 경우에는 A가 나오기 때문에 80이상일때의 경우만 입력해주면 됨
		{
			System.out.println("B");
		}
		
		else if (point >= 70)
		{
			System.out.println("C");
		}
	
		else if (point >= 60)
		{
			System.out.println("D");
		}
	
		else 
		{
			System.out.println("F");
		}
	}

}
