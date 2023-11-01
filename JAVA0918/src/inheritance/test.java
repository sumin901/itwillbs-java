package inheritance;

public class test {

	public static void main(String[] args) {
		
		ItwillBank itb = new ItwillBank();
		// 상속받은 멤버변수에 접근
		itb.accountNo = "222-2222-222";
		itb.ownerName = "ㅅㅁ";
		itb.balance = 590000;
		itb.showAccountInfo();
		itb.deposit(30000);
		itb.withdraw(50000);
		
		
		System.out.println("---------------------------------------");
		// ItwillBank 고유 기능
		itb.contract("운전자");
		
	}

}
/*
 * Account class를 상속받는 ItwillBank 클래스
 * 
 * - Account의 기본기능 (계좌 기본 기능)은 그대로 유지
 *   => accountNo, ownerName, balance 멤버변수
 *   => deposit, withdraw, showAccountInfo 메서드
 * 
 * - 멤버변수 추가 : insuranceName - String
 * - 메서드 추가 : contract()
 *   => 파라미터 : 보험명
 *   => 리턴 : X
 *   => 전달받은 보험명을 멤버변수에 저장 후 "xxx 보험 계약 완료 출력"
 * 
 */

class Account {
	String accountNo = "111-1111-111";
	String ownerName = "ㅇㅅㅁ";
	int balance = 14990;;
	public void deposit(int num) {
		balance += num;
		System.out.println(num + "원 입금 완료, 잔액 : " + balance);
		
	}
	public void withdraw(int num) {
	if ( balance < num ) {
		System.out.println("잔고가 부족해 출금이 불가능합니다");
		System.out.println("출금 요청 금액 : " + num + " / 현재 잔고 : " + balance);
	} else {
		balance -= num;
		System.out.println(num + "원 출금 완료, 잔액 : " + balance);
	}
	}
	public void showAccountInfo () {
		System.out.println("계좌번호 : " + accountNo + " 예금주 : " + ownerName + " 잔액 : " + balance);
		
	}
	
}
class ItwillBank extends Account {
	String insureName = null;
	public void contract(String insureName) {
		this.insureName = insureName;
		System.out.println(insureName + " 보험 계약 완료");
	}
}