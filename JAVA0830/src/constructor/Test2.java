package constructor;

public class Test2 {
	
	public static void main(String[] args) {
		
		Account2 acc = new Account2("111-1111-111", "홍길동", 100000);
		
		acc.showAccountInfo();
		
		Account2 acc2 = new Account2 ("222-2222-2222");
		
		acc2.showAccountInfo();
		
		Account2 acc3 = new Account2 ("333-3333-333", "이순신");
		
		acc3.showAccountInfo();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}


/*
 * Account 클래스
 * 
 * accountNO, ownerName, balance
 * 파라미터 생성자 (accountNo, ownerName, balance)
 * showAccountInfo () 메서드 생성
 * 
 */


class Account2 {
	
	String accountNo;
	String ownerName;
	int balance;
	
	public Account2(String accountNo, String ownerName) {
		
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		balance = 0;
	}
	
	public Account2(String accountNo) {
		this.accountNo = accountNo;
		ownerName = "홍길동";
		balance = 0;
	}

	public Account2(String accountNo, String ownerName, int balance) {
		
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	public void showAccountInfo () {
		System.out.println("계좌정보 : " + accountNo + ", " + ownerName + ", " + balance);
	}
	
	
	
}