package interface_;

public class Test2 {
	
	public static void main(String[] args) {
		BumbleBee bb = new BumbleBee();
		bb.speak();
		bb.transform(2);
		bb.transform(3);
		bb.fight();
	}	
}

/*
 * 전투 기능을 갖는 Fightable 인터페이스
 * - fight() 메서드
 * 
 * 변신 기능을 갖는 Transformable 인터페이스
 * - transform() 메서드 (리턴X, 파라미터 : int mode)
 * - 상수 값(MODE_CAR = 1, MODE_AIRPLANE = 2, MODE_NORMAL = 3)
 * 
 * Robot 인터페이스
 * - Fightable, Transformable 인터페이스 상속
 * - 말하기 기능(speak())
 * 
 * Robot 인터페이스를 구현하는 BumbleBee 클래스
 * - fight() 메서드 호출 시 "로켓 발사"
 * - transform()  메서드 호출 시 mode값에 따라 다른 형태로 변신
 * - MODE_NORMAL : "기본모드(로봇) 변신"
 * - MODE_CAR : "자동차 변신"
 * - MODE_AIRPLANE : "비행기 변신"
 * - speak() : "라디오로 말하기"
 * 
 */

interface Fightable {
	void fight();
}

interface Transformable {
	int mode = 1;
	void transform(int mode);
}

interface Robot extends Fightable, Transformable{
	void speak();
}

class BumbleBee implements Robot {
	@Override
	public void transform(int mode) {
		switch(mode) {
		case 1: System.out.println("자동차 변신");
		break;
		case 2: System.out.println("비행기 변신");
		break;
		case 3: System.out.println("기본모드(로봇) 변신");
		break;
		}
		
	}

	@Override
	public void fight() {
		// TODO Auto-generated method stub
		System.out.println("로켓 발사");
	}

	@Override
	public void speak() {
		System.out.println("라디오로 말하기");
			
		} 
		
	}
	


