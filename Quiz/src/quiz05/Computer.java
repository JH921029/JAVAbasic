package quiz05;

public class Computer extends Calculator {
	
	
	double circle(int a){
		pi = a*a*(Math.PI);
		System.out.println("Computer에 있는 값 : "+pi);
		return pi;
	}
	
	double rect(double a) {
		double d = a*a;
		System.out.println("한변의 길이가"+a+"인 정사각형의 넓이는"+d+"입니다");
		return d;
	}
	double rect(double a, double b) {
		double d = a*b;
		System.out.println("가로"+a+" 세로"+b+"인 직사각형의 넓이는"+d+"입니다");
		return d;
	}
	
	double rect(double a, double b, double c) {
		double d = a*b*c;
		System.out.println("가로"+a+" 세로"+b+" 높이"+c+"인 직육면체의 넓이는"+d+"입니다.");
		return d;
		
	}
	
	
}
