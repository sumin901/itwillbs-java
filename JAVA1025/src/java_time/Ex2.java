package java_time;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 날짜 및 시각 정보에 대한 형식화(Formatting)
		 * 
		 * - 날짜 또는 시각 정보를 원하는 형식으로 변환한다
		 * 
		 * - SimpleDateFormat, DateTimeFormatter
		 * 	1) SimpleDateFormat : Date 타입 객체에 대한 형식화
		 * 	2) DateTimeFormatter : LocalXXX 타입 객체에 대한 형식화
		 * 
		 * 				<형식 문자>
		 * 기호			의미 			표현			예
		 * ---------------------------------------------------------------------
		 * Y			연도			yyyy,yy			2023,23
		 * M			월				MMM,MM			06월,06
		 * d			일 				dd				25
		 * E			요일			EEEE,E			수요일,수
		 * H			시(24시)		HH				17
		 * K			시(12시)		KK				10
		 * m			분				mm				20
		 * s			초 				ss				30
		 * a			오전/오후		a				오전 또는 오후
		 */

		// 1. SimpleDateFormat
		Date today = new Date();
		System.out.println(today); // >> Wed Oct 25 11:21:46 KST 2023 기본 표현 형식
		// => 형식 지정 문자를 사용해 형식 적용을 위한 패턴 문자열 생성
		String pattern = "yyyy년 MM월 dd일 EEEE";
		// SimpleDateFormat 인스턴스 생성 후 파라미터로 패턴 문자열 전달
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		// SimpleDateFormat 객체의 format() 메서드 호출해 Date 객체 전달
		System.out.println(sdf.format(today));
		String formatToday = sdf.format(today);
		System.out.println(formatToday);
		
		pattern = "yyyy/MM/dd(E) a KK:mm:ss";
		SimpleDateFormat sdf2 = new SimpleDateFormat(pattern);
		System.out.println(sdf2.format(today));
		
		// 2. DateTimeFormatter 
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		// DateTimeFormatter.ofPattern() 메서드 호출
		// 파라미터로 패턴 문자열 전달
		
		// LocalTime 또는 LocalDate 를 사용하는 경우 
		// 패턴 문자열에 존재하지 않는 정보를 포함하지 않도록 주의한다
		DateTimeFormatter dft = DateTimeFormatter.ofPattern(pattern);
		// LocalDate 등의 날짜 및 시각 객체의 format() 메서드를 호출해
		// 파라미터로 DateTimeFormatter 객체 전달
		System.out.println(now.format(dft));
		
		
	}

}
