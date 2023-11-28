package anonymous;

import anonymous.CheckBox.OnSelectListener;

public class Test3 {

	public static void main(String[] args) {
		/*
		 * CheckBox 클래스
		 * 
		 * - select() 메서드가 호출되면 "배경을 변경합니다" 출력
		 *
		 * CheckBox 객체 생성
		 * setOnSelectListener 호출, 이 때 매개변수로 익명 구현 객체 사용
		 * select() 메서드 호출 
		 * 
		 * 
		 */
		
		CheckBox cb = new CheckBox();
		cb.SetOnSelectListener(new CheckBox.OnSelectListener() {
			
			@Override
			public void onSelect() {
				
				System.out.println("배경을 변경합니다");
				
			}
		});
		
		cb.select();
	}

}
// CheckBox 클래스 
// - 정적 내부 인터페이스 OnSelectListener 정의
// -> onSelect() 추상 메서드 선언
// - OnSelectListener 타입의 인스턴스 변수 선언
// - SetOnSelectListener 메서드 정의, 이때 매개변수로 인터페이스 타입 지정
// - select() 메서드를 정의해 인스턴스 변수의 오버라이딩 된 onselect() 메서드가 호출되도록 한다

class CheckBox {
	static interface OnSelectListener {
		void onSelect();
	}
	OnSelectListener osl ;
	
	public void SetOnSelectListener(OnSelectListener osl) {
		this.osl = osl;
	}
	
	public void select() {
		osl.onSelect();
	}
	
}