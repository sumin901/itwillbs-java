package access_modifier_p2;

import access_modifier_p1.ParentClass;

public class OtherPackageSomeClass {
	public void useMember() {
		// 다른 패키지와 상속 관계가 아닌 다른 패키지 다른 클래스에서의 접근
		
		// 인스턴스 생성 후 참조변수를 통해 접근 해야함 = has-a 관계
		// import문 필요
		
		ParentClass p = new ParentClass();
		p.publicVar = 13;			// O
//		p.protectedVar = 23;		// X, 패키지가 다르고 상속 관계도 아님
//		p.defaultVar = 33;			// X, 패키지가 다르다
//		p.privateVar = 44;			// X, 다른 클래스에서 접근 불가
	}
}
