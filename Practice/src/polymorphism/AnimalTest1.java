package polymorphism;

public class AnimalTest1 {

	public static void main(String[] args) {
		
		Animal ani = new Animal();
		ani.move();
		Human hu = new Human();
		hu.move();
		Tiger ti = new Tiger();
		ti.move();
		Eagle eg = new Eagle();
		eg.move();
		System.out.println("----------------");
		
		
		
		AnimalTest1 ani1 = new AnimalTest1();
		ani1.moveAnimal(new Human());
		ani1.moveAnimal(new Eagle());
		ani1.moveAnimal(new Tiger());
		ani1.moveAnimal(new Animal());
		
		
	}
	
	public void moveAnimal(Animal ani) {
		ani.move();
	}

}
class Animal {
	public void move() {
		System.out.println("동물이 움직입니다");
	}
}
class Human extends Animal {
	public void move() {
		System.out.println("사람이 두 발로 걷습니다");
	}
	
}
class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다");
	}
}
class Eagle extends Animal {
	public void move() {
		System.out.println("독수리가 하늘을 납니다");
	}
}