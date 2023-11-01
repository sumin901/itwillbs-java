package object;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account acc = new Account("123-12", "ㅁㅁ", 15000);
		Account acc2 = new Account("123-12", "ㅁㅁ", 15000);
		System.out.println(acc.toString());
		System.out.println(acc.equals(acc2));
		
	}

}

/*
 * Account
 * 
 * 멤버변수
 * - 계좌번호 (accountNo, 문자열), 예금주명(ownerName, 문자열)
 * - 현재잔고 (balance, 정수형)
 * - 생성자 : 계좌번호, 예금주명, 현재잔고를 파라미터로 한다
 * - equals() 메서드 오버라이딩 계좌정보 비교
 * - toString() 메서드 오버라이딩 계좌정보를 문자열로 리턴 
 */

class Account {
	String accountNo;
	String ownerName;
	int balance;
	public Account(String accountNo, String ownerName, int balance) {
		super();
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Account) {
			Account acc = (Account)obj;
			if(accountNo.equals(acc.accountNo) && ownerName.equals(acc.ownerName) && balance == acc.balance) {
				return true;
			}
		}
		return false;
	}
	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", ownerName=" + ownerName + ", balance=" + balance + "]";
	}
	
	
	
}
