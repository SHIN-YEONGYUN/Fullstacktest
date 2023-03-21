package chap9;

import java.util.ArrayList;

public class WrapperTest {

	public static void main(String[] args) {
		int i = 100;

		Integer in = new Integer(100);

		int j = new Integer("200"); // auto unboxing
		Integer in2 = 200; // 기본형 변수를 클래스 포함 auto boxing

		ArrayList<Integer> list = new ArrayList<Integer>(5);
		list.add(1);

		System.out.println(list);

	}

}
