package thread;

public class test2 {

	public static void main(String[] args) {
		
		SendMessage sm = new SendMessage("싱글쓰레드", 16);
		Thread t1 = new SendMessageMultiThread("멀티쓰레드", 19);
		
		FileTransfer ft = new FileTransfer("싱글쓰레드파일", 12);
		Thread t2 = new FileTransferMultiThread("멀티쓰레드파일", 15);
		
		// 1. 싱글 쓰레드
		// 파일 전송을 먼저 시작한 후 메시지를 전송
		ft.run();
		sm.run(); // 파일 전송이 끝난 후 메시지 전송
		
		System.out.println("==========================================");
		// 2. 멀티 쓰레드 
		t1.start();
		t2.start();
		
		ReceiveMessageMultiThread rmmt = new ReceiveMessageMultiThread("방가", 16);
//		rmmt.start(); >> Runnable 구현체는 start() 메서드를 직접 호출 할 수 없다!
//					>> Thread 인스턴스에 Runnable 구현체를 파라미터값으로 전달해서 start()호출
		
		Thread rt1 = new Thread(rmmt);
		rt1.start();
		
	}

}


/*
*	메시지 전송 클래스
*	
*	1. 싱글 쓰레드 구현
*
* 	- class명 : SendMessage
* 	- 멤버변수 : 메시지(msg, String), 카운트(count, int)
* 	- 파라미터 생성자 (String, int)
* 	- run() 메서드 : 리턴 X, 파라미터 X, count 만큼 msg 출력
*
*
*/
class SendMessage {
	String msg;
	int count;
	public SendMessage(String msg, int count) {
		this.msg = msg;
		this.count = count;
	}
	public void run() {
		for(int i = 1 ; i <= count ; i++) {
			System.out.println(i + " : " + msg);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}


/*
 * 멀티쓰레드 구현
 * 	- class명 : SendMessageMultiThread, Thread 클래스 상속
 * 	- 멤버변수 : 메시지(msg, String), 카운트(count, int)
 * 	- 파라미터 생성자 (String, int)
 * 	- run() 메서드 : 리턴 X, 파라미터 X, count 만큼 msg 출력, 딜레이 시간 0.5초
 */
class SendMessageMultiThread extends Thread {
	String msg;
	int count;
	public SendMessageMultiThread(String msg, int count) {
		this.msg = msg;
		this.count = count;
	}
	@Override
	public void run() {
		for(int i = 1 ; i <= count ; i++) {
			System.out.println(i + " : " + msg);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}

/*
*	파일 전송 클래스
*	
*	1. 싱글 쓰레드 구현
*
* 	- class명 : FileTransfer
* 	- 멤버변수 : 파일명(fileName, String), 카운트(count, int)
* 	- 파라미터 생성자 (String, int)
* 	- run() 메서드 : 리턴 X, 파라미터 X, count 만큼 fileName 출력
*
*
*/

class FileTransfer {
	String fileName;
	int count;
	
	public FileTransfer(String fileName, int count) {
		this.fileName = fileName;
		this.count = count;
	}
	
	public void run() {
		
		for(int i = 1 ; i <= count ; i++) {
			System.out.println(i + " : " + fileName);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

/*
 * 멀티쓰레드 구현
 * 	- class명 : FileTransferMultiThread, Thread 클래스 상속
 * 	- 멤버변수 : 파일명(fileName, String), 카운트(count, int)
 * 	- 파라미터 생성자 (String, int)
 * 	- run() 메서드 : 리턴 X, 파라미터 X, count 만큼 fileName 출력, 딜레이 시간 0.5초
 * 
 */

class FileTransferMultiThread extends Thread {
	
	String fileName;
	int count;
	public FileTransferMultiThread(String fileName, int count) {
		this.fileName = fileName;
		this.count = count;
	}
	@Override
	public void run() {
		
		for(int i = 1 ; i <= count ; i++) {
			System.out.println(i + " : " + fileName);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}

/*
 * 메시지 수신 클래스 - 멀티쓰레드 구현
 * 
 * 	- class명 : ReceiveMessageMultiThread, Runnable 인터페이스로 구현
 * 				=> Object 클래스 상속
 * 	- 멤버변수 : 파일명(fileName, String), 카운트(count, int)
 * 	- 파라미터 생성자 (String, int)
 * 	- run() 메서드 : 리턴 X, 파라미터 X, count 만큼 fileName 출력, 딜레이 시간 0.5초
 * 
 */

class ReceiveMessageMultiThread extends Object implements Runnable {
	String msg;
	int count;
	public ReceiveMessageMultiThread(String msg, int count) {
		this.msg = msg;
		this.count = count;
	}
	@Override
	public void run() {
		for(int i = 1 ; i <= count ; i++) {
			System.out.println(i + ", 수신 메시지 : " + msg);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}




