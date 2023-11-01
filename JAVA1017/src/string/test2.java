package string;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1. 주민등록번호(jumin) 입력받아 성별 및 외국인 판별
		 * 	- 입력형식 : "xxxxxx-xxxxxxx"
		 * 	- 뒷자리 첫째 숫자 1 또는 3 : 남성
		 * 	- 뒷자리 첫째 숫자 2 또는 4 : 여성
		 * 	- 뒷자리 첫째 숫자 5 또는 6 : 외국인
		 * 
		 *  
		 * 
		 */
		
		String jumin = "960717-1000000";
		char[] checkJumin = jumin.toCharArray();
		char check = checkJumin[7];
		switch (check) {
		case '1':
		case '3': 
			System.out.println("주민번호 뒷자리 첫째 숫자 : " + checkJumin[7] + ", 남성입니다");
			break;
			
		case '2':
		case '4': 
			System.out.println("주민번호 뒷자리 첫째 숫자 : " + checkJumin[7] + ", 여성입니다");
			break;
			
		case '5':
		case '6': 
			System.out.println("주민번호 뒷자리 첫째 숫자 : " + checkJumin[7] + ", 외국인입니다");
			break;
			default: System.out.println("주민번호 형식이 올바르지 않습니다");
			}
		
		
		/*
		 * 2. 내용 중에서 실제 주소 부분만 추출하여 출력
		 * 	- 입력 형식 : Address: 주소 ...
		 * 	ex) Address : 부산광역시 진구 동천로 109 삼한게이트
		 * 	=> 부산광역시 진구 동천로 109 삼한게이트
		 */
		String address = "Address : 부산광역시 진구 동천로 109 삼한게이트";
		String realAddr = address.substring(10);
		System.out.println(realAddr);
		
		
		/*
		 * 문자열에 포함된 정보를 특정 기준 문자열 기준으로 분리해 항목별로 출력한다
		 * 
		 */
		System.out.println("-------------------------");
		String address2 = "Address : 부산광역시 진구 동천로 109, Floor:7층, Tel:051-123-1234";
		String[] strArr = address2.split(",");
		for(int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i].trim());
		}
		
		/*
		 * 
		 */
		String[] strArr2 = new String[strArr.length];
		
		for(int i = 0; i < strArr.length; i++) {
			
			strArr2 = strArr[i].split(":");
			System.out.print(strArr2[1].trim() + " ");
			
		}
		
		
	}
}
