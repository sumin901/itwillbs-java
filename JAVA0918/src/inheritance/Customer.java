package inheritance;

public class Customer {
	
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		System.out.println("Customer() 생성자 호출");
	}
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade ="SILVER";
		bonusRatio = 0.01;
		System.out.println("Customer(int, String) 생성자 호출");
	}
	
	public int getCustomerID() {
		return customerID;
	}

	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		
		return price;
	}
	

	public String showCustomerInfo() {
		return "Customer [customerName=" + customerName + ", customerGrade=" + customerGrade + ", bonusPoint="
				+ bonusPoint + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

