package chap11;

import java.util.Arrays;
import java.util.Comparator;

public class ComaratorTest {

	public static void main(String[] args) {
		// 사전 나열 순서대로 - 오름차순(unicode) - 특수문자, 숫자, 대문자, 소문자,..
		// 사전 반대 순서 - 내림차순
		String[] animals = { "lion", "Snake", "tiger", "dog" };
		Arrays.sort(animals);
		System.out.println(Arrays.toString(animals));

		class MyComparator implements Comparator {

			@Override
			public int compare(Object o1, Object o2) {
				if (o1 instanceof String && o2 instanceof String) {
					String s1 = (String) o1;
					String s2 = (String) o2;
					return s1.compareTo(s2) * -1 ;
				}
				else {
					return -1;
				}
			}

		} // MyComparator End
		
		MyComparator mc = new MyComparator();
		Arrays.sort(animals, mc);
		System.out.println(Arrays.toString(animals));
		
		System.out.println("============================");
	
	}

}
