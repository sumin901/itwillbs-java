package static_member;

public class Test4 {

	public static void main(String[] args) {
		
	Account acc = Account.getInstance();
	acc.setAccountNo("111-1111-111");
	acc.setBalance(997300);
	acc.setOwnername("홍길동");
	acc.showAccountInfo();

	}

}

class Account {
	private static Account Instance = new Account();
	
	private Account () {}
	
	public static Account getInstance () {
		return Instance;
	}
	
	private String accountNo;
	private String ownerName;
	private int balance;

	public String getAccountNo() {
		return accountNo;
	}

	public String getOwnername() {
		return ownerName;
	}

	public int getBalance() {
		return balance;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public void setOwnername(String ownername) {
		this.ownerName = ownername;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void showAccountInfo() {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("잔액 : " + balance);
		
	}
	
	
	
	
}