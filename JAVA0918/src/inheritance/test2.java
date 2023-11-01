package inheritance;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m = new Manager("ㅅㅁ", 9500, "개발팀");
		System.out.println(m.getManager());
	}

}
// 직원 employee 클래스

class Employee {
	String name = "ㅇㅅㅁ";
	int salary = 8000;
	
	public String getEmployee() {
		String str = name + ", "+  salary;
		
		return str;
	}
	
}
class Manager extends Employee {
	String depart;
	public Manager (String name, int salary, String depart) {
		this.name = name;
		this.depart = depart;
		this.salary = salary;
	}
	
	
	public String getManager() {
		String str = getEmployee() + ", " + depart;
		return str;
	}
}