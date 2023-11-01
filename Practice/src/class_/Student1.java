package class_;

public class Student1 {
	
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public String getStudentName () {
		return studentName;
	}
	
	
	public static void main(String[] args) {
		Student1 studentYoon = new Student1();
		studentYoon.studentName = "윤수민";
		
		System.out.println(studentYoon.studentName);
		System.out.println(studentYoon.getStudentName());
		
	}
}
