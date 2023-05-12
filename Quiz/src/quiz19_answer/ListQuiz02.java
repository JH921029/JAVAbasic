package quiz19_answer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListQuiz02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<User> list = new ArrayList<>();


		while(true) {

			System.out.println("[ 1.등록 | 2.회원정보확인 | 3.회원정보검색 | 4.회원정보수정 | 5.프로그램종료 ]");
			System.out.print("메뉴(번호)>");

			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				String name = sc.next();
				int age = sc.nextInt();


				User u = new User(name, age);

				list.add(u);
				//이름, 나이를 입력받아서 user객체에 저장, 리스트에 순서대로 추가
				break;

			case 2:
				for(User u2 :list) {

					System.out.println(u2.getName()+"-"+u2.getAge());

				}

				//리스트에 담긴 모든 회원 이름, 나이를 출력
				break;

			case 3:
				System.out.print("찾을 이름 검색>");
				String name2 = sc.next();

				boolean bool = true;
				for (int i = 0; i < list.size(); i++) {
					User u3 = list.get(i);
					String n = u3.getName();

					if(name2.equals(n)) {
						System.out.println(u3.getName()+"-"+u3.getAge());
						bool = false;//실행했음
						break;
					}

				} 
				
				if(bool) {
					System.out.println("찾는 이름은 없습니다");
				}



				//contains()
				//if(list.contains("홍길동")) {
				//	System.out.println("홍길동이 있음");
				//}


				//찾을 이름을 새롭게 입력 받아서 이름이 있다면 이름과 나이를 출력
				//조건 - 찾는 이름이 없다면 입력값+"은 목록에 없습니다." 출력합니다.
				break;

			case 4:
				System.out.print("지울 이름 검색>");
				String name3 = sc.next();
				for (int i = 0; i < list.size(); i++) {
					User u4 = list.get(i);
					String n = u4.getName();
					if(name3.equals(n)) {
						list.remove(i);
						break;
					}
				}


				//값의 제거 remove()
				//삭제할 이름을 입력 받아서,동일한 이름과 User객체를 1개만 삭제 만약 동일이름이면 첫번째
				break;

			case 5:
				System.out.println("프로그램종료");
				System.exit(0);
				break;

			default:
				break;
			}
		}
	}

}
