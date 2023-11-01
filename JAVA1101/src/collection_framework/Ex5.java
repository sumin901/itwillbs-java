package collection_framework;

import java.util.Stack;

public class Ex5 {

	public static void main(String[] args) {
		/*
		 * 스택
		 * 
		 * 하나의 상자에 데이터를 아래쪽부터 차례로 쌓는 구조
		 * 
		 * 데이터가 Top 에서만 삽입과 삭제가 이뤄짐
		 * => FILO : First In Last Out || 
		 * 
		 * 2개의 스택을 사용하면 
		 * 웹의 뒤로/앞으로 기능이나 프로그램의 REDO/UNDO 기능 구현가능
		 * 
		 */
		
		Stack<String> stack = new Stack<String>();
		stack.push("1 - www.itwillbs.co.kr");
		stack.push("2 - www.naver.com");
		stack.push("3 - www.google.com");
		System.out.println(stack);
		
		//peek() : Top에 위치한 요소 확인
		System.out.println(stack.peek());
		
		//pop() : Top에 위치한 요소 확인 후 제거,꺼내기
		System.out.println("맨 위 요소 확인 후 제거, " + stack.pop() + "\n제거 후 : " + stack);
		System.out.println("맨 위 요소 확인 후 제거, " + stack.pop() + "\n제거 후 : " + stack);
		System.out.println("맨 위 요소 확인 후 제거, " + stack.pop() + "\n제거 후 : " + stack);
//		System.out.println("맨 위 요소 확인 후 제거, " + stack.pop() + "\n제거 후 : " + stack);
//		=> 더 이상 꺼낼 요소가 없으면 오류 발생 
		
		
		
	}

}
