package wrapper_class;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 				Wrapper 클래스
		 * 	- 기본 데이터 타입을 객체 형태로 관리해주는 클래스의 모음
		 * 		=> java.lang에 위치한다
		 * 
		 *	- 기본 데이터 타입과 1:1로 대응하는 8개의 클래스 제공한다
		 *	  (Byte, Short, Integer, Long, Float, Double, Boolean, Character)
		 *
		 * 	- Wrapper 클래스에서 제공하는 상수와 메서드 등을 화룡ㅇ해
		 * 	  기본 데이터 타입 데이터를 다양하게 처리 가능
		 * 
		 * 
		 */

		System.out.println("byte타입 메모리 크기(bit) : " + Byte.SIZE);
		System.out.println("byte타입 메모리 크기(Byte) : " + Byte.BYTES);
		System.out.println("byte타입 최소값 : " + Byte.MIN_VALUE);
		System.out.println("byte타입 최대값 : " + Byte.MAX_VALUE);
		
		System.out.println("--------------------------");
		
		
		
		System.out.println("Character타입 메모리 크기(bit) : " + Character.SIZE);
		System.out.println("Character타입 메모리 크기(Byte) : " + Character.BYTES);
		System.out.println("Character타입 최소값 : " + (int)Character.MIN_VALUE);
		System.out.println("Character타입 최대값 : " + (int)Character.MAX_VALUE);
		
		System.out.println("--------------------------");
		
		System.out.println("int타입 메모리 크기(bit) : " + Integer.SIZE);
		System.out.println("int타입 메모리 크기(Byte) : " + Integer.BYTES);
		System.out.println("int타입 최소값 : " + Integer.MIN_VALUE);
		System.out.println("int타입 최대값 : " + Integer.MAX_VALUE);
		
		System.out.println("--------------------------");
		
		System.out.println("long타입 메모리 크기(bit) : " + Long.SIZE);
		System.out.println("long타입 메모리 크기(Byte) : " + Long.BYTES);
		System.out.println("long타입 최소값 : " + Long.MIN_VALUE);
		System.out.println("long타입 최대값 : " + Long.MAX_VALUE);
		
		System.out.println("--------------------------");
		
		System.out.println("Float타입 메모리 크기(bit) : " + Float.SIZE);
		System.out.println("Float타입 메모리 크기(Byte) : " + Float.BYTES);
		System.out.println("Float타입 최소값 : " + Float.MIN_VALUE);
		System.out.println("Float타입 최대값 : " + Float.MAX_VALUE);
		
		System.out.println("--------------------------");
		
		System.out.println("Double타입 메모리 크기(bit) : " + Double.SIZE);
		System.out.println("Double타입 메모리 크기(Byte) : " + Double.BYTES);
		System.out.println("Double타입 최소값 : " + Double.MIN_VALUE);
		System.out.println("Double타입 최대값 : " + Double.MAX_VALUE);
		
		
		
		
	}

}
