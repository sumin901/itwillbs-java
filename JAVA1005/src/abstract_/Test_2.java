package abstract_;

public class Test_2 {

	public static void main(String[] args) {
		
		Vehicle[] ve = {new ElectricCar(), new DieselCar()};
		ve[0].setCurX(10);
		ve[0].setCurY(20);
		ve[0].reportPosition();
		ve[0].addFuel();
		
		ve[1].setCurX(130);
		ve[1].setCurY(7);
		ve[1].reportPosition();
		ve[1].addFuel();
	}

}

/*
 *	Vehicle 클래스 
 *	멤버변수 : curX, curY - int, 현재 좌표 저장
 *	메서드 : reportPosition(리턴타입x, 매개변수x)
 *			 => "현재 위치 : curX, curY "
 *			 addFuel(리턴타입x, 매개변수x)
 *			 => 차량마다 연료 공급 방법이 다르다.
 *			 => 오버라이딩 강제	
 */

/*
 *	Vehicle 상속 ElectricCar, DieselCar 클래스
 *	ElectricCar.addFuel() : "전기차 충전소, 배터리 충전"
 *	DieselCar.addFuel() : "주유소, 디젤 공급" 
 * 
 */

abstract class Vehicle {
	int curX;
	int curY;
	
	public int getCurX() {
		return curX;
	}
	public int getCurY() {
		return curY;
	}
	public void setCurX(int curX) {
		this.curX = curX;
	}
	public void setCurY(int curY) {
		this.curY = curY;
	}
	public void reportPosition() {
		System.out.println("현재 위치 : " + curX + ", " + curY);
	}
	public abstract void addFuel();
		
	
}

class ElectricCar extends Vehicle {

	@Override
	public void addFuel() {
		System.out.println("전기차 충전소, 배터리 충전");
		
	}
	
}
class DieselCar extends Vehicle {

	@Override
	public void addFuel() {
		System.out.println("주유소, 디젤 공급");
		
	}
	
}

