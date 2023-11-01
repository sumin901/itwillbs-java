package interface_;

public class Ex4 {

	public static void main(String[] args) {
		// 3. 서로 상속 관계가 없는 클래스간에 인터페이스를 통한 상속 관계 부여
		// => 다형성 확장
		Ex4 ex = new Ex4();
		ex.noRelationship();
		ex.hasRelationship();
	} // main
	
	public void noRelationship() {
//		NoteBookPc notebook = new NoteBookPc();
//		SmartPhone smartphone = new SmartPhone();
//		notebook.charge();
//		smartphone.charge();
//		
		// 두 개의 인스턴스를 하나의 배열로 관리할 경우
		// NotebookPc 와 SmartPhone의 공통 타입은 Object 타입밖에 없다
		Object[] objArr = {new NoteBookPc(), new SmartPhone()};
		
		// 반복문 사용 배열 크기만큼 반복
		for(int i = 0 ; i < objArr.length ; i++) {
//			objArr[i].charge(); => 오류 : The method charge() is undefined for the type Object
//										  업캐스팅으로 인한 참조 영역 축소로 메서드 호출 불가능
			// instanceof 연산자를 사용, NoteBookPc와 SmartPhone 타입 판별
			// => 다운 캐스팅을 통해 각 인스턴스를 따로 접근해야 한다
			//    접근하고자 하는 charge() 메서드는 각 클래스에서 직접 정의한 인스턴스 멤버 메서드이기 때문
			if(objArr[i] instanceof NoteBookPc) {
				
				NoteBookPc noteBookPc = (NoteBookPc)objArr[i];
				noteBookPc.charge();
			} else if (objArr[i] instanceof SmartPhone) {
				SmartPhone smartphone = (SmartPhone)objArr[i];
				smartphone.charge();
				
			}
		}
		
		
	}
	
	public void hasRelationship () {
		// 인터페이스를 사용해 공통된 멤버를 갖는 상속 관계를 부여할 경우
		// 해당 인터페이스 타입으로 다운캐스팅 할 필요없이
		// 업캐스팅 된 상태 그대로 멤버에 접근 가능 = 다형성으로 인한 코드 절약
//		Chargeable c = new NoteBookPc2(); // NoteBookPc2 -> Chargeable 업캐스팅
//		Chargeable c2 = new SmartPhone2(); // SmartPhone2 -> Chargeable 업캐스팅
		
		// 두 개의 인스턴스를 하나의 배열로 관리
		Chargeable[] chargeableArr = {new NoteBookPc2(), new SmartPhone2()};
		// 업캐스팅 후 공통 메서드 charge()
		// 별도의 다운캐스팅 없이 호출 가능

		for(int i = 0 ; i < chargeableArr.length ; i++) {
			chargeableArr[i].charge();
		}
		
		
		
	}
	

} // Ex4
// Object 클래스 외 슈퍼클래스가 없는 NoteBookPc와 SmartPhone 의
// 공통 인터페이스 Chargeable
interface Chargeable {
	// 두 클래스 공통 charge() 기능
	void charge(); // public abstract 생략
}

//==================================================
// 기존 Pc클래스를 상속받고 있는 상태에서
// 추가로 인터페이스를 구현해야 하는 경우 상속 코드 뒤에 구현 코드를 기술한다
// -> implemets Chargeable 코드 추가
// -> 아무 관계도 없던 두 클래스에 동일한 부모 인터페이스가 추가되 서로 상속 관계로 묶인다.

class NoteBookPc2 extends Pc implements Chargeable {

	@Override
	public void charge() {
		System.out.println("노트북 충전2");
		
	}
	
}

class SmartPhone2 extends HandPhone implements Chargeable {

	@Override
	public void charge() {
		System.out.println("스마트폰 충전2");
		
	}

	
	
}

class Pc{}

class NoteBookPc extends Pc {
	public void charge() {
		System.out.println("노트북 충전");
	}
}

class HandPhone{}

class SmartPhone extends HandPhone {
	public void charge() {
		System.out.println("스마트폰 충전");
	}
}



