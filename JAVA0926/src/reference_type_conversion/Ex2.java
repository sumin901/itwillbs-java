package reference_type_conversion;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * instanceof 연산자
		 * 
		 * 좌변의 객체(참조변수)가 우변 클래스의 타입인지 판별하는 연산자
		 * 
		 * 참조 변수가 부모 객체를 참조하는지 자식 객체를 참조하는지 판별할 수 있다
		 * 
		 * 판별 결과 : true, 형변환 가능(up or downcasting 가능)
		 * 판별 결과 : false, 형변환 불가능
		 * 
		 * 우변 클래스 타입과 같거나 우변 클래스 타입의 자식 타입 모두 가능
		 * A equals B ? => A instanceof B
		 * 판별 결과를 boolean타입에 저장하거나 
		 * if문에 판별하는 문장으로 직접 사용
		 * 
		 * 						< 문법 >
		 * if( A instanceof B ) { A : 참조변수(객체), B : 클래스명(타입)
		 * 		형변환이 가능한 관계므로 변환을 수행
		 * } else {
		 * 		형변환이 불가능한 관계, 변환 X
		 * }
		 * 
		 * 
		 */
		
		
		SmartPhone 내폰 = new SmartPhone("iPhone14Pro", "55968587", "iOS");
		내폰.call();
		내폰.sms();
		내폰.kakaoTalk();

		if(내폰 instanceof SmartPhone) {
			System.out.println("내폰은 SmartPhone");
			SmartPhone phone = 내폰;
		} else {
			System.out.println("내폰은 SmartPhone이 아니다");
			
		}

		System.out.println("=============================");
		// 업캐스팅 가능 대상 확인
		// 내폰은 HandPhone인가? YES
		// SmartPhone(ps) is a HandPhone?
		if( 내폰 instanceof CellPhone) {
			System.out.println("내폰은 CellPhone이다");
			System.out.println("고로 내폰을 CellPhone으로 형변환 가능하다");
			CellPhone cp = 내폰; // 묵시적 형변환, 업캐스팅
			System.out.println(" 내폰은 cp이 가진 모든 기능을 포함한다");
			System.out.println(" 따라서 업캐스팅 이후에도 cp의 기능 사용 가능");
			
			cp.call();
			cp.sms();
//			cp.kakaoTalk(); // SmartPhone의 기능은 포기해야함
			
			
		} else {
			System.out.println("내폰은 CellPhone이 아니다");
			
		}
		
		CellPhone cp2 = new CellPhone("애니콜", "123123");
		// cp2는 스마트폰? NO
		if (cp2 instanceof SmartPhone) {
			System.out.println("cp2는 스마트폰이다");
		} else {
			System.out.println("cp2는 스마트폰이 아니다");
			System.out.println("그러므로 스마트폰으로 변환이 불가능");
			System.out.println("cp2는 스마트폰이 가진 기능을 모두 포함하지 못한다");
		}
		
		System.out.println("------------------------------------------------");
		
		// 				다운캐스팅 가능 대상 확인
		// SmartPhone -> CellPhone 타입(cp3)으로 업캐스팅
		CellPhone cp3 = new SmartPhone("갤럭시", "1231", "안드로이드");
		// 업캐스팅 후에 참조 영역 축소로 접근 범위가 줄어듦
		cp3.call();
		cp3.sms();
//		cp3.kakaoTalk(); -> 접근불가
		//cp3은 스마트폰? 
		if(cp3 instanceof SmartPhone) {
			System.out.println("cp3는 스마트폰이다");
			System.out.println("따라서 cp3는 스마트폰으로 형변환 가능");
			SmartPhone sp3 = (SmartPhone)cp3;
			System.out.println("sp3는 스마트폰이 가진 모든 기능을 포함한다");
			sp3.call();
			sp3.kakaoTalk(); // 기능 회복
			sp3.sms(); 
		} else {
			System.out.println("cp3는 스마트폰 X");
		}
		
		
		Child c = new Child();
//		Parent p = c;
//		p.parentPrn();
//		p.childPrn(); 불가능
		
		// Child -> Parent 자동 형변환이 가능하지만
		// 형변환을 바로 수행하지 않고 instanceof 연산자를 통해 검사 후 수행
		if (c instanceof Parent) {
			System.out.println("c는 Parent다");
			// 형변환 수행
			Parent p = c;
			p.parentPrn();
			
		} else {
			System.out.println("c는 Parent가 아니다");
		}
		
		Parent p2 = new Parent();
		// Parent -> Child 변환 가능 여부 판별 후 변환
		if( p2 instanceof Child) {
			System.out.println("p2는 Child다");
			// 형변환 수행
			Child c2 = (Child)p2;
			c2.childPrn();
			c2.parentPrn();
			
		} else {
			System.out.println("p2는 Child가 아니다");
		}
		
		
	} // main

}

class CellPhone {
	String modelName;
	String phoneNum;
	//파라미터 생성자
	public CellPhone(String modelName, String phoneNum) {
		super();
		this.modelName = modelName;
		this.phoneNum = phoneNum;
	}
	public void call () {
		System.out.println("전화 걸기");
	}
	public void sms () {
		System.out.println("문자 전송");
	}
}

class SmartPhone extends CellPhone {
	String osName;
	
	// 슈퍼클래스의 생성자를 통해 대신 초기화 수행
	public SmartPhone(String modelName, String phoneNum, String osName) {
		super(modelName, phoneNum);
		this.osName = osName;
	}
	public void kakaoTalk () {
		System.out.println("카톡!");
	}
}