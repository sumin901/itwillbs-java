package access_modifier_p2;

import access_modifier_p1.ParentClass;

public class OtherPackageChildClass extends ParentClass{
	
	public void useMember() {
		// 다른 패키지의 상속 관계 부모 클래스의 멤버에 접근
		// 슈퍼 클래스 멤버에 접근할 땐 참조변수 없이 접근해야함
		// 또는 this를 통해 접근한다
		this.publicVar = 14;
		this.protectedVar = 28; // 다른 패키지라 원래 불가능하지만 상속했기 때문에 가능
//		this.defaultVar = 42; default - 다른 패키지에서는 접근 불가 (상속 관계라하더라도)
//		this.priavate
		
		System.out.println("===============================================");
		
		// 서브클래스에서 슈퍼클래스의 인스턴스 생성 후 참조변수를 통해 접근 시 
		// is-a 관계가 아닌 has-a 관계로 취급되므로 protected도 접근 불가능함
		
		ParentClass p = new ParentClass();
		p.publicVar = 11;
//		p.protectedVar = 22; >> 패키지 다르고, 상속 관계가 아니므로(인스턴스로 접근) 접근 불가능
//		p.defaultVar = 33; >> 다른 패키지 접근 불가능
//		p.privateVar = 44; >> 다른 클래스 접근 불가능
		
		
	}
}
