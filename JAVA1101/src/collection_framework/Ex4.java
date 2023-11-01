package collection_framework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Ex4 {

	public static void main(String[] args) {
		/*
		 * Map 계열
		 * 
		 * 키와 값을 한 쌍으로 갖는 자료구조
		 * => Map.Entry 타입 객체로 관리
		 * => 키는 중복 X, 값은 중복 O
		 * 
		 * 구현체 클래스 : HashSet, Properties ...
		 * 
		 * 전화번호부, 가격표 등에 활용
		 * 
		 * 
		 */
		
		Map map = new HashMap<>();
		// put (Object key, Object value) : key에 해당하는 value 추가
		map.put(1, "자바");
		map.put(2, "JSP");
		map.put(3, "클라우드");
		System.out.println(map);
		
		// 키 중복이 불가능하므로 기존의 키를 지정해 값을 추가할 경우 덮어씌운다
		// + 제거된 값을 리턴한다
		System.out.println(map.put(3, "Spring Boot"));
		System.out.println(map);
		
		// 키 중복은 불가능, 값은 가능!
		map.put(4, "Spring Boot");
		System.out.println(map);
		
		// Object get(Object key) : 키에 해당하는 값 리턴 (없을 경우 null)
		System.out.println(map.get(2));
		// Set keySet() : Map 객체 내 모든 키 리턴(Set 타입 객체)
		Set key = map.keySet();
		System.out.println(key);
		
		// Collection values() : Map 객체 내 모든 값 리턴 
//		List list = (List) map.values() ! 직접 다운 캐스팅 불가능
		List list = new ArrayList(map.values());
	}

}
