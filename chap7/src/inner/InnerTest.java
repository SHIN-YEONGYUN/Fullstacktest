package inner;

class A {
	class B {
		void mb() {
			System.out.println("내부 클래스의 메소드 호출");
		}
	}

	void ma() {
		class Local {
			void md() {
				System.out.println("지역 내부 클래스의 메소드 호출");
			}
		}
		Local l = new Local();
		l.md();
	}

}

interface Anony {
	void test(); /*
					 * { System.out.println("무명 클래스의 test 메소드 호출"); }
					 */
}

public class InnerTest {

	public static void main(String[] args) {
		// B b1 = new B();
		A a1 = new A();
		A.B ab = a1.new B();
		ab.mb();
		System.out.println("-------------");
		a1.ma();
		System.out.println("-------------");
		// Anony n1 = new Anony(); // Anony 객체 생성 불가능
		// Anony 상속 클래스 (이름 없다) 정의/오버라이딩/Anony 상속 클래스 객체 동시에 생성
		Anony n1 = new Anony() {
			public void test() {
				System.out.println("anony의 test 메소드 호출");
			}

		};
		n1.test();
	}

}
