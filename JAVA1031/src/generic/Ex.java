package generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 제네릭 (Generic, 일반화)
		 * 
		 * - 클래스 정의 시 사용되어질 데이터 타입을 미리 명시하지 않고
		 *   객체 사용 전 사용할 타입을 객체 생성 시 명시해 사용하는 기법
		 *   
		 * - 주로 Collection API의 클래스들이 기본적으로 제네릭이 적용돼있으므로
		 *   인스턴스 생성 시 제네릭 타입으로 사용할 데이터타입을 지정한다
		 *   => 지정된 데이터 타입이 클래스 내의 임시 데이터 타입을 대체하게 된다
		 */
		NormalIntegerClass nic = new NormalIntegerClass();
		nic.data = 10;
//		nic.data = 3.14; 		오류 ! : 실수 저장 불가
//		nic.data = "soomin";	오류 ! : 문자열 저장 불가
		
		NormalObjectClass noc = new NormalObjectClass();
		// NormalObjectClass 인스턴스 멤버변수 data는 Object 타입이므로
		// 어떠한 데이터 타입의 데이터도 모두 저장 가능
		// 단, 객체 내의 데이터를 꺼내서 사용할 때는 타입 판별이 필수적이다
		noc.data = 3;
		noc.data = "12";
		noc.data = 3.5444;
		// Object 타입을 사용해 관리하는 데이터는 Object 타입으로 저장 가능
		Object o = noc.getData();
		
		// ! Object 타입을 실제 데이터타입으로 변환하는 경우
		// 잘못된 타입 변환(다운캐스팅)으로 인해 ClassCastException 발생 가능
//		String name = o; 오류 ! : Type mismatch: cannot convert from Object to String
//		String name = (String) o;
//		System.out.println("이름 : " + name);
		// 오류 ! : Exception in thread "main" java.lang.ClassCastException:
		// String 타입이 아닌 다른 타입 데이터가 저장된 경우 예외 발생하므로 
		// 변환 전 반드시 instanceof 연산자를 통해 타입을 먼저 확인한다
		
		// 제네릭을 사용한 클래스 인스턴스 생성
		// -> 클래스명 뒤에 제네릭 타입을 참조 데이터 타입으로 명시한다
		//    (int -> Integer, char -> Character 즉, Wrapper Class를 사용한다)
		// 1. 제네릭 타입 E를 Integer로 지정
		GenericClass<Integer> gc = new GenericClass<Integer>();
		gc.setMember(12);
//		gc.setMember("12"); 
//		오류 ! : The method setMember(Integer) in the type GenericClass<Integer> is not applicable for the arguments (String)
//		정수 타입 외의 데이터는 컴파일 오류
		int num = gc.getMember(); // 오토 언박싱 적용됨
		
		// 2. 제네릭 타입 E를 Double로 지정
		GenericClass<Double> gc2 = new GenericClass<Double>();
		gc2.setMember(3.14);
//		gc2.setMember("soomin"); 오류 ! 
		
		// 3. 제네릭 타입 E를 String으로 지정
		GenericClass<String> gc3 = new GenericClass<String>();
		gc3.setMember("soomin");
//		gc3.setMember(12); 오류 !
		
		// 4. 제네릭 타입 E를 Person으로 지정
		Person p = new Person("soomin", 27);
		GenericClass<Person> gc4 = new GenericClass<Person>();
//		gc4.setMember(1);			오류 ! 
//		gc4.setMember("soomin");	오류 !
		gc4.setMember(p);
		System.out.println(gc4.getMember());
		Person person = gc4.getMember();
		System.out.println(person);
		
		// 5. 제네릭 타입 지정하지 않을 경우
		GenericClass gc5 = new GenericClass();
		// => 제네릭 타입 E가 Object로 대체됨
		// => 모든 데이터를 다룰 수 있다
		gc5.setMember(12);
		gc5.setMember("12");
		gc5.setMember(new Person("soomin",28));
		// => Object 타입 미지정과 지정의 기능 차이는 없지만 경고 메시지가 표시되므로
		// Object 타입 지정 추천
		GenericClass<Object> gc6 = new GenericClass<Object>();
		// => 경고 표시 해제됨
		
		//=====================================================================================
		// 실제 제네릭으로 정의된 Collection API 예시
		
		List<String> list = new ArrayList<String>();
		// => 컬렉션 요소로 사용되는 데이터가 String 타입으로 고정됨
		
		Set<Integer> set = new HashSet<Integer>();
		// => 컬렉션 요소로 사용되는 데이터가 Integer 타입으로 고정됨
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		// => 컬렉션 요소로 사용되는 데이터가 Integer, String 타입으로 고정됨
	}

}
/*
 * 제네릭을 사용한 클래스
 * 
 * - 클래스 정의 시점에서 '클래스명 <데이터 타입>'으로 정의
 *   => 가상의 자료형은 보통 1글자 영문 대문자 사용(주로 E또는 T)
 * 
 * - 가상의 자료형은 클래스 정의 시점에서 정확한 자료형을 명시하진않지만
 *   클래스 정의 시점에서 데이터타입 대신 사용 가능
 *   
 * - 해당 클래스의 인스턴스 생성 시점에서 가상의 자료형을 대신함
 *   실제 자료형을 지정하면 클래스 내의 가상의 자료형이 실제 자료형으로 대체됨
 *   즉, 인스턴스 생성 시점에서 어떤 자료형으로도 변형 가능하다
 * 
 */

class GenericClass <E> {
	// 클래스 내에서 데이터 타입 대신 제네릭 타입 E를 사용할 수 있다.
	E member; // 멤버변수 member를 제네릭 타입 E에 저장함. 실제 데이터 타입 E는 존재하지 않음

	public E getMember() {
		return member;
	}

	public void setMember(E member) {
		this.member = member;
	}
	
}

// 제네릭을 적용하지 않는 클래스
// 1) 사용할 데이터 타입을 특정 타입으로 관리하는 클래스
class NormalIntegerClass {
	int data; // data 변수에는 정수형 데이터만 저장 가능

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
}

// 2) 클래스 내에서 사용할 데이터 타입을 Object 타입으로 관리하는 클래스
class NormalObjectClass {
	// 멤버 변수를 Object 타입으로 선언할 경우 
	// 자바에서 사용되는 모든 데이터들을 저장할 수 있다.
	// => 이 때, 각 데이터들은 Object 타입으로 업캐스팅되어 저장됨
	Object data;

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
}