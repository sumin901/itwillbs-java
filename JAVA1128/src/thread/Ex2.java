package thread;

public class Ex2 {

	public static void main(String[] args) {

		/*
		 * 멀티 쓰레딩
		 * - 하나의 프로세스 내에서 두 가지 이상의 작업(Thread)을 동시에 처리하는 방법
		 * - 실제로 두 가지 이상의 작업을 동시에 수행하는 것은 아니며
		 *   CPU가 빠른 속도로 여러 작업을 번갈아가면서 수행하는 것
		 *   동시에 처리되는 것처럼 느끼게 하는 것임 = Round Robin 방식
		 * - 멀티 쓰레딩으로 처리되는 작업 순서는 고정된 것이 아니라 변동됨
		 * - 항상 실행 결과는 달라질 수 있다.
		 *   > 이는 운영체제 스케쥴링에 따라 처리되는 순서 및 횟수가 달라지기 때문이다
		 *
		 * 
		 * < 멀티 쓰레딩 구현 방법 >
		 * 
		 * 1. Thread 클래스를 상속받는 서브 클래스를 정의하는 방법
		 *		1) 멀티쓰레딩 코드가 포함될 서브 클래스에서 Thread 클래스 상속
		 *		2) Thread 클래스의 run() 메서드를 오버라이딩해 멀티쓰레딩으로 처리할 코드 기술
		 *		3) 멀티쓰레딩으로 구현된 클래스의 인스턴스 생성
		 *		4) 생성된 인스턴스의 start() 메서드 호출해 시작한다
		 * 
		 * 2. Runnable 인터페이스를 구현하는 서브 클래스를 정의하는 방법
		 * 		1)
		 * 
		 * 
		 * 3. 멀티쓰레딩으로 처리 할 위치의 코드에 직접 Thread를 구현하는 방법
		 * 
		 * 
		 */
		
		MyThread mt1 = new MyThread("++A작업++", 100);
		MyThread mt2 = new MyThread("--B작업--", 100);
		MyThread mt3 = new MyThread("@@C작업@@", 100);
		
		// 멀티쓰레딩 코드 실행
		// ! run() 메서드를 직접 호출 시 싱글 쓰레딩으로 처리되므로 주의한다
			mt1.start();
			mt2.start();
			mt3.start();
		
		// start() 메서드 실행 시 
		// 1. main() 메서드에서 쓰레드의 start() 메서드를 호출
		// 2. start() 메서드는 쓰레드가 작업을 수행하는데 사용될 새로운 호출 스택(Call Stack) 생성
		// 3. 생성된 호출 스택에 run() 메서드를 호출해서 쓰레드가 작업을 수행하도록 함
		// 4. 호출 스택이 3개이기 때문에 스케쥴러가 정한 순서에 의해서 번갈아 가면서 수행한다
			
	}

}

// 멀티쓰레딩을 구현한 서브클래스를 Thread 클래스 상속을 통해 정의
class MyThread extends Thread {
	
	String name;
	int count;
	public MyThread(String name, int count) {
		super();
		this.name = name;
		this.count = count;
	}
	// Thread 클래스의 run() 메서드를 오버라이딩 해 멀티쓰레딩으로 처리할 코드 기술
	@Override
	public void run() {
		for(int i = 1; i < count ; i++) {
			System.out.println(name + " : " + i);
		}
	}
	
	
	
}
