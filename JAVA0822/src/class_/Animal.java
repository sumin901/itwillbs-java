package class_;

/*
 * 동물(Animal)에 해당하는 Animal 클래스 정의
 * 
 *  1. 분석
 *   - 속성 : 이름(name, String), 나이(age, int), 
 *   - 기능 : 짖다(Cry())
 *   
 *  2. 설계 - 클래스의 정의
 *    < 클래스 기본 문법>
 *    
 *    [접근제한자] class 클래스명 {
 *    	// 멤버 변수
 *      // 메서드
 *    }
 *  
 * 
 * 
 * */


public class Animal {

	String name;	//  동물의 이름
	int age; 		//	동물의 나이
	
	// 메서드 정의
	// 짖다 Cry() 메서드 : 매개 변수 X, 리턴 값 X
	// Cry() => "동물 울음 소리" 문자열 출력
	
	public void Cry() {
		System.out.println("동물 울음 소리");
	}
	
	
	
	
}
