package quiz05;

public class Calculator {
	
	int result;
	double pi;
	
	void add(int a){
		result +=a;
	}

	void sub(int a){
		result +=a;
	}
	
	double circle(int a){
		pi = a*a*3.14;
		System.out.println("Calculator에 있는 값 : "+pi);
		return pi;
		
	}
	
	
	
	
}
