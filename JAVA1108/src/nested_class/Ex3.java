package nested_class;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * 중첩 인터페이스
		 * 
		 * : 클래스의 멤버로 선언된 인터페이스
		 * 
		 * : 클래스 내부에 인터페이스를 선언하는 이유는
		 *   해당 클래스와 긴밀한 관계를 맺는 구현 클래스를 만들기 위함이다
		 *   
		 * : 인스턴스 멤버 인터페이스와 static 멤버 인터페이스 모두 구현 가능
		 * 
		 * : 인스턴스 멤버 인터페이스는 바깥 클래스 객체가 있어야 사용 가능하며
		 *   satic 멤버 인터페이스는 바깥 클래스의 객체 없이 바깥 클래스명만으로도 접근 간으
		 *   
		 * : 주로 static 멤버 인터페이스를 사용하고, UI 프로그래밍에서 이벤트를 처리하는 목적으로 사용
		 * 
		 * 기본 문법 
		 * class 바깥클래스 {
		 * 		[static] interface
		 * 
		 * }
		 * 
		 */
		
		Button btn = new Button();
		btn.setOnClickListener(new CallListenter());
		btn.touch();
		btn.setOnClickListener(new MessageListenter());
		btn.touch();
	}

}

// 클릭 시 이벤트를 처리하는 클래스 Button 
class Button {
	static interface OnClickListener { // 중첩 인터페이스 정의
		void onClick(); // 추상 메서드

	}
	
	OnClickListener listener;
	
	public void setOnClickListener(OnClickListener listener) {
		// 다형성을 위한 매개변수 선언
		this.listener  = listener;
	}
	
	public void touch() {
		listener.onClick();
	}
}

// OnClickListener 인터페이스를 구현(implements)하는 구현 클래스
// : 전화 걸기 버튼 터치
class CallListenter implements Button.OnClickListener {

	@Override
	public void onClick() {
		System.out.println("전화를 건다");
		
	}
	
}
class MessageListenter implements Button.OnClickListener {
	
	@Override
	public void onClick() {
		System.out.println("문자를 보낸다");
		
	}
	
}

