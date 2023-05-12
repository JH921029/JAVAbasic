package quiz15_answer;

import java.util.Arrays;

public class MyBag implements IBag {//클래스에는 크기가 100인 String[]을 선언해주세요.

	int index;
	String[] arr = new String[100];
	@Override
	public void insert(String item) {//저장 - 매개변수를 배열에 순서대로 저장
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==null) {
				arr[i]=item;
				break;
			}
		}
		this.index++;
	}

	@Override
	public void print() {//출력 - 배열안에 개수만큼 출력
		for (int i = 0; i < this.index; i++) {
			System.out.print(arr[i]);
		}
		
	}

	@Override
	public int search(String item) { //검색 - 값이 있다면 index를 return, 없다면 -1을 리턴(가장먼저 검색된 item순서 반환)
		for (int i = 0; i < index; i++) {
			if(arr[i].equals(item)) {
				return i;
			}
			
		}
		
		return -1;
	}

	@Override
	public boolean delete(String item) {//삭제 - 배열의 요소를 삭제(가장먼저 찾게된 item하나만 삭제)

		for (int i = 0; i < index; i++) {
			
			//찾을경우
			if(arr[i].equals(item)) {
				//뒤의 아이템을 당기고 종료
				for(int j = i; j < index -1; j++) {//당긴다고하면 index-1까지만 합시다.
					arr[j] = arr[j+1];
				}
				
				arr[index-1] = null;
				index--;
				return true;
			}
		}
		
		
		return false;
	}

}
