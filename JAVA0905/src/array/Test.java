package array;

public class Test {
	
	public static void main(String[] args) {
		// int형 배열 공간 5개 생성, 정수 5개 초기화 후 출력
		int[] arr = new int[5];
		
		arr[0] = 1; arr[1] = 2; arr[2] = 3; arr[3] = 4; arr[4] = 5;
				
		for(int i = 0 ; i < arr.length ; i++) {
			
			System.out.println(arr[i]);
			
		}
		System.out.println("------------------------------------");
		
		// boolean 타입 배열 크기 3인 배열 초기화 후 출력 2번 인덱스는 true값 초기화
		
		boolean[] arr2 = new boolean[3];
		
		arr2[1] = true;
		
		for ( int i = 0; i < arr2.length ; i++ ) {
			System.out.println(i + "번 인덱스 데이터 : " + arr2[i]);
		}
		
		// String 타입 배열 크기 3인 배열 생성
		// 0번 홍길동 1번 이순신 초기화 후 모두 출력
		
		String[] arr3 = new String[3];
		arr3[0] = "홍길동";
		arr3[1] = "이순신";
		
		for (int i = 0; i < arr3.length ; i++) {
			System.out.println(i + "번 인덱스 데이터 : " + arr3[i]);
		}
		
		// Double 타입 배열 크기 5개, 4개 초기화 후 모두 출력
		
		double[] arr4 = new double[5];
		
		arr4[0] = 1.1;
		arr4[1] = 3.1;
		arr4[2] = 4.1;
		arr4[3] = 5.1;
		
		for ( int i = 0; i < arr4.length ; i++ ) {
			System.out.println(i + "번 인덱스 데이터 : " + arr4[i]);
		}
		
	}
		
}
