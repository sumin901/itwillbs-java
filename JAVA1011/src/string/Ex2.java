package string;

import java.util.Arrays;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 		String 클래스
		 * 
		 * - 문자열 데이터를 처리하는 클래스
		 * 
		 * - 리터럴을 사용해 문자열을 직접 생성하거나
		 *   new 연산자를 사용한 인스턴스 생성 시 생성자에 문자열을 전달해 생성
		 *   => 리터럴 사용 시 해당 문자열 존재 여부를 상수풀에서 검사 후
		 *      중복되는 문자열이 없으면 생성하고, 중복될 경우 주소값을 리턴하므로
		 *      메모리 공간 낭비를 줄인다
		 *   => new 연산자 사용 시 문자열 중복 여부와 상관없이 객체를 생성한다
		 *   
		 * - 문자열 내용 비교 시 동등비교(==) 보다 equals() 메서드 사용
		 * 
		 * - 문자열 생성 시 String 클래스 내부적으로 char[]로 관리
		 *   => 개발자의 편의를 위해 별도의 String 클래스를 만들어서 제공
		 *   => 배열 형태므로 배열 인덱스와 동일한 인덱스 번호
		 *   
		 *   	String 클래스 메서드
		 * 
		 * - 문자열 수정, 검색, 치환 등 다양한 작업을 수행하는 메서드를 제공
		 * 
		 * - String 객체는 불변 객체므로 원본 문자열을 수정하지않고,
		 *   각종 작업을 수행할 경우 수정된 데이터를 문자열로 새로 생성한다.
		 *   => 문자열 수정이 빈번할 경우 낭비가 심하다
		 *   	StringBuilder 또는 StringBuffer 클래스 활용
		 * 
		 */
		String str1 = "JAVA PROGRAMMING";
		String str2 = "		아이티윌 		부산 교육센터		";
		String str3 = "자바.JSP.클라우드";
		
		System.out.println(str1); // toStirng() 생략됨
		System.out.println(str1.toString()); // 저장된 문자열을 리턴
		
		System.out.println("---------------------------");
		
		// length() : 문자열 길이 리턴
		System.out.println("str1 length : " + str1.length());
		
		// equals() : 문자열 비교 (대소문자 구분)
		System.out.println("str1 equals Java PROGRAMMING : " + str1.equals("Java PROGRAMMING"));
		
		// equalsIgnoreCase() : 문자열 비교 (대소문자 구분X)
		System.out.println("str1 equalsIgnoreCase Java PROGRAMMING : " + str1.equalsIgnoreCase("Java PROGRAMMING"));
		
		// charAt() : 특정 인덱스에 위치한 문자 리턴
		System.out.println("str1.charAt(5) : " + str1.charAt(5));
		
		// substring() : 특정 범위 문자열(= 부분 문자열) 추출
		// 1) substring(int beginIndex) : 시작 인덱스부터 끝까지 추출
		System.out.println("str1.substring(5) : " + str1.substring(5));
		// 2) substring(int beginIndex, int endIndex) : 시작 ~ 끝-1 추출
		System.out.println("str1.substring(5, 11) : " + str1.substring(5, 11));
		
		// concat() : 문자열 결합 << + 연산자보다 연산 속도가 빠름
		System.out.println("str1.concat(!) : " + str1.concat("!"));
		System.out.println(str1 + "!");
		
		// indexOf() : 특정 문자 또는 문자열의 시작 인덱스 리턴
		// => 문자열의 앞쪽부터 리턴
		// => 탐색 결과 존재하지 않을 경우 -1 리턴
		System.out.println("str1.indexOf('A') : " + str1.indexOf('A'));
		// => 앞에서부터 문자 A를 탐색해 처음 만나는 인덱스 1 리턴
		
		System.out.println("str1.indexOf('X') : " + str1.indexOf('X'));
		// => 존재하지 않음 == -1 리턴
		
		System.out.println("str1.indexOf(PROGRAMMING) : " + str1.indexOf("PROGRAMMING"));
		// => 문자열의 시작 인덱스 5 리턴
		
		// lastInderOf() : 문자열 탐색 시 역순(뒤부터) 탐색
		// => 탐색 순서를 역순으로 할 뿐, 인덱스 번호는 바뀌지 않는다.
		System.out.println("str1.lastIndexOf('A') : " + str1.lastIndexOf('A'));
		// => 탐색을 뒤에서부터 하므로 "JAVA PROGRAMMING"의 3번째 A의 인덱스 10 리턴
		
		// replace() : 특정 문자 또는 문자열을 치환한다
		// => 동일한 문자 또는 문자열이 존재할 경우 모두 치환
		System.out.println("str1.replace('A','@') : " + str1.replace('A','@'));
		// => 문자 A를 찾아 모두 @로 치환
		System.out.println("str1.replace('@','A') : " + str1.replace('@','A'));
		// 문자열 적용
		System.out.println("str1.replace(JAVA,PHYTHON) : " + str1.replace("JAVA","PHYTHON"));
		
		// toUpperCase(), toLowerCase() : 대소문자 변환
		System.out.println("str1.toLowerCase() : " + str1.toLowerCase());
		// => 모두 소문자 변환
		System.out.println("str1.toUpperCase() : " + str1.toUpperCase());
		// => 모두 대문자 변환
		
		// trim() : 문자열 앞 뒤 공백 제거
		// => 중간은 제거하지 못함
		System.out.println("교육기관 : " + str2 + "!");
		System.out.println("교육기관 : " + str2.trim() + "!" );
		
		// contains() : 포함하는지 
		System.out.println("str2.contains(부산) : " + str2.contains("부산"));
		System.out.println("str2.contains(강남) : " + str2.contains("강남"));
		
		// split() : 특정 기준으로 문자열 분리
		// => 분리된 문자열은 배열로 관리됨
		// => 분리에 사용되는 기준 문자열을 구분자(=분리자, Delimeter) 
		// => 구분자를 지정하는 규칙은 정규표현식을 따른다
		// str3 = "자바/JSP/클라우드";
		// => 해당 문자열을 "/" 기호를 기준으로 분리하여 배열에 저장
		String[] subjectArr = str3.split("/");
		for(int i =0 ; i < subjectArr.length ; i++) {
			System.out.println(subjectArr[i]);
		}
		// "." 기호를 구분자로 지정하는 경우
		// 정규표현식에서 특수기호로 사용되어 모든 문자를 구분자로 지정하게 됨
