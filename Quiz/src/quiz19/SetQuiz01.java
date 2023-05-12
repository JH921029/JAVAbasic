package quiz19;

import java.util.Random;
import java.util.TreeSet;

public class SetQuiz01 {
	/*
	 * 중복되지 않은 6자리 수 (로또번호)
	 * 
	 * 1.Random객체를 이용해서 ~45까지 랜덤한 수를 생성
	 * 2.Set에 6개의 랜덤한 로또 번호를 저장해주세요.
	 */
	public static void main(String[] args) {
		
		TreeSet<Integer> set = new TreeSet<>();
		Random r = new Random();
		
		while(set.size()!=6) {

			int a = r.nextInt(1,46);
			set.add(a);

		}
		System.out.println(set.toString());

	}
}
