package interface_;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * 				인터페이스의 필요성
		 * 
		 * 1. 구현의 강제로, 코드의 통일성 향상 (=표준화)
		 * 
		 * 2. 인터페이스를 통한 간접적인 클래스 사용으로 모듈 교체 용이 (메모리 효율 증대)
		 *    => 특정 클래스를 직접 다루는 대신
		 *       부모 인터페이스 타입으로 클래스를 다루면,
		 *       실제 인스턴스가 바뀌더라도 기존 코드를 수정할 필요가 없다
		 * 
		 * 3. 서로 상속 관계가 없는 클래스간의 인터페이스를 통한 상속 관계 부여
		 *    => 다형성 확장
		 * 
		 * 4. 모듈간 독립적 프로그래밍으로 인한 개발 기간 단축
		 * 
		 * 
		 */
		LaserPrinter lp = new LaserPrinter();
		lp.print("a.txt");
		InkjetPrinter ip = new InkjetPrinter();
		ip.print("b.txt");
		DotPrinter dp = new DotPrinter();
		dp.print("c.txt");
		Printer p = lp;
		p.print("d.txt");
		
		//=============================================================================
		
		PrinterClient pc = new PrinterClient();
		// PrinterClient 인스턴스의 setPrinter() 메서드를 호출해
		// 각 프린터기 인스턴스를 파라미터로 전달하면 업캐스팅 자동
		pc.setPrinter(new LaserPrinter()); // LaserPrinter -> Printer 업캐스팅
		// setPrinter(Printer printer)로 정의되어있으므로
		// Printer printer = new LaserPrinter(); 와 같다
		// 좌변이 부모, 우변이 자식 클래스 즉 업캐스팅이 일어난다
		
		pc.print("Hello, Java");
		// PrinterClient 인스턴스에 print() 메서드 호출 시
		// 인스턴스 내 Printer 타입 변수에 저장된 인스턴스 print() 메서드 호출
		// 결국 실제 저장된 LaserPrinter 인스턴스 print() 메서드 호출
		
		// LaserPrinter -> InkjetPrinter
		// setPrinter() 메서드에 잉크젯프린터 인스턴스만 전달
		pc.setPrinter(new InkjetPrinter());
		pc.print("Bye, Java");
		pc.setPrinter(new DotPrinter());
		pc.print("Ex3");
		
		
				
		
		
	}

}

/*
 * 
 * 문서를 프린터로 출력하기 위해 각 프린터 클래스를 정의한다
 * 
 *  각 프린터의 출력 기능을 갖는 printer 인터페이스를 정의하고
 *  각 프린터 클래스에서 상속받아 구현한다
 *  
 *  
 */

/*
 * 각 프린터를 직접 다루지 않고 상위 타입인 Printer 인터페이스를 다루는 
 * PrinterClient 클래스 정의
 * 
 */
class PrinterClient {
	// 각각의 플린터 클래스를 다루기 위한 슈퍼 클래스 타입에 해당하는 
	// Printer 인터페이스 타입 변수 선언
	private Printer printer;

	// Setter 메서드를 통한 Private 타입 변수 초기화
	public void setPrinter(Printer printer) {
		this.printer = printer;
	}
	// 외부로부터 출력할 파일을 전달받아 실제 프린터에 해당하는 각 인스턴스의
	// print() 메서드를 호출한 뒤 파일을 전달해 출력 작업 수행
	public void print(String fileName) {
		// Printer 타입 변수에 저장된 각 프린터의 인스턴스를 통해
		// print() 메서드를 호출하면 해당 프린터의 출력 기능을 사용가능하다
		printer.print(fileName);
	}
	
}



/* 2. 인터페이스를 통한 간접적인 클래스 사용으로 모듈 교체 용이
*    => 특정 클래스를 직접 다루는 대신
*       부모 인터페이스 타입으로 클래스를 다루면,
*       실제 인스턴스가 바뀌더라도 기존 코드를 수정할 필요가 없다
*/

interface Printer {
	// 프린터기의 공통 기능 print 추상 메서드
	public abstract void print(String fileName);
}

class LaserPrinter implements Printer {
	// fileName을 전달받아 출력하는 print() 메서드
	// Printer 인터페이스 상속받아 구현한다
	@Override
	public void print(String fileName) {
		System.out.println("레이저프린터로 출력, file : " + fileName);
		
	}
	
}

class InkjetPrinter implements Printer {

		
	// fileName을 전달받아 출력하는 print() 메서드
	// Printer 인터페이스 상속받아 구현한다
	
@Override
public void print(String fileName) {
	System.out.println("잉크젯프린터로 출력, file : " + fileName);
	}
}

class DotPrinter implements Printer {
	
	
	// fileName을 전달받아 출력하는 print() 메서드
	// Printer 인터페이스 상속받아 구현한다
	
	@Override
	public void print(String fileName) {
		System.out.println("도트젯프린터로 출력, file : " + fileName);
	}
}



