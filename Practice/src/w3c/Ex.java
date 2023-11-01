package w3c;

public class Ex {
	public static void main(String[] args) {
		
		Method m = new Method(1,2);
		System.out.println(m.n1 + "" + m.n2 + "" + m.n3 + "" + m.n4);
		
	}
}

class Method {
	int n1;
	int n2;
	int n3;
	int n4;
	
	public Method (int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	} 
}
