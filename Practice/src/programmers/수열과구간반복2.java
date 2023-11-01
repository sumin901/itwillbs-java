package programmers;



import java.util.Arrays;


public class 수열과구간반복2 {
	/*
	 * 
	 * 정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. 
	 * queries의 원소는 각각 하나의 query를 나타내며, [s, e, k] 꼴입니다.

		각 query마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 k보다 크면서 가장 작은 arr[i]를 찾습니다.

		각 쿼리의 순서에 맞게 답을 저장한 배열을 반환하는 solution 함수를 완성해 주세요.
		단, 특정 쿼리의 답이 존재하지 않으면 -1을 저장합니다.
	 * 
	 * 	첫 번째 쿼리의 범위에는 0, 1, 2, 4, 3이 있으며 이 중 2보다 크면서 가장 작은 값은 3입니다.
		두 번째 쿼리의 범위에는 0, 1, 2, 4가 있으며 이 중 2보다 크면서 가장 작은 값은 4입니다.
		세 번째 쿼리의 범위에는 0, 1, 2가 있으며 여기에는 2보다 큰 값이 없습니다.
		따라서 [3, 4, -1]을 return 합니다.
	 *  
	 */
	
	public static void main(String[] args) {
	int[] arr = {0, 1, 2, 4, 3}; int[][] queries = {{0, 4, 2},{0, 3, 2},{0, 2, 2}};
	
	int[] answer = new int[queries.length];
	Arrays.fill(answer, -10);
	for(int i = 0 ; i < queries.length ; i++) {
		for(int j = queries[i][0] ; j <= queries[i][1] ; j++) {
			
			if (answer[i] == -10 && arr[j] > queries[i][2]) {
				answer[i] = arr[j];
				System.out.println("j : "+ j + " answer["+i+"]번 : "+answer[i]);
			} 
			
			else if ( answer[i] != -10 && arr[j] > queries[i][2]) {
				if (answer[i] < arr[j]) {
				answer[i] = answer[i];
				System.out.println("j : "+ j + " answer["+i+"]번 else if 문 ");
				} else {
					answer[i]= arr[j];
					System.out.println("j : "+ j + " answer["+i+"]번 else if else문 ");
				}
            }
			
		}
		
		if( answer[i] == -10 ) {
			answer[i] = -1;
			System.out.println("answer["+i+"]번 null = -1 ");
		}
		
		
			
	}
	for(int i = 0 ; i < queries.length ; i++) {
		
		System.out.println(answer[i]);
	
	}
	
	}

}
	

	


