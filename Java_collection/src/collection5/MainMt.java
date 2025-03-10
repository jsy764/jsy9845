package collection5;

import java.util.LinkedList;
import java.util.Stack;

public class MainMt {

	public static void main(String[] args) {
//		LinkedList<String> list = new LinkedList<>();
//		list.add("틀린그림찾기");
//		list.add("벽돌깨기");
//		list.add("슈퍼마리오");
//		
//		list.contains("고인돌");
//		list.indexOf("벽돌깨기");
//		System.out.println(list.get(1));

		// 스택 - FILO구조이다.
		// 웹 브라우저 히스토리, 계산기, 메서드 호출 등등
		Stack<String> stack = new Stack<>();
		stack.add("김춘추");
		stack.push("이순신");
		stack.push("이성계");
		stack.push("홍길동");
		stack.push("김석진");
		stack.push("이정훈");
		
		System.out.println(stack);
		
		stack.pop();
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		
	}

}
