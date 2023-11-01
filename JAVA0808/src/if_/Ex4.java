package if_;

public class Ex4 {

	public static void main(String[] args) {
	/*
	 * 중첩 if문
	 * - if문(else if 또는 else 포함) 블록 내에서
	 *   또 다른 if문을 중첩으로 사용한 것
	 * 
	 * <기본 문법>
	 * if(조건식1) {
	 * 		if(조건식2) {
	 * 		조건식1이 true이고, 조건식2가 true일 때 실행
	 * 		}
	 * 		else {
	 * 		조건식1이 true이고, 조건식2가 false일 때 실행
	 * 		}
	 * } else {
	 * 		조건식1이 false일 때 실행
	 * }
	 */

	int score = 101;
	String grade = "";
	
	if (score >= 0 && score <= 100) {
		System.out.println("점수 입력 완료");
	}
	else {System.out.println(score);
	
	if (score >= 0 && score <= 100) {
		if (score >= 90) {
			grade = "A 학점";
			System.out.println(grade);
		} else if (score >= 80) {
			grade = "B 학점";
			System.out.println(grade);
		} else if (score >= 70) {
			grade = "C 학점";
			System.out.println(grade);
		} else if (score >= 60) {
			grade = "D 학점";
			System.out.println(grade);
		} else {
			grade = "F 학점";
			System.out.println(grade);
		}
	} else {
		System.out.println("0 ~ 100의 값을 입력하세요");
		}
		
	}

}}
