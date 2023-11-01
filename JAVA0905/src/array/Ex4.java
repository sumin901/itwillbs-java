package array;

public class Ex4 {

	public static void main(String[] args) {
		/*
		 *     2차원 배열
		 * 
		 * - 1차원 배열 여러개의 묶음을 관리하는 배열
		 * - 행과 열로 이뤄진 테이블(표) 구조와 유사한 구조의 배열
		 *   => 행과 열의 인덱스는 1차원 배열과 동일(0부터 시작)
		 *   
		 *   
		 *    <2차원 배열 선언 및 생성 기본 문법>
		 * 
		 * 데이터타입[][] 변수명 = new 데이터타입[행크기][열크기]
		 * 
		 * 
		 * 	  <2차원 배열 접근 기본 문법>
		 * 
		 * 변수명[행인덱스][열인덱스];
		 * 
		 * 
		 *    <2차원 배열 선언, 생성, 초기화 문법>
		 *    
		 *  데이터타입[][] 변수명 = {
		 *  	{값1, 값2, 값3, .. } // 0행 : 0열 1열 2열 3열 ... n
		 *      {값1, 값2, 값3, .. } // 1행 : 0열 1열 2열 3열 ... n
		 *      ...
		 *      {값1, 값2, 값3, .. } // m행 : 0열 1열 2열 3열 ... n
		 *  };
		 *  
		 *    <2차원 배열 크기>
		 *  1. 행의 크기 : 변수명.length
		 *  2. 열의 크기 : 변수명[행번호].length
		 *  
		 *  
		 *    <2차원 배열 접근 기본 문법>
		 *    
		 *    for (int i = 0 ; i < 변수명.length ; i++) {
		 *    	행 반복
		 *    		for (int j = 0 ; j < 변수명[행번호].length ; j++) {
		 *    			열 반복
		 *    			}
		 *    }
		 *  
		 *  
		 *  
		 */

		// int형 2차원 배열 (3행 2열 크기)
		
		int[][] arr; 
		arr = new int[3][2];
		
		arr[0][0] = 1; arr[0][1] = 2;
		arr[1][0] = 3; arr[1][1] = 4;
		arr[2][0] = 5; arr[2][1] = 6;
		
		// 배열 크기 알아내기
		// 1. 배열의 행 크기
		System.out.println("배열의 행 크기 : " + arr.length);
		
		// 2. 배열의 각 행에 대한 열 크기 
		System.out.println("배열 arr의 0번 행의 열 크기 : " + arr[0].length);
		System.out.println("배열 arr의 1번 행의 열 크기 : " + arr[1].length);
		System.out.println("배열 arr의 2번 행의 열 크기 : " + arr[2].length);
				
		// 2차원 배열 모든 요소
		for(int i = 0 ; i < arr.length ; i++) {
			
			for (int j = 0 ; j < arr[j].length ; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		int[][] arr2 = {
				// 전체 블록 내 중괄호(블록) 갯수 = 행 갯수
				// 내부 중괄호(블록) 내의 데이터 갯수 = 열의 갯수
				{1, 2},
				{3, 4},
				{5, 6}
		};
	
		/*
		 * 이름 저장 배열 names
		 * 
		 * 0행 : 윤종현 권영찬 변치욱
		 * 1행 : 손보성 정수아 서현정
		 * 2행 : 박가경 신승민 김효린 
		 * 
		 * 
		 */
		
		String[][] arr3 = {
				{"윤종현", "권영찬", "변치욱"},
				{"손보성", "정수아", "서현정"},
				{"박가경", "신승민", "김효린"}
		};
		
		for(int i = 0 ; i < arr3.length ; i++) {
			
			for(int j = 0 ; j < arr3[i].length ; j++) {
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}
		
		// 2차원 배열은 행 먼저 생성 후 별도로 열을 각각 생성 가능하다
		// 데이터타입[][] 배열명 = new 데이터타입[행크기][];
		int[][] arr4 = new int[3][]; // 행만 먼저 생성
		
		// 각 행에 접근해 열을 생성하는 코드 작성
		arr4[0] = new int[3]; // 0번 행에 정수형 배열 3개를 저장하는 공간을 생성
		arr4[1] = new int[2]; // 1번 행에 정수형 배열 2개를 저장하는 공간을 생성
		arr4[2] = new int[4]; // 2번 행에 정수형 배열 4개를 저장하는 공간을 생성
		
		arr4[0][0] = 1; arr4[0][1] = 2; arr4[0][2] = 3;
		arr4[1][0] = 1; arr4[1][1] = 2; 
		arr4[2][0] = 1; arr4[2][1] = 2; arr4[2][2] = 3; arr4[2][3] = 4;
		
		// 각 행의 공간에 열 공간을 생성하며 데이터 초기화까지 수행
		arr4[0] = new int[] {1,2,3};
		arr4[1] = new int[] {1,2};
		arr4[2] = new int[] {1,2,3,4};
		
		// 배열 출력
		for(int i = 0 ; i < arr4.length ; i++) {
			
			for(int j = 0 ; j < arr4[i].length ; j++) {
				System.out.print(arr4[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
	}

}
