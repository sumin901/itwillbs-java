package collection_framework;

import java.util.LinkedList;
import java.util.Queue;

public class Ex6 {

	public static void main(String[] args) {
		
		/*
		 * Queue 큐
		 * 
		 * 한 편에서 삽입, 한 편에서 삭제가 일어나는 자료 구조
		 * -------------------------------------------------------
		 * --- IN --->								--- OUT --->  
		 * -------------------------------------------------------
		 * 
		 * 큐 인터페이스를 직접 다루지 않고 큐를 상속받아 구현한 LinkedList 클래스를 사용한다
		 * => LinkedList 클래스는 List와 Queue 인터페이스를 모두 구현한 구현체임
		 * 
		 * 은행 번호표 시스템, 온라인 게임 대기열 시스템 등에 사용
		 * 
		 */
		
		Queue<String> q = new LinkedList<String>();
		
		// offer() : 데이터 추가
		q.offer("1 - Ex.java");
		q.offer("2 - index.jsp");
		q.offer("3 - 필수.txt");
		System.out.println(q);
		
		// peek() : 출구의 요소 확인 - 가장 먼저 추가된 요소
		System.out.println(q.peek());
		
		// poll() : 출구 요소 제거, 꺼내기
		System.out.println(q + "에서 " + q.poll() + "제거 \n 제거 후 : " + q);
		System.out.println(q + "에서 " + q.poll() + "제거 \n 제거 후 : " + q);
		System.out.println(q + "에서 " + q.poll() + "제거 \n 제거 후 : " + q);
		// ! 큐는 제거할 요소 없으면 null 값 리턴!
	}

}
