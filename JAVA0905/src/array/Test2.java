package array;

import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 배열의 최대값을 구하는 코드
		 * numbers = {3, 2, 14, 21, 100, 4, 2, 1}
		 * 
		 * int max; int min; int sum; int avg;
		 * 
		 * 출력 결과
		 * 
		 * max : 100
		 * min : 1
		 * sum : 
		 * avg : 
		 * 
		 */
		
		int[] arr = {3, 2, 14, 21, 100, 4, 2, 1,321,21,33,45};
		
		int max = 0;
		int num = 0;
		
		System.out.println("오름차순");
		// 최대값을 배열 맨 마지막으로 옮기기
		// 맨 마지막 제외 또 반복하면? 모든 배열을 오름차순으로 정리할 수 있다?
		for (int x = arr.length; x > 0; x--) {
			for (int i = 1; i < arr.length; i++) {
				
				if(arr[i-1] > arr[i]) {
					num = arr[i];
					arr[i] = arr[i-1];
					arr[i-1] = num;
				} 
				
				
				
			}
		}
		
		
		for (int a = 0; a < arr.length ; a++) {
			System.out.print(arr[a] + " ");
		}
		System.out.println();
		// 내림차순 == 오름차순의 반대
		
		System.out.println("내림차순-ver1");
		
		for (int x = arr.length; x > 0; x--) {
			for (int i = 1; i < arr.length; i++) {
				
				if(arr[i-1] < arr[i]) {
					num = arr[i];
					arr[i] = arr[i-1];
					arr[i-1] = num;
				} 
				
				
				
			}
		}
		for (int a = 0; a < arr.length ; a++) {
			System.out.print(arr[a] + " ");
		}
		System.out.println();
		// 내림차순-ver2
		
		System.out.println("내림차순-ver2");
		
		for (int x = arr.length; x > 0; x--) {
			for (int i = arr.length-2; i >= 0; i--) {
				
				if(arr[i] < arr[i+1]) {
					num = arr[i+1];
					arr[i+1] = arr[i];
					arr[i] = num;
				} 
				
				
				
			}
		}
				
		for (int a = 0; a < arr.length ; a++) {
			System.out.print(arr[a] + " ");
		}	
	
		Arrays.sort(args);
		
		
		
		
		
		
		
		
		
	}

	
	
}


