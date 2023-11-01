package method_overriding;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 
		 *  
		 *  
		 *  
		 */
		Student st1 = new Student();
		st1.name = "홍길동";
		
		Student st2 = new Student("ㅇㅅㅁ", 27, false, false);
		st2.eat("고기");
		st2.sleep();
		st2.study();
	}

}


class Person {
	
	String name = null;
	int age;
	boolean isHungry = true;
	
	public Person() {
		System.out.println("Person() 생성자 호출 완료");
	}
	
	public void eat(String str) {
		System.out.println(str + "먹기");
		isHungry = false;
	}
	
	public void sleep() {
		System.out.println("Zzz");
		isHungry = true;
	}
}

class Student extends Person {
	boolean isStudyMode;
	
	public Student() {
		super(); // Student 클래스의 기본 생성자가 호출 되면 그보다 앞서 슈퍼 클래스인 Person의 기본 생성자가 자동 호출
		System.out.println("Student() 생성자 호출 완료");
	}
	// 이름 나이 배고픔 공부모드를 전달받아 초기화
	
	public Student(String name, int age, boolean isHungry, boolean isStudyMode) {
		super(); // Student(String, int, boolean, boolean)이 호출되면 슈퍼 클래스 Person 클래스의 기본 생성자가 자동 호출
		System.out.println("Student(String, int, boolean, boolean) 생성자 호출 완료");
		this.name = name;
		this.age = age;
		this.isHungry = isHungry;
		this.isStudyMode = isStudyMode;								
	}
	
	public void study () {
		isStudyMode = true;
		System.out.println("공부하기");
	}
}