package thread;

public class Ex3 {

	public static void main(String[] args) {

		// Runnable 인터페이스 구현체 클래스의 인스턴스 생성
		YourThread yt1 = new YourThread("++A작업++", 123);
		YourThread yt2 = new YourThread("@@B작업@@", 123);
		YourThread yt3 = new YourThread("--C작업--", 123);
		
		// Runnable 인터페이스에는 start() 메서드가 없기 때문에 
		// Thread 클래스 인스턴스 생성 시에 파라미터 값으로 Runnable 객체를 전달
		// => Thread 객체의 start() 메서드를 통해 간접적으로 멀티쓰레딩 수행
		Thread t1 = new Thread(yt1);
		Thread t2 = new Thread(yt2);
		Thread t3 = new Thread(yt3);
		
		// -------------------------------------------------------------------------
		// YourThread 타입 변수 ytn은 Thread 생성자에 전달 작업 외에 불필요
		// => 1회성 변수를 선언하기 보다 생성자에 인스턴스를 직접 전달 가능!
		Thread t4 = new Thread(new YourThread("##D작업##", 123));
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}


class A {}
// 이미 A 클래스를 상속받은 YourThread 클래스에 멀티 쓰레딩을 구현할 경우
// => Thread 클래스를 상속 받지 못함 (= 자바의 다중 상속 불가 )
// => Runnable 인터페이스를 구현한다 !


class YourThread extends A implements Runnable {

	String name;
	int count;
	
	public YourThread(String name, int count) {
		super();
		this.name = name;
		this.count = count;
	}
	
	// 오버라이딩 후 멀티 쓰레딩으로 처리 할 코드 기술
	@Override
	public void run() {

		for(int i = 1; i <= count; i++) {
			System.out.println(name + " : " + i);
		}
		
	}
	
}
