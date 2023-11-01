package polymorphism;

import javax.sql.rowset.serial.SerialArray;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 다형성(Polymorphism)
		 * - 하나의 데이터타입(참조변수)으로 여러 인스턴스를 참조하는 특성
		 * - 어떤 인스턴스를 업캐스팅하여 슈퍼클래스 타입 변수로 다루면
		 *   하나의 슈퍼클래스 타입으로 여러 서브클래스 타입 인스턴스를 다룰 수 있음.
		 */
		
		// Circle 인스턴스(c) 생성
		Circle c = new Circle();
		c.circlePaint();
		
		// Rectangle 인스턴스(r) 생성
		Rectangle r = new Rectangle();
		r.rdraw();
		
		// Triangle 인스턴스(t) 생성
		Triangle t = new Triangle();
		t.design();

		System.out.println("------------------------------------------");
		
		// 슈퍼클래스의 메서드를 상속받아 오버라이딩 하는 경우
		// 코드의 통일성이 향상될 수 있다.
		c.draw();
		t.draw();
		r.draw();
		
		System.out.println("-----------------------------------------------");
		
				// 코드의 통일성을 더 향상시키기 위한 업캐스팅 활용
		// Circle, Rectangle, Triangle의 공통 슈퍼클래스인
		// Shape 타입 (s)로 세 인스턴스를 컨트롤한다
		Shape s = new Circle();
		s.draw();
		s = new Rectangle();
		s.draw();
		s = new Triangle();
		s.draw();
		
		System.out.println("==============================================");
		
		// 다형성을 배열에 적용시키는 경우
		// 슈퍼클래스 타입으로 배열을 생성해 
		// 배열의 각 인덱스에 각각의 서브클래스 인스턴스를 저장 가능
//		Shape[] sArr = new Shape[3];
//		sArr[0] = new Circle();
//		sArr[1] = new Rectangle();
//		sArr[2] = new Triangle();
		
		Shape[] sArr = {new Circle(), new Triangle(), new Rectangle()};
		// 각 배열의 인덱스는 인스턴스 주소가 저장됨
		// 참조변수와 마찬가지로 배열명[인덱스].메서드명() 형태로 호출 가능
//		sArr[0].draw();
//		sArr[1].draw();
//		sArr[2].draw();
		
		for( int i = 0 ; i < sArr.length ; i++) {
			sArr[i].draw();
		}
		
		Ex2 ex = new Ex2();
		// 1. 이미 다형성이 적용된 배열을 메서드 파라미터로 전달
		ex.polymorphismDraw(sArr);
			// static 메서드가 아닌 경우 
			// 인스턴스를 먼저 생성 후 참조변수를 통해 호출 가능
			// 반면, static이 설정이 되어 있는 '클래스(정적) 메서드'를 호출하는 경우
			// 인스턴스를 생성하지 않아도 클래스명.메서드 형태로 호출이 가능
			// 이 때 자신의 클래스 내에서 정의한 '클래스(정적) 메서드'라면
			// 클래스명은 생략 가능
			
			//			< 정리 > 
			
			// 같은 클래스 내 : 클래스명 생략 가능 1. static X 메서드 - 인스턴스 생성 후 참조변수를 통해 호출
												 //2. static O 메서드 - 메서드명() 으로만 바로 호출 가능
			// 다른 클래스 : 					 //1. static X 메서드 - 인스턴스 생성 후 참조변수를 통해 호출
												 //2. static O 메서드 - 클래스명.메서드명() 으로만 바로 호출 가능
		System.out.println("----------------------------------------------------");
		// 2. 메서드 파라미터로 인스턴스를 직접 전달
		ex.polymorphismDraw2(new Rectangle());
		ex.polymorphismDraw2(new Circle());
		ex.polymorphismDraw2(new Triangle());
		
		
	}	// main 끝
	
	// 메서드에 다형성 활용
	public void polymorphismDraw(Shape[] sArr) {
		// 반복문 사용 배열의 모든 인스턴스 draw() 호출
		for ( int i = 0 ; i < sArr.length ; i++) {
			sArr[i].draw();
		}
	}
	
	
	public void polymorphismDraw2(Shape s) {
		// 어떤 인스턴스가 전달되더라도 draw()메서드는 공통이므로 호출 가능
		s.draw();
		// Shape 자식 중 아무것이나 파라메터로 전달해줘도 알아서 자동 형변환으로 업캐스팅한다
	}
	
	
} // Ex2 클래스 끝

// 여러 도형의 특징을 공통적으로 포함하는 슈퍼클래스 Shape 정의
class Shape {
	
	// 여러 도형의 공통점인 '그리다' 기능을 수행하는 draw() 메서드 정의
	public void draw() {
		System.out.println("도형 그리기!");
	}
}

// Shape 클래스를 상속받는 Circle 클래스 정의
class Circle extends Shape {
	
	@Override
	public void draw() {
		System.out.println("원 그리기!");
	}

	public void circlePaint() {
		System.out.println("원 그리기!");
	}
}

// Shape 클래스를 상속받는 Rectangle 클래스 정의
class Rectangle extends Shape {
	
	@Override
	public void draw() {
		System.out.println("사각형 그리기!");
	}

	public void rdraw() {
		System.out.println("사각형 그리기!");
	}
}

// Shape 클래스를 상속받는 Triangle 클래스 정의
class Triangle extends Shape {
	
	@Override
	public void draw() {
		System.out.println("삼각형 그리기!");

	}

	public void design() {
		System.out.println("삼각형 그리기!");
	}
}







