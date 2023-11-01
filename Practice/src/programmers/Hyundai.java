package programmers;

import java.util.ArrayList;
import java.util.Collection;

public class Hyundai {

	public static void main(String[] args) {
		/*
		 * 0) 0 1 2 3 4 5 6 
		 * 1) 01 2 3 4 5 6
		 * 2) 01 23 4 5 6
		 * 3) return += "No"
		 * 4) 2301 4 5 6
		 * 5) return += "Yes"
		 * 6) 23015 4 6
		 * 7) 230154 6
		 * 8) return += "Yes"
		 * 9) 23015 4 6
		 * 10) return += "no"
		 *  
		 * 
		 * 
		 */
		
//		
//        [1,x,y] 쿼리 : 
//        y가 포함된 집합의 원소들을 모두 x 집합으로 옮긴다
//        => 1. 말 그대로 옮기기
//           2. 지우고 x 집합 인덱스에 추가하기
//            
//        단, x와 y가 같은 집합에 속해있다면 해당 쿼리는 실행하지 않는다. 
//        => x가 위치한 인덱스 와 y가 위치한 인덱스가 같으면 실행하지 않는다
//            
//        [2,x,y] 쿼리 : 
//        새로운 집합을 생성합니다.
//            
//        x와 y가 포함된 집합에서 x와 같거나 늦게 집합으로 들어왔으면서 y와 같거나 빠르게 집합으로 들어온 원소들을 새로 생성한 집합으로 옮깁니다. 
//        [1,?,x]의 queries[] 인덱스 ~ [1,?,y] queries[] 인덱스 사이에 존재하는 queries[][!]를 새로운 배열에 저장한다
//        집합에 들어온 순서는 몇 번째 쿼리로 집합에 들어왔는지로 판별합니다. 
//        같은 쿼리로 집합에 들어왔다면 같은 순서로 집합에 들어왔다는 것을 의미합니다.
//        
//        x와 y는 항상 같은 집합에 포함되어 있습니다.
//            
//        [3,x,y] 쿼리 : 
//        x와 y가 같은 집합에 속해있다면 "Yes"를, 그렇지 않다면 "No"를 return 할 배열의 뒤에 추가합니다.
//        
//        집합은 크기가 0이 되면 사라지며, 초기 집합들은 0번째 쿼리로 형성됩니다.
//        return answer;        
//    

		
		
		int[][] queries = {
				{1,0,1},
				{1,2,3},
				{3,1,3},
				{1,2,0},
				{3,1,3},
				{1,1,5},
				{1,5,4},
				{3,4,5},
				{2,2,5},
				{3,4,5}
			};
		
		int[][] arr = {
				{0},
				{1},
				{2},
				{3},
				{4},
				{5},
				{6}
		};
		
		System.out.println(queries.length);
		
		int n = 7;
		int[] num = {0,1,2,3,4,5,6};
	
		
		ArrayList<int[]> al = new ArrayList<>(); 
		System.out.println("?");
		
		
		
		System.out.println(al.size());
		
		for(int i = 0 ; i < queries.length; i++) {
			switch(queries[i][0]) {
			case 1:
//        [1,x,y] 쿼리 : 
//        y가 포함된 집합의 원소들을 모두 x 집합으로 옮긴다
//        => 1. 말 그대로 옮기기
//           2. 지우고 x 집합 인덱스에 추가하기
				
				
				
				
				
				break;
				
				
				
			case 2:
				
				
				break;
				
				
				
			case 3:
				
				
				break;
			}
		}
		
		
		
		
		
		
		}
		
	}



