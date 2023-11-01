
public class Num1 {

	public static void main(String[] args) {
		int fee = 50000;
		int age = 22;
		
		if( age < 5 || age >= 65 ) {
			fee *= 0.5;
			System.out.println("나이가 " + age + "세이므로 입장료는 " + fee + "원입니다.");
			
		} else if ( age >= 5 && age <= 19 ) {
			fee *= 0.7;
			System.out.println("나이가 " + age + "세이므로 입장료는 " + fee + "원입니다.");
		} else {
			System.out.println("나이가 " + age + "세이므로 입장료는 " + fee + "원입니다.");
		}
		
		
	}

}
