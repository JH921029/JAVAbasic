package quiz01;



public class Quiz02 {
	public static void main(String[] args) {
		//1~100까지의 랜덤한 정수를 생성
		int result = (int)(Math.random()*100+1); //Math.random()은 double형 
		
		//랜덤하게 나온수가 3의 배수인지 3의 배수가 아닌지 3항연산식으로 결과 출력
		String s = result % 3 == 0 ? "3의 배수" : "3의 배수가 아님" ;
		System.out.println(result +" 은(는) "+s);
		
		
	}

}
