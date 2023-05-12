package day13.collection.map;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class HashMapEx {
	public static void main(String[] args) {

		//Map인터페이스를 구현하는 클래스 HashMap
		//ley에대한 타입과 val에 대한 티입을 지정
		//탐색이 빠릅니다.

		//HashMap<Integer, String> map = new HashMap<>();
		Map<Integer, String> map = new HashMap<>();

		map.put(1, "홍길동");
		map.put(2, "이순신");
		map.put(3, "홍길자");
		map.put(4, "홍길자");
		map.put(5, "산사임당");

		System.out.println(map.toString());

		//맵에 동일한 키를 저장하면? 값이 변경됩니다.
		map.put(4, "강감찬");
		System.out.println(map.toString());

		//맵의 값을 더기 get(키) : 값을 반환
		String item = map.get(3);
		System.out.println("3번 키에대한 값 : " + item);


		//key의 유무 확인 containsKey(키)
		if(map.containsKey(3)) {
			System.out.println("3번 키가 존재함");
		}


		//맵의 삭제 remove(키)
		map.remove(4);
		System.out.println(map.toString());


		//맵의 순회
//		Set<Entry<Integer, String>> entrySet = map.entrySet(); //맵을 셋으로 변경
//
//		for(Entry<Integer, String> entry : entrySet) {
//			System.out.println(entry.getKey());
//			System.out.println(entry.getValue());
//		}



		System.out.println("============================================================");
		//방법2
		Set<Integer> set = map.keySet();
		System.out.println(set.toString());
		for(int key : set) {
			System.out.println(key);
			System.out.println(map.get(key));
		}
		
		System.out.println("=============================================================");
		
		//맵에 객체를 담는 모형
		//Map<Integer, 유저> map2 = new HashMap<>{};
		Map<Integer, Object> map2 = new HashMap<>();
	}

}


