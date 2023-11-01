package operator;

public class test01 {

	public static void main(String[] args) {
		int a = 10;
		int b = ++a + a + ++a + a++;
		System.out.printf("a의 값 = %d, b의 값 = %d\n", a, b);
		// 내 예상 : a = 13, b = 11 + 11 + 12 + 12 = 46
		
		int n1 = 10;
		System.out.println(n1 - 10 != 0);
	}

}
