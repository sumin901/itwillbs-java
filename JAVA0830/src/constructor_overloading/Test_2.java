package constructor_overloading;

public class Test_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MyDate2 d = new MyDate2();
		
		
		
		
		d.setYear(2023);
		d.setMonth(2);
		d.setDay(29);
		d.showDate();
		
				
	}

}
/*
 * 날짜를 관리하는 MyDate2 클래스 정의
 * 
 *  - 멤버변수 : 연도(year, int), 월(month, int), 일(day, int) >> 접근제한자 private 설정
 *  
 *  - 파라미터 생성자 
 *    연도, 월, 일을 전달받아 초기화
 *    년 : 1900 ~ 2100
 *    월 : 1 ~ 12
 *    일 : switch문 1,3,5,7,8,10,12월 - 31일까지
 *    	 			4,6,9,11월 - 30일까지
 *    				2월 - 29일까지 (윤달 포함, 윤달 : 100에 나눠떨어지지않고 4에 나눠떨어지는 해) 
 *    입력 값의 유효성을 판단하는 isValid() 정의
 *    
 *    Hint. 1) private 접근제한자므로 Getter/Setter필요
 *    	    2) 파라미터 생성자에 데이터를 전달 시 멤버변수 초기화는 Setter() 메서드를 활용하라
 */

class MyDate2 {
	
	private int year;
	private int month;
	private int day;
	boolean isValid = true;
	
	
	public MyDate2() {
		year = 0;
		month = 0;
		day = 0;
	}
		
	public String isValid () {
		if(isValid) {
			return "유효한 날짜입니다 " + year + "년 " + month + "월 " + day + "일";
		} 	else	{ 
			return "유효하지 않은 날짜입니다 " + year + "년 " + month + "월 " + day + "일";
		}
	}
	
		
	public void setYear(int year) {
		if (year >= 1900 & year <= 2100) {
			this.year = year;
		} else { isValid = false; }
	}
	public void setMonth(int month) {
		if (month >= 1 & month <= 12) {
			this.month = month;
		} else { isValid = false;}
	}
	// 2월일때 , 윤년이면 29일 아니면 28일
	// 2월 제외의 달은 switch-case문
	public void setDay(int day) {
		if (month == 2) {
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ) {
				if ( 1 <= day && day <= 29) {
					this.day = day;
				} else { isValid = false; }
			} else {
				if ( 1 <= day && day <= 28) {
					this.day = day;
				} else { isValid = false; }
			}
			
		} else {
			switch (month) {
			case 1:	case 3:	case 5:	case 7:	case 8:	case 10: case 12:
				if (day >= 1 && day <= 31) {
					this.day = day;
				} 
				else { isValid = false; }
				break;
				
			case 4:	case 6: case 9: case 11:
				if (day >= 1 && day <= 30) {
					this.day = day;
				}
				else { isValid = false; }
				break;
				default : isValid = false;
			
			}
		}
	}
		
			
		
			
			
		
		public void showDate() {
			
			System.out.println(isValid());
			
		}
	
	
	
	
	
	
}
	
	
	