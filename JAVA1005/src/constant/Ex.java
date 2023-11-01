package constant;

import java.util.Calendar;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 								상수 (constant)
		 *	변하지 않는 데이터 = 변하지 않는 데이터를 저장한 변하지 않는 변수
		 *	보통 클래스 내에서 상수 선언 시 public static final 형태로 선언
		 * 	1) public : 모두 접근 가능
		 * 	2) static : 클래스 로딩 시 함께 로딩, 인스턴스 생성과 무관하며 클래스 하나 당 생성되고 모든 인스턴스가 공유
		 * 	3) final : 데이터 변경 불가 => 상수 
		 * 
		 * 
		 */
		
		
		CarInfo ci = new CarInfo();
		
		// 객체에 차량 정보를 저장하는 경우
		// 값을 직접 입력할 때 문자열 등의 오타로 인해 오류 발생 가능성 있음
		ci.setCarModelName("SONATA");
		ci.setColor(0x000000);
		ci.setCompany("HYUNDAI");
		
		// 차령 정보를 비교해야 하는 경우
		// 문자열의 경우 대소문자 차이 등으로 잘못된 판별 가능
		if(ci.getCompany() == "hyundai") {
			System.out.println("현대 자동차입니다");
		} else {
			System.out.println("현대 자동차가 아닙니다");
			
		}
		if(ci.getCarModelName() == "SONATA") {
			System.out.println("소나타입니다");
		} else {
			System.out.println("소나타가 아닙니다");
			
		}
		
		CarInfoWithConstant cic = new CarInfoWithConstant();
		// Setter를 호출해 값을 저장할 때 직접 입력하지 않고
		// 클래스명.상수명을 통해 상수로 지정 가능하므로
		// 잘못된 데이터를 저장할 확률을 낮춘다
		cic.setCompany(cic.COMPANY_HYUNDAI);
		cic.setCarModelName(cic.CAR_MODEL_NAME_SONATA);
		cic.setColor(cic.COLOR_PERFECT_BLACK);
		
		// 값 비교시에도 상수로 비교하면 오류 발생 없다
		if(cic.getCompany() == cic.COMPANY_HYUNDAI) {
			System.out.println("현대자동차입니다");
		} else {
			System.out.println("현대자동차가 아닙니다");
			
		}
		if (cic.getCarModelName() == cic.CAR_MODEL_NAME_SONATA) {
			System.out.println("소나타입니다");
		} else {
			System.out.println("소나타가아닙니다");
		}
		
		// 			상수 활용의 예
		// Calendar 클래스를 사용해 날짜 정보 관리
		// Calendar 클래스의 get() 메서드를 통해
		// 년, 월, 일 등의 정보를 가져온다
		// 항목 지정 시 Calendar 클래스에서 제공하는 상수 사용
		Calendar calen = Calendar.getInstance();
		System.out.println("올해는 "+calen.get(calen.YEAR) + "년도입니다");
		
		
		
		
	}

}
// 상수를 활용한 클래스
class CarInfoWithConstant {
	private String company;
	private String carModelName;
	private int color;
	
	// 특정 클래스 내에서 사용되는 데이터를 상수로 제공하면
	// 문자열의 오타, 정수형 파라미터 사용 시 다양한 문제들을 해결할 수 있다
	// 주로 상수는 public static final << 키워드 사용
	// public에 의해 누구나 접근 가능
	// static에 의해 인스턴스 생성없이 접근(클래스명만으로) 가능
	// final에 의해 데이터가 변경되지 않는다
	// => 상수의 이름을 명확하게 지정함으로써 복잡한 데이터도 이름만으로 단순 사용 가능
	
	// 1. 제조사 정보를 문자열로 저장하는 상수 선언
	public static final String COMPANY_HYUNDAI = "HYUNDAI";
	public static final String COMPANY_KIA = "KIA";
	public static final String COMPANY_CHEVORLET = "CHEVORLET";
	
	// 2. 차량 모델 정보를 문자열로 저장하는 상수 선언
	public static final String CAR_MODEL_NAME_SONATA = "SONATA";
	public static final String CAR_MODEL_NAME_K5 = "K5";
	public static final String CAR_MODEL_NAME_SPARK = "SPARK";
	
	// 3. 차량 색상 정보를 정수로 저장한는 상수 선언
	public static final int COLOR_PERFECT_BLACK = 0X000001;
	public static final int COLOR_PERFECT_WHITE = 0XFFFFCC;
	public static final int COLOR_PERFECT_RED = 0XFF0000;
	public String getCompany() {
		return company;
	}
	public String getCarModelName() {
		return carModelName;
	}
	public int getColor() {
		return color;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public void setCarModelName(String carModelName) {
		this.carModelName = carModelName;
	}
	public void setColor(int color) {
		this.color = color;
	}
	
	
}

// 상수를 활용하지 않는 클래스
class CarInfo {
	private String company;
	private String carModelName;
	private int color;
	
	public String getCompany() {
		return company;
	}
	public String getCarModelName() {
		return carModelName;
	}
	public int getColor() {
		return color;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public void setCarModelName(String carModelName) {
		this.carModelName = carModelName;
	}
	public void setColor(int color) {
		this.color = color;
	}
}		