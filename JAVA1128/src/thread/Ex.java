package thread;

public class Ex {

	public static void main(String[] args) {

		/*
		 * 프로그램(Program)
		 * - 디스크에 설치되어 있는 실행되기 전 상태의 소프트웨어
		 * 
		 * 프로세스(Process)
		 * - 설치된 프로그램을 실행해 메모리에 로딩된 상태 (=실행 중인 프로그램)
		 * - 자원(resources)과 쓰레드(thread)로 구성된다
		 * 
		 * 멀티태스킹 (Multi-Tasking)
		 * - 프로세스가 여러 개 일 때 해당 프로세스들이 동시에 수행되는 것
		 *   (엄밀히 말하자면, CPU가 빠른 속도로 프로세스들을 번갈아가면서 수행)
		 * - 예시) 동영상 재생과 웹페이지 표시, 음악 재생을 동시에 수행
		 * 
		 * 쓰레드(Thread)
		 * - 프로세스 내에서 작업의 최소 단위
		 * - 프로세스 내에서 실제 작업의 수
		 * - 하나의 프로세스 내에서는 최소 1개의 쓰레드가 동작한다
		 *   1개 동작 = Single Thread
		 *   => 동시에 수행 가능한 작업은 단 한 개
		 * - 하나의 프로세스 내에서 동시에 수행 가능한 작업을 늘리려면, 
		 *   멀티 쓰레드(Multi-Thread)로 구현해야함
		 * - 하나의 새로운 프로세스를 실행하는 것보다 하나의 새로운 쓰레드를 생성하는 것이
		 *   더 적은 비용을 소모한다
		 *   
		 * 
		 * 
		 * 
		 */
		
		
		NoThread not1 = new NoThread("==A작업==", 100000);
		NoThread not2= new NoThread("**B작업**", 50000);
		NoThread not3 = new NoThread("@@C작업@@", 100000);
		not1.run();
		not2.run();
		not3.run();
		// 일반적인 쓰레드는 싱글 쓰레드로 앞선 작업이 끝난 후 다음 작업이 진행 됨.
		
	}

}


class NoThread {
	
	String name;
	int count;
	public NoThread(String name, int count) {
		this.name = name;
		this.count = count;
	}
	
	public void run() {
		
		for(int i = 1; i < count ; i++) {
			System.out.println(name + " : " + i);
		}
		
	}
	
}
