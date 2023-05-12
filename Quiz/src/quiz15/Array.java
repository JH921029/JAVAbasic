package quiz15;

import java.util.Arrays;

public class Array implements IBag {//클래스에는 크기가 100인 String[]을 선언해주세요.
	
	String[] str = new String[100];
	int index = 0 ;
	

	@Override
	public void insert(String item) {//저장 - 매개변수를 배열에 순서대로 저장
		for (int i = 0; i < str.length; i++) {
			if(str[i]==null) {
				str[i]=item;
				break;
			}
		}
		this.index++;
		
		System.out.println(Arrays.toString(str));
	}

	@Override
	public void print() {//출력 - 배열안에 개수만큼 출력
		for (int i = 0; i < this.index; i++) {
			System.out.print(str[i]);
		}
	}

	@Override
	public int search(String item) { //검색 - 값이 있다면 index를 return, 없다면 -1을 리턴(가장먼저 검색된 item순서 반환)
		for (int i = 0; i < this.index; i++) {
			if(str[i].equals(item)) {
				
				return i;
			}
			
		}
		return -1;
		
		
	}

	@Override
	public boolean delete(String item) {//삭제 - 배열의 요소를 삭제(가장먼저 찾게된 item하나만 삭제)
		
		for (int i = 0; i < index; i++) {
			if(str[i].equals(item)) {
				this.str[i]="0";
				
				return true;
			}
		}
		
		
		return false;
	}

}
