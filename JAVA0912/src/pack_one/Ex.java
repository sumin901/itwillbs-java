// package 키워드 위에 주석은 올 수 있다!
// class Person { }
// => 명령줄은 package 위에 올 수 없다!
package pack_one;

import java.io.IOException;

import pack_two.Ex_pack;

public class Ex {

	public static void main(String[] args) {
		/*
		 * package(패키지)
		 * - 윈도우의 폴더, 리눅스의 디렉터리에 해당되는 개념
		 * - 자바의 클래스 파일들을 모아놓은 공간
		 *   => 서로 다른 패키지에는 같은 이름의 클래스가 각각 따로 존재 가능
		 *      (같은 이름의 파일이 서로 다른 폴더에 존재할 수 있는 것과 동일)
		 *       = 같은 이름의 클래스가 같은 패키지에 위치할 수 없다!
		 * - 자바에서 패키지를 생성하면, 실제 폴더 구조로 된 패키지가 생성됨
		 * - 특정 클래스 파일은 하나의 패키지'만' 소속될 수 있음
		 * - 자바의 모든 클래스는 클래스명 앞에 패키지명을 기술하여 표기
		 *   => 상위패키지명.하위패키지명.클래스명 형태로 지정
		 *   => 패키지명이 중복되지 않도록 하기위해 도메인 네임을 사용
		 *      (단, 도메인 네임을 최상위도메인부터 역순으로 지정)
		 *      
		 * package 키워드
		 * - 특정 클래스 파일 첫 번째 라인에 해당 클래스가 소속된 패키지명 명시
		 * - 실제 클래스 파일의 위치와 패키지명이 다를 경우 오류 발생
		 * - 반드시 주석을 제외한 첫 번째 라인에서 사용
		 *   => 클래스 내에서 단 한번만 사용 가능
		 * - 패키지 키워드 사용 기본 문법
		 *   소스코드 첫 번째 라인에서 
		 *   package 패zl지명;
		 */
		
		// java.lang 패키지에 위치한 String 클래스를 지정하는 방법(정석)
		// => 패키지명을 명시하고 . 을 붙인 뒤 클래스명을 지정함
		java.lang.String str; // java.lang 패키지의 String 클래스를 선언
		// java.lang 패키지는 생략 가능한 패키지 이름으로 클래스명만으로 지정 가능
		String str2;
		
		str2 = "";
		
		Ex_pack ex2 = new Ex_pack();
		pack_three.Ex_pack ex3 = new pack_three.Ex_pack();
		
	}

}






