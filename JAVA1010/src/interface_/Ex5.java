package interface_;

public class Ex5 {

	public static void main(String[] args) {
		// 4. 모듈간 독립적 프로그래밍으로 개발 기간 단축
		DesignerClient designerClient = new DesignerClient();
		designerClient.login();
		
		DeveloperClient developerClient = new DeveloperClient();
		developerClient.login();
		
	}

}

// 개발자와 디자이너의 규칙을 인터페이스로 정의
interface LoginProcess {
	// 공통 기능으로 login()
	public abstract String Login(String id, String pass);
}

// 디자이너 경우
// => 로그인 처리 과정이 주 업무가 아님, 전달 데이터와 리턴 데이터가 중요함
// => LoginProcess 인터페이스를 구현하는 클래스를 정의해 login() 구현
class Designer implements LoginProcess {

	@Override
	public String Login(String id, String pass) {
		// 메서드에 전달되는 데이터가 정확한지만 확인하고
		// 리턴값이 외부로 잘 전달되는지만 확인
		System.out.println("디자이너, 전달받은 id = " + id);
		System.out.println("디자이너, 전달받은 pass = " + pass);
		
		return "성공";
	}
	
}
class DesignerClient {
	Designer designer = new Designer();
	public void login() {
		String id = "admin";
		String pass = "1234";
		
		// login() 호출 / id, pass 전달 후 로그인 결과 확인 작업 수행
		
		String result = designer.Login(id, pass);
		System.out.println("로그인 결과 : " + result);
		
		if(result.equals("성공")) {
			// 로그인 성공 페이지 이동 처리 
		} else {
			// 로그인 실패 페이지 이동 처리
		}
	}
}

// 개발자의 경우
// 전달받은 값은 중요하지 않고 전달받은 값을 사용해 로그인 처리 작업 수행
// 로그인 처리 후 리턴되는 값이 정상적으로 전달되는지 확인
// LoginProcess 인터페이스를 구현하는 Developer 클래스
class Developer implements LoginProcess {

	@Override
	public String Login(String id, String pass) {
		// 디자이너로부터 받은 id, pass를 사용
		// 로그인 작업 처리 후 "성공" 또는 "실패" 문자열 리턴
		System.out.println("개발자, 전달받은 id = " + id);
		System.out.println("개발자, 전달받은 pass = " + pass);
		
		System.out.println("id, pass로 로그인 작업 처리 완료");
		
		return "성공";
	}
	
}

class DeveloperClient {
	Developer developer = new Developer();
	
	public void login() {
		// 디자이너로부터 받을 id, pass를 임의로 설정 후 전달
		// 개발자 코드를 통해 로그인 작업 수행 후 
		// 리턴 값 확인
		String id = "admin";
		String pass = "1234";
		String result = developer.Login(id, pass);
		System.out.println("로그인 결과 : " + result);
	}
}