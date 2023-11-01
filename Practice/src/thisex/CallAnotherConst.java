package thisex;

public class CallAnotherConst {
	public static void main(String[] agrs) {
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		System.out.println(noName.height);
		
		Person p = noName.returnItSelf();
		System.out.println(p);
		System.out.println(noName);
		
	}
}

class Person {
	
	String name;
	int age;
	int height;
	Person() {
		this("이름없음", 27, 187);
		
	}
	
	Person(String name, int age, int height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	Person returnItSelf() {
		return this;
	}
}
