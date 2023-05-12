package day13.collection.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

	public static void main(String[] args) {
		/*
			LinkedList
			=> 순서 ㅇ, 중복 ㅇ
			=>노드 객체 (양방향 연결리스트)
			
			LinkedList가   ArrayList와 다른점
			    노드           배열
			삭제,삽입 빠름   삽입, 삭제 느림
			   탐색 느림     탐색 빠름
			    
		*/
		LinkedList<Integer> list = new LinkedList<>();
		
		//list와 기능은 동일합니다.
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list.toString());
		
		
		//중간에 추가 add()
		list.add(3,10);  //3번째 인덱스에 10 추가
		System.out.println(list.toString());
		
		
		//값 얻기 get()
		int n = list.get(3);
		System.out.println(n);
		
		
		//값 삭제 remove()
		list.remove(3);
		System.out.println(list.toString());
		
		
		
		System.out.println("==============================================================================");
		
		
		//linklist는 queue의 기능을 구현하기 때문에 queue의 기능도 사용이 가능
		
		
		
		list.offer(10);
		list.offer(11);
		
		
		System.out.println(list.toString());
		
		list.poll(); //인덱스 0부터 빠집니다
		System.out.println(list.toString());
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
