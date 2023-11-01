package access_modifier_p1;
		// << 같은 패키지므로 import문이 불필요하다
public class SamaPackageSomeClass {
	
	public void useMember() {
		
		// 같은 패키지 내의 다른 클래스 (ParentClass)에 접근
		// 인스턴스 생성 후 참조 변수를 통해 접근해야 함
		ParentClass pc = new ParentClass();
		pc.publicVar = 1;
		pc.protectedVar = 2;
		pc.defaultVar = 3;
//		pc.privateVar = 4; << private는 같은 패키지 내 같은 클래스에서만 사용가능
		
	}
}
