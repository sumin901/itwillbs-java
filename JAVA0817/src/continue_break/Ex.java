package continue_break;

public class Ex {

	public static void main(String[] args) {
		/*
		 * break 문 /  continue문
		 * 
		 *  - 반복문 내에서 특정 조건식과 결합해 반복문의 실행 흐름을 제어하는 용도로 사용
		 *  
		 *  1. break 
		 *  
		 *  - 반복문 내에서 조건식에 따라 반복문을 종료하는 용도로 사용
		 *    주로 if문과 조합해 반복문을 빠져나갈 조건을 설정한다
		 *    
		 *  <기본 문법>
		 *  for(초기식;조건식;증감식;) or while{
		 *  	if(조건) {
		 *  		break; // 현재 속해 있는 반복문의 코드 실행을 종료
		 *  	}
		 *  }
		 * 
		 *  
		 */
		
		int i = 1;
		
		for(i=1; i<9; i++) {
			System.out.println(i);
			if(i==5) {
				System.out.println("i가 5이므로 종료");
				break;
			}
			
		}
			System.out.println("for문 종료 후 i : " + i);
			
		i = 1;
		while( i < 11 ) {
			System.out.println(i);
			
			if ( i == 5 ) {
				System.out.println("i의 값이 5이므로 종료");
				break;
			}
			i++;
		}
			System.out.println("while문 종료 후 i : " + i);
		
		/*
		 * 2. continue 문
		 * 
		 *  - 반복문 내에서 조건식에 따라 반복문의 다음 문장 실행을 생략하고 다음 반복을 진행시킨다
		 *  
		 *  <기본 문법>
		 *  for(초기식;조건식;증감식) or while {
		 *  	if(조건){
		 *  	continue; // 현재 반복문의 continue 문 아래쪽 문장 실행을 생략하고
		 *  			  // 다음 반복 실행을 위해 for문의 증감식 또는 while문의 조건식으로 이동한다
		 *  	}
		 *  }
		 */
		
		for(i=1; i<11; i++) {
			if(i == 5) {
				System.out.println("i 값이 5이므로 생략");
				continue;
			}
			System.out.println(i);
		}
		System.out.println("for문 종료 후 i 값 : " + i);
		
		/*
		 * 생략된 for문
		 * 
		 * 초기식, 조건식, 증감식 각각 생략 가능하며
		 * 초기식, 조건식, 증감식 모두 생략 가능하다
		 * 
		 * 초기식 생략 : 초기화가 돼있다면 초기식을 생략하고 for문을 사용가능하다
		 * 조건식 생략 : 조건식에 조건을 기입하지 않으면 항상 true로 해석한다
		 * 증감식 생략 : for문 내에 증감식을 기입한다.
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
