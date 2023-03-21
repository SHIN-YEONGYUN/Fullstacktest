package chap8;

class B {
	void m1(int i) /* throws ArithmeticException */ {
		System.out.println(100 / i); // unchecked
	}

	void m2(String name) {
		// 특정 클래스 포함 변수나 메소드 생성자 정보 출력
		// thorows ClassNotFoundException
		/*
		 * class Class { forName(String name) throws ClassNotFoundException { name 클래스
		 * 찾아서 변수 메소드 생성자 .. } }
		 */
		try {
			Class c = Class.forName(name);
			System.out.println(name + " class 존재합니다.");
		} catch (ClassNotFoundException e) { // checked
			System.out.println(name + "class 미존재합니다.");
		}
	}
}

public class ThrowsTest2 {

	public static void main(String[] args) {
		B b1 = new B();
		// b1.m1(0);
		b1.m2(args[0]);

	}

}
