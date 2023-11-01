package cooperation;

public class Taxi {
	int money;
	int passengerCount;
	String taxiNumber;
	
	public Taxi (String taxiNumber) {
		this.taxiNumber = taxiNumber;
	}
	
	public void take(int money) {
		this.money += money;
		this.passengerCount ++;
		
	}
	
	public void showInfo() {
		System.out.println(taxiNumber + " 택시의 " + "승객은 " + passengerCount + "이고, 수입은 " + money + "원 입니다." );
	}
	
}
