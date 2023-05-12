package day13.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx {
	public static void main(String[] args) {
		/* 컬렉션
		 * ArrayList
		 * =>배열기반
		 * =>순서o 중복o
		 * 어래이리스트를 리스트에 담아서 자주 사용합니다.
		 */
		
//		ArrayList<String> array = new ArrayList<>();
		List<String> list = new ArrayList<>();
		
		//list추가 add()
		list.add("홍길동");
		list.add("이순신");
		list.add("세종대왕");
		list.add("홍길동");
		list.add("이순신");
		
		//문자열로 확인
		System.out.println(list.toString());
		
		//길이확인 size()
		System.out.println("리스트의 길이" + list.size());
		
		
		//중간에 추가 add() @@@@@@@@@@@@@@@@@@@@@@  중요  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		list.add(0, "0번쨰추가");
		System.out.println(list.toString());
		
		//값의 확인 get()  @@@@@@@@@@@@@@@@@@@@@@   중요  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		System.out.println("3번째 인덱스 값은 : "+list.get(3));
		
		//값의 수정 set()
		list.set(1, "홍길서");
		System.out.println(list.toString());
		
		
		//값의 제거 remove()
		list.remove(0);
		list.remove("세종대왕");
		System.out.println(list.toString());
		
		
		//contains()
		if(list.contains("홍길동")) {
			System.out.println("홍길동이 있음");
		} 
		
		
		//빈 리스트의 확인 isEmpty()
		if(list.isEmpty()) {
			System.out.println("리스트가 비었음");
			
		} else {
			System.out.println("리스트가 비어있지 않음");
		}
		
		//전부삭제 clear()
//		list.clear();
		System.out.println(list.toString());
		
		System.out.println("================================================================================");
		
		
		
		//제네릭 <?> = 제네릭에 뭐든 다 들어갈 수 있음
		//제네릭 <? extends String> = String과 String의 자식들이 ?에 들어갈수있다.
		//제네릭 <? super String> = String타입이 될 수 있다면 전달 가능

		List<String> list2 = Arrays.asList("a","b","c","d");
		System.out.println(list2.toString());
		
		list.addAll(list2);
		
		System.out.println(list.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
