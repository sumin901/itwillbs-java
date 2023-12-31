package collection_framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		/*
		 * 로또 번호 생성기 작성
		 * 
		 * 1. Set 타입 객체 myLotto 생성
		 * 2. 1 ~ 45 사이 난수 6개 myLotto에 저장
		 * 	  => ex) " 내 로또 번호 : 1 2 3 4 5 6 " 출력
		 * 
		 * 3. 로또 당첨 번호 thisWeekLotto에 저장
		 *   
		 * 4. 기존 myLotto와 당첨 번호와 비교해 일치하는 번호 개수와 등수 출력 
		 *    6개 : 1등
		 *    5개 : 2등
		 *    4개 : 3등
		 *    3개 : 4등
		 *    나머지 : 꽝
		 * 
		 * 
		 */

		// 1.
		Set<Integer> myLotto = new TreeSet<Integer>();
		
		while (myLotto.size() < 6) {
		// 2. 
			myLotto.add((int) ((Math.random()*45)+1));
		}
		
		// 3.
		Set<Integer> thisWeekLotto = 
				new TreeSet<>(Arrays.asList(6,20,23,24,28,30));
//		thisWeekLotto.add(6);
//		thisWeekLotto.add(20);
//		thisWeekLotto.add(23);
//		thisWeekLotto.add(24);
//		thisWeekLotto.add(28);
//		thisWeekLotto.add(30);
		System.out.println(thisWeekLotto);
		Object[] myArr = myLotto.toArray();
		Object[] twArr = thisWeekLotto.toArray();
		int count = 0;
//		for(int i = 0; i<6 ; i++) {
//			for(int j=0; j<6; j++) {
//				if(myArr[j].equals(twArr[i])) {
//					count += 1;
//				}
//			}
//		}
		
//		for(int num : myLotto) {
//			if(thisWeekLotto.contains(num)) {
//				count += 1;
//			}
//		}
		
		Iterator<Integer> ite = myLotto.iterator();
		// => iterator() 메서드를 호출해 Iterator 인터페이스를 구현한 객체
		
		while(ite.hasNext()) {
			int num = ite.next(); // next() 메서드 호출해 객체 하나 받아옴
			if(thisWeekLotto.contains(num)) {
				count += 1;
			}
		}
		
		System.out.println("당첨 번호 갯수 : " + count);
		
		switch(count) {
		case 3: System.out.println("4등");
		break;
		case 4: System.out.println("3등");
		break;
		case 5: System.out.println("2등");
		break;
		case 6: System.out.println("1등");
		break;
		default: System.out.println("꽝");
		}
		
		
		
	}

}
