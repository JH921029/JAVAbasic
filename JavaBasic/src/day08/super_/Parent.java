package day08.super_;

public class Parent {

	String mother;
	String father;
	
//아무것도 안해도 생략되는 부분
//	Parent(){
//		super();
//	}
	
	Parent(String mother, String father){
		this.mother = mother;
		this.father = father;
		
		
	}
	
	String info() {
		return "name:"+mother+", name:"+father;
	}
}
