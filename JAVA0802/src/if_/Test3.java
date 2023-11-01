package if_;

public class Test3 {

	public static void main(String[] args) {
		// 문자 ch에 대해 대문자, 소문자, 숫자 판별
		// => 위의 모든 조건이 false일 때, "기타 문자" 출력
	
	char ch = 'a';
	if (ch >= 65 && ch <= 90) {
		System.out.println(ch + " : 대문자");
	} else if (ch >= 97 && ch <= 122) {
		System.out.println(ch + " : 소문자");
	} else if (ch >= '0' && ch <= '9') { // ch >= 48 && ch <= 57
		System.out.println(ch + " : 숫자");
	} else { System.out.println(ch +  " : 기타 문자");}

	// 문자 ch가 대문자일 때, 소문자로 변환.
	// 			 소문자일 때, 대문자로 변환.
	// 대문자, 소문자가 아닐 경우 "변환 불가" 출력
	if (ch >= 'A' && ch <= 'Z') {
		System.out.println(ch + " : 대문자");
		ch += 32;
		System.out.println("소문자 변환 : " + ch);
		
	} else if (ch >= 'a' && ch <= 'z') {
		System.out.println(ch + " : 소문자");
		ch -= 32;
		System.out.println("대문자 변환 : " + ch);
		
		
	} else {
		System.out.println(ch + " : 변환 불가");
	}
	// 학생의 점수를 입력받아 학점 계산 후 출력
	// - 점수 저장 변수 score
	// - 학점 저장 변수 grade
	//	계산 결과에 따른 학점을 문자열로 grade 변수에 저장
	//	학점 "A" - 점수 : 90 ~ 100
	//	학점 "B" - 점수 : 80 ~ 89
	//	학점 "C" - 점수 : 70 ~ 79
	//	학점 "D" - 점수 : 60 ~ 69
	//	학점 "F" - 점수 : 0 ~ 59
	
	int score = 101;
	String grade = "";
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
	
}
