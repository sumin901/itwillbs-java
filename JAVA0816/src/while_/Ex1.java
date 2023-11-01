package while_;

public class Ex1 {

	public static void main(String[] args) {
	/*
	 * while문
	 * 
	 * - for문과 동일하게 특정 조건식의 판별 결과가 true일 동안 반복
	 * 
	 * - for문과 달리 조건식 위치만 정해져 있고,
	 * 	 초기식과 증감식의 위치는 유동적으로 변한다(생략 가능, 개발자가 정한다)
	 * 
	 * - 주로 반복 횟수가 정해져 있지 않은 경우 사용
	 * 
	 * - for문 <-> while문 상호 변환 100% 가능하다
	 * 
	 *   <기본 문법>
	 *   [초기식;] << while문 보다 윗 줄에 위치해야한다. 생략 가능
	 *   
	 *   while(조건식) {
	 *   		[증감식;]
	 *   		조건식 결과 true일 때 반복 실행 코드
	 *   		[증감식;] >> 증감식 위치는 자유롭다
	 *   }
	 *   
	 */
		
	// 
		int i = 1;
		while( i <= 10 ) {
			System.out.println(i + " : Hello, World!");
			i++;
			
		}

		
		System.out.println("while문이 끝난 뒤 i의 값 = " + i);
		
		i = 1;
		while(i <= 10) {
			System.out.print(i + " ");
			i++;
		}
		
		System.out.println();
		
		i = 1;
		while(i <= 10) {
			System.out.print(i + " ");
			i += 2;
		}
		
		System.out.println();
		
		i = 1;
		while (i <= 10) {
			if(i % 2 == 1) {
				System.out.print(i + " ");
			}
			i += 2;
		}
		
		System.out.println();
		
		i = 2;
		while (i <= 10) {
			System.out.print(i + " ");
			i += 2;
		}
		
		System.out.println();
		
		i = 10;
		while (i >= 1) {
			System.out.print(i + " ");
			i--;
			
		}
		
		System.out.println();
		
		// 증감식의 위치에 따라 초기식, 조건식이 바뀔 수 있다
		
		i = 0;
		while (i <= 9) {
			i++;
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		System.out.println("종료 후 i의 값 : " + i);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		}

