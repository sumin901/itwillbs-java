package thread;

import java.time.LocalTime;

public class Ex5 {

	public static void main(String[] args) {
		
		/*
		 * 쓰레드의 우선순위
		 * 
		 * - 스케쥴러가 어떤 쓰레드를 실행하는데 있어 우선순위에 따라 실행한다
		 *   ! 절대적인 수치는 아니며, 확률적으로 실행 비중을 높인다
		 * 
		 * - Thread 객체의 getPriority() 메서드 : 우선순위 조회
		 *   Thread 객체의 setPriority() 메서드 : 우선순위 설정
		 *   => 우선순위는 1 ~ 10 범위의 정수
		 *   => 자주 사용되는 우선순위 값을 Thread 클래스의 상수로 제공한다
		 *      MAX_PRIORITY : 10(높음)
		 *      NORM_PRIORITY : 5(보통)
		 *      MIN_PRIORITY : 1 (낮음)
		 * 
		 * 쓰레드를 일시 정지 상태로 만들기
		 * 
		 * - Thread 클래스의 static 메서드 sleep() 메서드를 호출하면 
		 *   해당 쓰레드는 잠시 일시 정지 상태가 돼 Waiting Pool로 이동한다
		 *   
		 * - sleep() 메서드 파라미터로 밀리초 단위 또는 난초ㅗ 단위의
		 *   시간을 설정하면, 해당 시간이 만료된 후 다시 실행대기 상태로 변경된다
		 *   ! 타이머 동작 중 interrupt() 메서드가 호출되면
		 *     타이머가 완료되지 않아도 강제로 쓰레드를 깨운다
		 *     
		 * - sleep() 메서드 호출 시 반드시 try-catch 블록 처리가 필수
		 * 
		 * - 특정 쓰레드의 실행 시간에 대한 간격을 설정하거나 ,
		 *   우선순위에 따라 실행되지 못하는 쓰레드에 실행 권한을 부여하기 위해
		 *   특정 쓰레드들을 잠시 정지시킬 목적으로 사용한다
		 *   
		 * - 지정된 시간만큼 정확히 sleep() 후에 복귀하는 것이 아니라 
		 *   쓰레드 상태 저장 및 자원 교환에 필요한 시간이 추가됨
		 *   지정된 시간보다 약간의 딜레이가 포함될 수 있다
		 *   
		 *   <기본 문법>
		 *   try {
		 *   	Thread.sleep(밀리초);
		 *   } catch(InterruptedException e) {
		 *   	// interrupt() 메서드가 호출될 때 (쓰레드가 깨어날 때 )
		 *    	// 실행할 코드 기술
		 *   } 
		 *   
		 */
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {

				for(int i =1 ; i < 123 ; i++ ) {
					
					System.out.println("☆★");
					// 출력문 실행 후 쓰레드를 0.1초 동안 sleep()
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {

				for(int i =1 ; i < 123 ; i++ ) {
					
					System.out.println("○●");
					// 출력문 실행 후 쓰레드를 0.1초 동안 sleep()
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				
			}
		});
		
//		t1.start();
//		t2.start();
		
		System.out.println("t1 쓰레드의 우선순위 : " + t1.getPriority());
		System.out.println("t2 쓰레드의 우선순위 : " + t2.getPriority());
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		System.out.println("t1 쓰레드의 우선순위 : " + t1.getPriority());
		System.out.println("t2 쓰레드의 우선순위 : " + t2.getPriority());
		
		
		for(int i = 1 ; i <= 10; i ++) {
			// 현재 시각 정보 가져오기
			LocalTime now = LocalTime.now();
			System.out.println(now);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
	}

}
