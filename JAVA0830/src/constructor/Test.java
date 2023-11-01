package constructor;

public class Test {
	
	public static void main(String[] args) {
		Account acc = new Account("111-1111-111", "홍길동", 10000);
		acc.showInfo();
	}
}

// Account 클래스

// - accountNo, ownerName, balance
// - 인스턴스 생성 시 
//   "Account() 생성자 호출" 출력
//   accountNO에 "111-1111-111", onwerName에 "홍길동", balance에 10000 초기값 설정

class Account {
	
	String accountNo;
	String ownerName;
	int balance;
	
	public Account(String accountNo, String ownerName, int balance) {
		System.out.println("Account() 생성자 호출");
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	public void showInfo() {
		System.out.println("계좌 정보 : " + accountNo + ", " + ownerName + ", " + balance);
	}
	
	
}



