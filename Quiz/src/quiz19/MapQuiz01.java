package quiz19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapQuiz01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//맵을 이용하는데 key : 메뉴이름  value: 가격
		Map<String, Integer> map = new HashMap<>();

		while(true) {

			System.out.println("-----음식 메뉴 관리------");
			System.out.println("1. 신규 메뉴 등록"); //이미 등록된 메뉴인지 확인 후에 메뉴 등록
			System.out.println("2. 메뉴판 전체 보기"); //메뉴와 가격을 전부 출력
			System.out.println("3. 메뉴판 수정"); //변경할 메뉴를 받아서 메뉴가 있다면 가격을 수정
			System.out.println("4. 메뉴판 삭제"); //변경할 메뉴를 받아서 메뉴가 있다면 삭제
			System.out.println("5. 프로그램 종료"); //종료

			System.out.print("메뉴입력>");
			int menu = scan.nextInt();

			if(menu == 1) {
				while(true) {
					System.out.print("메뉴이름을 정하세요 > ");
					String name = scan.next();
					if(map.containsKey(name)) {
						System.out.println("이미 등록된 메뉴 입니다.");
					} else {
						System.out.print("메뉴의 가격을 정하세요 > ");
						int price = scan.nextInt();
						map.put(name, price);
						break;
					}
				}

			} else if(menu == 2) { //메뉴판 전체 보기
				

			} else if(menu == 3) {// 메뉴판 수정
				System.out.print("수정하고싶은 메뉴를 입력하세요 > ");
				String name = scan.next();
				if(map.containsKey(name)) {
					int price = scan.nextInt();
					map.put(name, price);
					System.out.println("가격수정완료");
				}

			} else if(menu == 4) { //삭제
				System.out.println("삭제할 메뉴를 입력해주세요 > ");
				String name = scan.next();
				if(map.containsKey(name)) {
					map.remove(name);
				}else {
					System.out.println("존재하지 않는 메뉴입니다.");
				}
			} else if(menu == 5) {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}

		}


	}
}
