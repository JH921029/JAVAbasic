package day13.collection.list;

import java.util.Arrays;
import java.util.Stack;

public class StackEx01 {
	public static void main(String[] args) {
		/*
		 * Stack  ex)컴퓨터에서 변수 저장하는 용으로 자주 사용
		 * =>Last In First Out(후입선출)
		 * =>push(), pop()
		 */
		
		Stack<String> stack = new Stack<>();
		
		stack.push("홍길동");
		stack.push("이순신");
		stack.push("홍길자");
		
		System.out.println(stack.toString());
		
		String s = stack.pop();
		System.out.println("팝으로 제거된 값은 "+s);
		System.out.println(stack.toString());
	}
}