//		String[] subjectArr2 = str3.split(".");
		// => 모든 문자열 제거하라는 명령 => null
//		for(int i =0 ; i < subjectArr.length ; i++) {
//			System.out.println(subjectArr2[i]);
//		}
		// "." 기호를 구분자로 지정할 경우 => "\\." 사용
		String[] subjectArr2 = str3.split("\\.");
		for(int i =0 ; i < subjectArr2.length ; i++) {
			System.out.print(subjectArr2[i] + " ");
		}
		
//		String.format() 메서드
//		특정 문자열을 형식 지정문자(%?)와 결합해 형식을 갖춘 문자열로 리턴한다
//		=> printf() 메서드와 형식 지정문자가 동일함
		String name = "윤수민";
		int age = 27;
		double height = 178.7;
//		=> 형식 지정문자를 사용해 출력한다
		System.out.printf("이름 : %s, 나이 :%d, 키 : %.1f\n", name, age, height);
		
//		=> 세 가지 데이터를 결합한 문자열의 리턴을 저장
		String formatstr = 
				String.format("이름 : %s, 나이 :%d, 키 : %.1f\n", name, age, height);
		System.out.println("생성된 회원 정보는 " + formatstr);
		
//		toCharArray() : 문자열을 char[] 배열로 리턴한다
		String s5 = "admin123";
		char[] charArr = s5.toCharArray(); // => {a, d, m, i, n, 1, 2, 3 }
		for(int i = 0 ; i < charArr.length; i++) {
			System.out.println(charArr[i]);
		}
		
//		Arrays.toString() : 배열 내의 모든 데이터를 문자열로 결합해 리턴한다
		System.out.println(Arrays.toString(charArr));
		
	}

}
