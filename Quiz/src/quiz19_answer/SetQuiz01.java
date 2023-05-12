package quiz19_answer;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SetQuiz01 {
	/*
	 * 중복되지 않은 6자리 수 (로또번호)
	 * 
	 * 1.Random객체를 이용해서 ~45까지 랜덤한 수를 생성
	 * 2.Set에 6개의 랜덤한 로또 번호를 저장해주세요.
	 */
	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();
		Random ran = new Random();
		
		while(set.size()<6) {
		int n = ran.nextInt(45)+1;
		set.add(n);
		}
		
		System.out.println(set.toString());

		
	}
}
