package day10.abstract_.good;

public class SeoulStore extends Store {

	@Override
	public void apple() {
		System.out.println("서울지점 사과 500원");
	}

	@Override
	public void grape() {
		System.out.println("서울지점 포도 500원");
		
	}

	@Override
	public void orange() {
		System.out.println("서울지점 오렌지 600원");
		
	}

	@Override
	public void melon() {
		System.out.println("서울지점 멜론 900원");
		
	}



}
