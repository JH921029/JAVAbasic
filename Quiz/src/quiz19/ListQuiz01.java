package quiz19;

import java.util.LinkedList;
import java.util.List;

public class ListQuiz01 {
	public static void main(String[] args) {

		/*
		 * 1. list에 1~20까지 값을 순서대로 저장
		 * 
		 * 2.list에 값을 순서대로 출력
		 */

		LinkedList<Integer> list = new LinkedList<>();

		for (int i = 1; i <= 20; i++) {

			list.add(i);
		}

		System.out.println(list.toString());

		System.out.println("================================");
		/*
		 * List2번
		 * 1.User를 저장하는 list생성
		 * 2.3개의 각각 다른 User객체를 만들고 순서대로 저장
		 * 3.User객체 안에 홍길동이 있으면 해당 객체의 name, age를 출력
		 * 4.User객체 안에 홍길자가 있으면 해당 객체를 삭제
		 */

		LinkedList<User> list2 = new LinkedList<>();

		User us1 = new User("홍길동","25세");
		User us2 = new User("홍길숙","20세");
		User us3 = new User("홍길자","30세");

		list2.add(us1);
		list2.add(us2);
		list2.add(us3);


		System.out.println(list2.toString());

		for (int i = 0; i < list2.size(); i++) {
			if((list2.get(i).getName()).equals("홍길동")) {
				System.out.println(list2.get(i));
			} else if((list2.get(i).getName()).equals("홍길자")){

				list2.remove(i);
			}
		}System.out.println(list2.toString());
	}
}
