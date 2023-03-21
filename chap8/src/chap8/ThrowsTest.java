package chap8;

class A {
	void m1(int i) throws ArithmeticException {
		System.out.println(100 / i);
	}

	void m2() {
		m1(100);
	}

	void m3() throws ArithmeticException {
		m1(0);
	}

	void m4() {
		try {
			m1(0);
		} catch (ArithmeticException e) {
			m1(100);
		}
	}
}

public class ThrowsTest {
// 예외 자바 전달 - (기본 예외 처리 기능) / try-catch (사용자 처리 기능)
	public static void main(String[] args) throws ArithmeticException {
		A a1 = new A();
		a1.m2();
		a1.m3();
		/*
		 * try { a1.m3(); } catch(ArithmeticException e ) {
		 * System.out.println("메인에서 처리하겠습니다."); }
		 */
		a1.m4();

	}

}
