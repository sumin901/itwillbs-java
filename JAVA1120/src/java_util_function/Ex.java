package java_util_function;

import java.util.function.Consumer;

public class Ex {

	public static void main(String[] args) {
		
		/*
		 * 
		 * 자바에서 제공하는 함수형 인터페이스 java.util.function 패키지
		 * 
		 * 						파라미터		리턴
		 * - Consumer 계열 			O			  X
		 * - Supplier 계열			X			  O
		 * - Function 계열			O			  O
		 * - Operator 계열			O			  O
		 * - Predicate 계열			O			  boolean
		 * 
		 * 
		 * 1. Consumer 계열(소비자)
		 * : 파라미터를 받아서 소비한다. 
		 *   리턴하지 않음.
		 * 
		 * 
		 */
		
		// 1. Consumer 계열
		
		// 익명 내부 클래스 방식
		Consumer<String> consumer = new Consumer<String>() {
			
			@Override
			public void accept(String t) {

				System.out.println(t);
				
			}
		};
		consumer.accept("컨슈머 익명 내부 클래스");
		System.out.println("------------------------");
				
		// 람다식 
		Consumer<String> consumer2 = t -> System.out.println(t);
		
		consumer2.accept("컨슈머 람다식 표현");
		
		Student s1 = new Student("홍길동", 80);
		
		// 람다식 표현
		printStudent(s1, s -> System.out.println(s.name));
		printStudent(s1, s -> System.out.println(s.score*=1.5));
		printStudent(s1, s -> System.out.println(s.name+ " : " + s.score));
		
		
		System.out.println("---------여러 줄로 표현 --------------");
		// 여러 줄로 표현
		printStudent(s1, s -> {
			System.out.println(s.name);
			s.score *= 1.5;
			System.out.println(s.name+ " : " + s.score);
		});
		
//		Consumer<Student> printer = new Consumer<Student>() {
//			
//			@Override
//			public void accept(Student s) {
//				System.out.println(s.name);
//				
//			}
//		};
		
	} // main 끝
	
	// 학생을 출력하려고하는데 방식은 아직 미정인 상태
	// 출력방식을 전달 받음(Consumer<Student> printer)
	public static void printStudent(Student s, Consumer<Student> printer) {
		printer.accept(s);
	}
	

} // Ex 끝

class Student {
	
	String name;
	double score;
	public Student(String name, double score) {
		super();
		this.name = name;
		this.score = score;
	}
	
	
	
}
