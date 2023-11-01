package interface_;

public class Test4 {

	public static void main(String[] args) {
		Photoshop p = new Photoshop();
		Circle cc = new Circle();
		cc.setRadius(3.1);
		Rectangle rec = new Rectangle();
		rec.setHeight(1.5);
		rec.setWidth(6.1);
		p.draw(cc);
		p.draw(rec);

	}

}
// 모든 도형 그리기 기능을 제공하는 "Shape" 인터페이스
// draw() (리턴X, paramX)

// Circle, Rectangle implements Shape
// draw() 구현
// Circle : 원 그리기, Rectangle : 사각형 그리기 출력
// Circle : 멤버변수(반지름, radius : 실수형, 접근제한자 : private)
//			Setter(), draw() : "원 그리기, 반지름 : 반지름 길이" 출력
// Rectangle : 멤버변수(가로(width) : 실수형, 접근제한자 : private)
//                     (세로(height) : 실수형, 접근제한자 : private)
//			Setter(), draw() : "사각형 그리기, 가로 : 가로 길이 / 세로 : 세로 길이" 출력

// PhotoShop 클래스 정의
// draw() 메서드 정의
// => Circle, Rectangle 인스턴스를 전달받아 해당 인스턴스의 draw() 호출
//    두 인스턴스의 공통 타입으로 Shpae 인터페이스를 파라미터 타입으로 지정한다

interface Shape {
	void draw();
}

class Circle implements Shape {
	private double radius;

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("원 그리기, 반지름 : " + radius);
		
	}
	
}

class Rectangle implements Shape {
	private double width;
	private double height;

	public void setWidth(double width) {
		this.width = width;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	@Override
	public void draw() {
		System.out.println("사각형 그리기, 가로 : " + width + " 세로 : " + height);
		
	}
	
}
// PhotoShop 클래스 정의
// draw() 메서드 정의
// => Circle, Rectangle 인스턴스를 전달받아 해당 인스턴스의 draw() 호출
//    두 인스턴스의 공통 타입으로 Shpae 인터페이스를 파라미터 타입으로 지정한다
class Photoshop {
	public void draw(Shape shape) {
		shape.draw();
	}
}







