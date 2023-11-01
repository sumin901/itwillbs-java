package while_;

public class test {

	public static void main(String[] args) {
		// while문으로 구구단 2단 출력
		int i = 1;
		while (i <= 9) {
			System.out.println("2" + " * " + i + " = " + (2*i) );
			i++;
			
		}

		
		// 1 ~ 10 의 합 구하기 while문 사용
		int total = 0;
		i = 1;
		
		while (i < 11) {
			total += i;
			System.out.println("1부터 " + i + "까지의 total의 값 : " + total);
			i++;
					
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
