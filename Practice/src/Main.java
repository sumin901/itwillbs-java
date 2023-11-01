
public class Main {

	public static void main(String[] args) {
		int yrs = 5;
		
		if (1 <= yrs && yrs <= 4000) {
			if (yrs % 4 == 0 && (yrs % 100 != 0 || yrs % 400 == 0) ) {
				System.out.println("1");
			} else {
				System.out.println("0");
			};

	}

	}
}
