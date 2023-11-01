package array;

public class Test4 {

	public static void main(String[] args) {
		/*
		 * 정수형 2차원 배열 array
		 * 0행 : 95, 86
		 * 1행 : 83, 92, 96
		 * 2행 : 78, 83, 93, 87, 88
		 * 
		 * 모든 정수 합 sum과 평균 avg 출력
		 */

		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88},
				
		};
		int sum = 0;
		int count = 0;
		
		for(int i = 0; i < array.length; i++) {
			
			for(int j = 0; j < array[i].length ; j++) {
				sum += array[i][j];
				// count++; 동일함
			}
				count += array[i].length;
			
		}
		double avg = (double)sum / count;
		System.out.println("배열의 총합 : " + sum + " 배열의 평균 값 : " + avg );
		
		/*
		 * 학생 이름 1차 배열 names에 저장
		 * 
		 * 학생 점수 2차 배열 score에 저장
		 * 
		 * <출력 예시>
		 * 				
		 * 				- 학생 점수 표 -
		 * 
		 * 			국어	영어	수학
		 *  
		 * 홍길동	80		70		80
		 * 이순신	90		90		90
		 * 강감찬	50		60		77
		 * 최윤지	100		100		100
		 * 정윤정	80		80		60
		 * 
		 * 
		 */
		
		String[] names = {"홍길동", "이순신", "강감찬", "최윤지", "정윤정"};
		int[][] score = {
				{80, 70, 80},
				{90, 90, 90},
				{50, 60, 77},
				{100, 100, 100},
				{80, 80, 60},
				
		};
		
		System.out.println("         <학생 점수표>");
		System.out.printf("%s    국어  영어 수학\n", "   ");
		for(int i = 0 ; i < names.length; i++) {
			System.out.print(names[i]+ "  ");
			for(int j = 0 ; j < score[i].length ; j++) {
				System.out.printf("%3d  ", score[i][j]);
			}
			System.out.println();
		}
		int[] studentTotal = new int[score.length];
		for(int i = 0 ; i < score.length ; i++) {
			for(int j = 0 ; j < score[i].length; j++) {
				
				studentTotal[i] += score[i][j];
			}
			
		}
		System.out.println("학생별 총점");
		for(int i = 0 ; i < studentTotal.length ; i++) {
			System.out.println(names[i] + " : " + studentTotal[i] + "점 = " + i + "행(0열 + 1열 + 2열) => studentTotal[" + i + "]");
		}
		
		
		
		
		
	}

}
