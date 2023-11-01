package array;

public class Ex2 {

	public static void main(String[] args) {
		
		/*
		 * <배열 선언, 생성 초기화를 한번에 수행하는 문법>
		 * 
		 * 데이터타입[] 변수명 = {데이터1, 데이터2, ...};
		 * => 배열 생성 문법을 별도로 명시하지 않는다
		 * 	  중괄호를 사용해 초기화할 데이터를 리터럴 형태로 전달하면
		 *    해당 데이터 개수만큼 배열 공간이 자동 생성됨
		 * => n개 만큼의 공간을 생성하며 인덱스 번호가 0 ~ n-1까지 부여되고 자동 초기화 됨
		 *  
		 * 
		 */
		
		int[] arr = {1,2,3,4,5};
		// => 데이터 공간 5개 생성
		
		arr[4] = 7;
		
		for (int i = 0 ; i < arr.length ; i++ ) {
			System.out.println(i + "번 인덱스 : " + arr[i]);
		}
		
		// int형 배열 arr2를 먼저 선언 후 
		// 1,2,3,4,5로 한꺼번에 초기화하는 경우
		
		int[] arr2 = new int[5];
//		arr2 = {1,2,3,4,5}; => 오류, 별도로 초기화 시 사용 불가능!
//		new 키워드를 사용하는 방법과 결합해 문법을 지정해야한다
		arr2 = new int[] {1,2,3,4,5};
		arr2 = new int[] {2,3,4,5,6,7};
		
		for (int i = 0 ; i < arr2.length ; i++ ) {
			System.out.println(i + "번 인덱스 : " + arr2[i]);
		}
		
//		arr3 = new int[] {1,2}; 불가능 선언이 선행되지않았음
		
		// String 타입 문자열 데이터 3개 ('java', 'jsp', 'cloud') strArr 배열 생성 후 초기화 및 출력
		
		String[] strArr = {"java", "jsp", "cloud"};
		String[] strArr2 = new String[3];
		strArr2 = new String[] {"soccer", "baseball", "swimming"};
		
		int[] a = {1,2,3};
		int[] b = {4,5,6};
		int[] c = {7,8,9};
		a = b; // b의 주소값을 a에 저장한다
		// 기존의 저장 공간(데이터)을 버리고 b의 저장 공간의 주소값을 전달받아 참조함
		// 기존의 a는 불필요한 메모리 공간이 되어 Garbage Collector에 의해 정리 되상이 됨
		// => 즉 더 이상 필요없는 메모리 공간은 자동으로 정리한다
		
		
		for (int i = 0 ; i < a.length ; i++ ) {
			System.out.println(i + "번 인덱스 : " + a[i]);
		}
		
		b = c ;
		
		for (int i = 0 ; i < a.length ; i++ ) {
			System.out.println(i + "번 인덱스 : " + a[i]);
		}	
		
		
	}
}
