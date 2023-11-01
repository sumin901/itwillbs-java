package inheritance;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 상속의 장점
		 * 
		 * 1. 코드 재사용성 증가
		 * 
		 * 2. 코드 유지 보수성 용이
		 * 
		 *  
		 */
		
		Point3D p3 = new Point3D();
		p3.print3D();

	}

}


// 좌표 (x,y)를 관리하는 Point2D 클래스

class Point2D {
	int x = 10;
	int y = 11;
	// 2차원 좌표값 출력하는 print2D() 메서드
	public void print2D () {
		System.out.printf("%d, %d, ", x, y);
		// 슈퍼클래스 메서드를 수정하면 서브클래스에서 수정 내용에 대한 적용을 받을 수 있다
	}
}

// 3차원 좌표 (x,y,z)를 관리하는 Point3D class
class Point3D extends Point2D {
	// x, y 좌표 관리기능은 기본적으로 부모 클래스(Point2D)에서 상속받음
	int z = 13;
	public void print3D () {
		print2D();
		System.out.printf("z좌표 : %d\n",z);
	}
}