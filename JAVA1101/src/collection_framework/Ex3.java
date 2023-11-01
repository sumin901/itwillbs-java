package collection_framework;

import java.util.ArrayList;
import java.util.List;

public class Ex3 {

	public static void main(String[] args) {
		
		/*
		 * List
		 * 
		 * 저장 데이터의 순서 유지 O, 중복 O
		 * 
		 * 대표 구현체 : ArrayList, Vector, LinkedList...
		 * 
		 * 
		 */
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println("List 객체 비어 있는가? : " + list.isEmpty());
		System.out.println("List 요소 갯수 : " + list.size());
		System.out.println(list);
		System.out.println("1번 : " + list.get(1));
		System.out.println("3의 인덱스 번호 : " + list.indexOf(3));
		System.out.println("정수 2 삭제 : " + list.remove((Object)1));
		System.out.println(list);
	}

}