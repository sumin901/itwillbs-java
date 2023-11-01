package static_member;

public class Ex4 {

	public static void main(String[] args) {
		/*
		 * 싱글톤 디자인 패턴(Singleton Design Pattern)
		 * 
		 * - 단 하나의 유일한 인스턴스만을 생성해 공유하도록 하는 기법
		 * 
		 * - 외부에서 인스턴스 생성을 하지 못하도록 차단하고
		 *   클래스 내에서 직접 인스턴스를 생성 후 외부로 리턴하는 기법
		 *   
		 * - 누구나 단 하나의 인스턴스만을 공유해 사용해야 함
		 *   ( => 즉 외부에서 new를 통한 새 인스턴스 생성 불가능!)
		 *   
		 * < 패턴 규칙 >
		 * 
		 * 1. 외부에서 인스턴스 생성이 불가능하도록 생성자에 private 접근 제한자 선언
		 * 
		 * 2. 자신의 클래스에서 직접 인스턴스를 생성해 참조변수에 저장한다
		 *    => 외부에서 인스턴스 생성없이도 접근할 수 있도록 static 사용
		 *    => 외부에서 접근하지 못하도록 private 접근제한자 선언
		 *    
		 * 3. 생성된 인스턴스를 외부로 리턴하는 Getter 메서드 정의
		 *    => private 접근제한자로 선언된 멤버변수 instance에 접근해
		 *       생성된 인스턴스를 리턴하는 용도로 정의
		 *    => 인스턴스 생성없이 호출해야하므로 static 사용   
		 * 
		 * 
		 */
		
		// SingletonClass 클래스 인스턴스 생성
//		SingletonClass sc = new SingletonClass();
//		SingletonClass sc2 = new SingletonClass();
		// => The constructor SingletonClass() is not visible
		// => 생성자가 private이므로 외부에서 호출 불가
		
		// 클래스 내에서 인스턴스를 생성해 멤버변수 instance에 저장함
		// 해당 변수를 통해 인스턴스를 가져올 수 있다. (접근 가능)
		// => 이 때 해당 변수는 static 변수이므로 클래스명만으로 접근 가능함
//		SingletonClass sc = SingletonClass.instance;
		
		// 주의 ▶ SingletonClass로부터 리턴받은 인스턴스를 통해
		// 클래스 내의 SingletonClass 타입 변수 instance에 접근이 가능하므로
		// 해당 변수 값을 변경할 우려가 있음
//		SingletonClass.instance = null;
//		sc.instance = null;
		// 외부에서 멤버변수에 접근할 수 없도록
		// private 접근 제한자를 사용
		
		// SingletonClass 내에서 싱글톤 디자인 패턴으로 생성된 인스턴스를
		// 변수 instance에 저장했지만, private 접근제한자로 인해 접근이 차단됨
		// getInstance() 메서드 호출 통해 주소값을 가져올 수 있다
		// => 이때 getInstance() 메서드는 static 메서드이므로
		//    클래스명.메서드명() 형태로 호출이 가능하다
		// => 즉 인스턴스 생성 없이도 클래스 내의 메서드 호출 가능하다
		SingletonClass sc = SingletonClass.getInstance();
		
		// 리턴받은 인스턴스는 참조변수(sc)를 통해 접근 가능함
		sc.str = "싱글톤 패턴으로 생성한 인스턴스의 str!";
		System.out.println("sc.str : " + sc.str);
		
		SingletonClass sc2 = SingletonClass.getInstance();
		System.out.println("sc2.str : " + sc2.str);
		
		// if문을 통해 두 인스턴스(sc, sc2)가 같은 지 비교
		if(sc.equals(sc2)) {
			System.out.println("sc와 sc2는 같다");
		} else {System.out.println("sc와 sc2는 다르다");}
		
		
	}

}

class SingletonClass {
	
	String str ; // 임시확인용
	
	// 기본 생성자 >> public SingletonClass () {}
	
	// 1. 외부에서 인스턴스 생성이 불가능하도록 생성자에 private 접근 제한자 선언
	private SingletonClass() {
		System.out.println("싱글톤 패턴, 생성자");
	}
	
	

	// 2. 자신의 클래스에서 직접 인스턴스를 생성해 참조변수에 저장한다
	private static SingletonClass instance = new SingletonClass();
	
	// 3. 생성된 인스턴스를 외부로 리턴하는 Getter 메서드 정의
	// => 인스턴스를 저장하는 변수 instance가 private 접근 제한자이므로
	//    접근이 불가능한 대신 인스턴스를 리턴하는 목적으로 정의
	// => 인스턴스 생성없이 접근해야하므로 static 사용
	public static SingletonClass getInstance() {
		return instance;
	}
	
}

// 코드 작성 순서에 따른 싱글톤 패턴 구현 순서
class SingletonClass2 {
	// 멤버변수 >> 생성자 >> 메서드
	
	// 1. 자신의 인스턴스를 생성해 자신의 클래스 타입 변수 instance에 저장
	//    => private static 선언
	private static SingletonClass2 instance = new SingletonClass2();
	
	// 2. 생성자 정의 => private 선언
	private SingletonClass2() {}
	
	// 3. Getter 정의 => public static 선언
	public static SingletonClass2 getInstance() {
		return instance;
	}
}











