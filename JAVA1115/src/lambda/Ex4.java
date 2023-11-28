package lambda;

import java.util.Arrays;
import java.util.Comparator;

public class Ex4 {

	public static void main(String[] args) {

		// 람다식 응용
		
		String[] str = {"this", "is", "java", "world"};
		
		System.out.println(Arrays.toString(str));
		
		Arrays.sort(str); // 오름차순 정렬
		System.out.println(Arrays.toString(str));
		
		/*
		 * 새로운 정렬 기능 만들기
		 * => 내부적으로 Comparator 의 compare() 메서드 사용
		 *    새로운 정렬 기능을 만들고 Arrays.sort()에 전달하면 됨
		 *    => 자바에서는 함수만 전달할 수 있는 방법이 없다 
		 *       따라서, 해당 기능을 갖는 객체를 전달해야 함
		 *       일회용으로 정렬 기능을 작성하려고 한다 = 익명 내부 클래스 활용
		 *       
		 */
		Arrays.sort(str, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// -1을 곱해서 내림차순으로 정렬한다
				return o1.compareTo(o2) * -1;
			}
		});
		
		System.out.println("내림차순 이후 str : " + Arrays.toString(str));
		
		/*
		 * 결국 정렬을 위해 필요했던 '기능'은 Comparator가 아니라 
		 * compare()라는 점
		 * 
		 * 자바의 특성으로 인해 compare()만 필요했지만
		 * 익명 내부 클래스를 만들어 객체화해서 전달
		 * 
		 * => 복잡한 과정을 단순화 => 람다식!!
		 * 
		 */
		System.out.println(" ----------------------------------- ");
		Arrays.sort(str,
				// -1을 곱해서 내림차순으로 정렬한다
			(o1, o2) -> o1.compareTo(o2) * -1
		);
		
		Arrays.sort(str, (o1, o2) -> o1.compareTo(o2) * -1);
	}

}
