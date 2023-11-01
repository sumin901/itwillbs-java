package for_;

public class Test {

	public static void main(String[] args) {
		// 1 ~ 9Rkwl 1씩 증가하면서 출력
		// for 문 사용
		
		for(int i =1;i<10;i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		// for문 사용 특정 단에 해당하는 구구단 출력

		
		for(int dan = 2; dan<10; dan++) {
			System.out.println("<" + dan + "단>");
			for(int i = 1; i<10; i++) {
				System.out.println(dan + " * " + i + " = " + (dan*i));
				
			}
		}
		
		System.out.println("--------------------------------");
		
		int dan = 4;
		int i = 1;
		
		System.out.println("< " + dan + "단 >"); // System.out.printf("< %d 단 >", dan); 
		for(i = 1; i<10; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
			// System.out.println("%d * %d = %d/n", dan, i, (dan*i));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
