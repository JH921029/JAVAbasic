package quiz01;
//시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.



import java.util.Scanner;

public class Main01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		scan.close();
		
		if(a>=90 && a<=100) {
			System.out.println("A");
		}else if(a>=80 && a<=89) {
			System.out.println("B");
		}else if(a>=70 && a<=79) {
			System.out.println("C");
		}else if(a>=60 && a<=69) {
			System.out.println("D");
		}else if(0<=a && a<60) {
		System.out.println("F");
		}
	}

	
}
