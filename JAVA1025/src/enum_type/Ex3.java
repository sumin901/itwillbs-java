package enum_type;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * 
		 */
		Month now = Month.FEBRUARY;
		System.out.println(now + ", " + now.getMonthKorea());
	}

}

enum Month {
	// 생성자를 사용해 상수에 다른 값을 결합한다
	JANUARY("1월"), FEBRUARY("2월"), MARCH("3월");
	
	private String monthKorea;
	
	private Month(String monthKorea) {
		this.monthKorea = monthKorea;
	}
	
	public String getMonthKorea() {
		return monthKorea;
	}

	public void setMonthKorea(String monthKorea) {
		this.monthKorea = monthKorea;
	}
	
}