package continue_break;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 구구단 2단 ~ 9단 출력 중 5단이 될 때 출력 종료
		 * 
		 */

		
		
		for(int dan = 2; dan <= 9 ; dan++  ) {
			System.out.println("< " + dan + "단 > ");
			
			if ( dan == 5 ) {
				break;
			}
			
			for ( int i = 1; i <= 9 ; i++) {
				
					System.out.printf("%d * %d = %d\n", dan, i, dan*i);
					
				
			}
			System.out.println();
		}
		
		
	/*
	 *  Label 기능
	 *  
	 *  - 반복문의 앞에 위치하며 break 또는 continue의 동작 지점을 지정한다
	 *  
	 *  - break 문 또는 continue 문 뒤에 해당 레이블의 이름을 지정할 경우 
	 *    Label 위치의 다음 반복문에 break 또는 continu 문이 적옹된다
	 *  
	 *  - 주로 중첩 반복문에서 한번에 빠져나가기 위해 사용한다
	 *  
	 *  - 반복문 앞 또는 위에 주로 대문자로 된 문자를 작성하고 콜론을 붙인다
	 *  
	 *  <기본 문법>
	 *  
	 *  레이블명 : 
	 *  바깥반복() {
	 *  	안쪽반복() {
	 *  		if() {
	 *  		break 레이블명; 또는 continue 레이블명;
	 *  		}
	 *  	}
	 *  }	
	 */
			
			Exit:
			for(int dan = 2; dan <= 9 ; dan++  ) {
				System.out.println("< " + dan + "단 > ");
				
				if ( dan == 5 ) {
					break;
				}
				
				for ( int i = 1; i <= 9 ; i++) {
					
						System.out.printf("%d * %d = %d\n", dan, i, dan*i);
						
					
				}
				System.out.println();
			}
				
			
			
			
			
			
			
		
		
		
		
		
		
		
		
	}

}
