package java_util_package;

import java.util.Calendar;
import java.util.Date;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * Calendar 클래스
		 * 
		 * - 주로 날짜 및 시각을 조작하는 용도의 클래스(표현도 가능)
		 * 
		 * - 추상클래스이므로 인스턴스 생성없이 제공되는 인스턴스, getInstance() 메서드로
		 *   리턴받아 사용한다
		 * 
		 * - get() 메서드로 날짜 및 시각 정보 조회
		 *   set() 메서드로 날짜 및 시각 정보 설정
		 *   => 파라미터로 날짜 및 시각 모두 설정을 위한 상수 사용한다
		 * 
		 * 
		 */
		
//		Calendar c1 = new Calendar(); >> 오류!, 추상클래스므로 인스턴스 생성 불가능
		Calendar c1 = Calendar.getInstance();
		System.out.println(c1); // toString() 메서드가 오버라이딩 돼 있지만 식별이 어렵다
		
		// Calendar 인스턴스의 get() 메서드를 사용해 정보 조회
		// => 파라미터로 Calendar.xxx 상수를 통해 가져올 정보의 종류 지정
		int year = c1.get(c1.YEAR);
		int month = c1.get(c1.MONTH);
		int day = c1.get(c1.DAY_OF_MONTH);
		System.out.println(year + "년 " + (month+1) + "월 " + day + "일");
		int hour = c1.get(c1.HOUR_OF_DAY); // 24시간 : hour of day, 12시간 : hour
		int min = c1.get(c1.MINUTE);
		int sec = c1.get(c1.SECOND);
		System.out.println(hour+"시 " + min + "분 " + sec +"초");
		
		// Calendar <=> Date 상호 변환
		
		// 1. Calendar => Date
		//	  Calendar 객체의 getTime() 메서드 호출하여 Date 타입 리턴
		Date date = c1.getTime();
		System.out.println(date);
		
		// 2. Date => Calendar
		//    Calendar 객체가 존재하는 상태에서 setTime() 메서드 호출해
		// 	  Date 타입 객체를 파라미터로 전달
		Calendar c2 = Calendar.getInstance();
		c2.setTime(date);
		System.out.println(c2.getTime());
		
		System.out.println("==============================");
		
		//set() 메서드 사용 날짜 및 시각 정보 설정
		c2.set(2000,3,21); // 월은 0 ~ 11 값을 사용하므로 설정 시 -1 필요
		System.out.println(c2.getTime());
		
		// 각 항목을 별도로 변경할 때는 set(int field, int value) 메서드 사용
		// => field 항목은 get() 메서드와 마찬가지로 Calendar.xxx 상수 사용한다
		c2.set(Calendar.YEAR, 2002);
		c2.set(Calendar.MONTH, 2);
		
		Date d2 = c2.getTime();
		System.out.println(d2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
