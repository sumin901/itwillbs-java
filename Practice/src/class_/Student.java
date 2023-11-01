package class_;

public class Student {
	String studentName;
	int studentId;
	int grade;
	String address;
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
	
	int add (int num1, int num2) {
		int result;
		result = num1 + num2;
		return result;
	}
	
		int getTenTotal () {
		
		int total = 0;
		int a;
		for (a=1 ; a <= 10 ; a++ ) {
			total += a;
		}
		return total;
	} 
	
}
