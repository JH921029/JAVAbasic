package day13.generic.good;

import java.util.ArrayList;
import java.util.List;

public class GenericEx {
	public static void main(String[] args) {
		//제네릭 <?> = 제네릭에 뭐든 다 들어갈 수 있음
				//제네릭 <? extends String> = String과 String의 자식들이 ?에 들어갈수있다.
				//제네릭 <? super String> = String타입이 될 수 있다면 전달 가능
		List<String> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		List<Object> list3 = new ArrayList<>();
		
		
		add1(list1);
		add1(list2);
		add1(list3);
		
		
		add2(list1);
//		add2(list2);  //<? extends String> 스트링이거나 스트링의 자식들만 가능  Integer X 
//		add2(list3);  //<? extends String> 스트링이거나 스트링의 자식들만 가능   Object X
		
		add3(list1); //string
//		add3(list2); //Integer
		add3(list3); //Object
		
		
	}
	
	//리스트를 매개변수로 주거나 받을수 있음
	public static void add1(List<?> list) {
		
	}
	
	public static void add2(List<? extends String> list) {
		
	}
	
	public static void add3(List<? super String> list) {
		
	}
}
