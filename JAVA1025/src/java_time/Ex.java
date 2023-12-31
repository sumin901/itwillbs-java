package java_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Ex {

	public static void main(String[] args) {
		/*
		 * java.time 패키지
		 * 
		 * - 날짜 및 시각 정보를 관리하는 기능의 패키지 JDK 8 이상 
		 * 
		 * - LocalDate 클래스 
		 * - LocalTime 클래스
		 * - LocalDateTime 클래스
		 *   => 모두 toString() 메서드 오버라이딩 돼 있음
		 *   각 클래스의 now() 메서드 호출, 현재 시스템의 정보를 가져오고 
		 *   of() 메서드 호출해 항목별 정보 가져간다
		 *   
		 * - getXXX() 메서드를 호출해 항목별 정보 가져오기
		 *   XXX : 항목 별 정보
		 *   
		 * 
		 */

		// now()  메서드를 사용해 정보 가져오기
		LocalDate  ld = LocalDate.now();
		System.out.println(ld);
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		System.out.println("-----------------------------------");
		
		// of() 메서드를 사용해 정보 설정하기
		LocalDate ld2 = LocalDate.of(2000, 1, 1);
		System.out.println(ld2);
		LocalTime lt2 = LocalTime.of(17, 50);
		System.out.println(lt2);
		// LocalDateTime 의 of() 메서드는 각각의 정보를 따로 설정도 가능하며
		// LocalDate, LocalTime 객체를 파라미터로 설정할 수 있다
		LocalDateTime ldt2 = LocalDateTime.of(ld2, lt2);
		System.out.println(ldt2);

		// getXXX() 메서드를 통해 항목별 정보 가져오기
		int year = ld.getYear();
		int month = ld.getMonthValue();
		int day = ld.getDayOfMonth();
		System.out.println(year + "/" + month + "/" + day);
		
		// Month 타입 객체 활용
		// => enum 타입 객체인 Month 타입으로 관리됨 (각 월의 이름이 상수로 제공)
		Month enumMonth = ld.getMonth();
		System.out.println(enumMonth);
		String monthName = enumMonth.toString();
		System.out.println(monthName);
		// Month 객체를 한국식 표현법으로 변환
		System.out.println(enumMonth.getDisplayName(TextStyle.SHORT, Locale.KOREA));
		int hour = lt.getHour();
		int min = lt.getMinute();
		int sec = lt.getSecond();
		
		System.out.println(hour +":" + min +":" + sec);
		
		System.out.println("=============================");
		
		// 날짜 또는 시각 정보에 대한 연산
		// 해당 객체의 plusXXXX() 또는 minusXXX() 메서드를 사용해 연산 가능
		LocalDate today = LocalDate.now();
		System.out.println(today);
		// plusXXX() 메서드 호출, 덧셈 연산 수행
		System.out.println(today.plusMonths(8));
		System.out.println(today.plusDays(30));
		
		// 빌더 패턴 (Builder pattern) 활용
		// 리턴타입이 자기 자신인 객체가 다음 메서드를 차례대로 연결해 수행 가능하다
		// .메서드().메서드().메서드() 
		System.out.println(today.plusMonths(1).plusDays(15));
		System.out.println("===========================");
		
		LocalDate date3 = LocalDate.of(2000, 1, 1);
		LocalDate date4 = LocalDate.now();
		System.out.println(date3);
		System.out.println(date4);
		
		// 날짜와 시각 정보 비교를 위해
		// compareTo(), isAfter(), isBefore(), isEqual() 등의 메서드 사용
		
		// 1. compareTo()
		// 현재 객체 날짜가 비교 대상 객체보다 이전이면 음수, 이후면 양수 같다면 0을 리턴한다
		System.out.println(date3.compareTo(date4)); // 년 >> 월 >> 일 순으로 비교한다
		
		// 2. isAfter()
		System.out.println("설정된(기준) 날짜가 더 미래인가 ? : " + date3.isAfter(date4));
		
		// 3. isBefore()
		System.out.println("설정된(기준) 날짜가 더 과거인가 ? : " + date3.isBefore(date4));
		
		// 4. isEqual()
		System.out.println("설정된(기준) 날짜가 비교 날짜와 같은가 ? : " + date3.isEqual(date4));
		
		// 5. until() : 두 객체 간의 날짜 및 시간 차이 계산
		// => 파라미터로 대상 객체와 항목 정보 지정
		// => 항목 정보는 ChronoUnit 객체(enum 타입) 의 XXX 상수 사용
		// ex) ChronoUnit.YEARS 연도, ChronoUnit.DAYS 일
		long result = date3.until(date4, ChronoUnit.YEARS);
		if(result > 0) {
			System.out.println(result + "년 남았습니다");
		} else if (result < 0) {
			System.out.println(result + "년 지났습니다");
		} else {
			System.out.println("올해입니다");
		}
		
		
		
		
		
		
		
	}

}
