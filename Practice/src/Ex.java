

public class Ex {
	public static void main(String[] args) {
	
		Unit u = new GroundUnit();
		Tank t = new Tank();
		AirCraft ac = new AirCraft();
		
//		a. u = (Unit)ac;
//		b. u = ac;
//		c. GroundUnit gu = (GroundUnit)u;
//		d. AirUnit au = ac;
//		e. t = (Tank)u;
//		f. GroundUnit gu = t;
		
		
	}
}
class Unit {}
class AirUnit extends Unit{}
class GroundUnit extends Unit{}
class Tank extends GroundUnit{}
class AirCraft extends AirUnit{}