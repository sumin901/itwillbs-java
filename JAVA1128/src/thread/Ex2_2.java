package thread;

import javax.swing.JOptionPane;

public class Ex2_2 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		/*
		 * 싱글 쓰레드로 동작하는 프로그램의 경우 하나의 실행이 완료되야
		 * 다음 동작을 수행한다
		 * 
		 * 아래는 입력창에 값을 넣어야만 출력문과 for문이 실행
		 * 
		 */
		
		Thread t1 = new MultiThread();
		t1.start();
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요");
		if(!t1.isAlive()) {
			
			JOptionPane.showMessageDialog(null, "제한시간 종료");
			System.out.println("제한시간 종료!");
		} else {
			System.out.println("입력 값 : " + input);
			t1.stop();
		}
	}

}


class MultiThread extends Thread {

	@Override
	public void run() {
		
		for(int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		JOptionPane.getRootFrame().dispose();
		
	}
	
	
	
}
