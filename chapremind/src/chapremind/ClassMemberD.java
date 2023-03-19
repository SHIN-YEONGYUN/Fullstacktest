package chapremind;

class C1 {
	static int static_variable = 1;
	int instance_variable = 2;

	static void static_static() {
		System.out.println(static_variable);
	}

	static void static_instance() {
		// 클래스 메소드에서는 인스턴스 변수에 접근 할 수 없다.
		// System.out.println(instance_variable);
	}

	void instance_static() {
		// 인스턴스 메소드에서는 클래스 변수에 접근 할 수 있다.
		System.out.println(static_variable);
	}

	void instance_instance() {
		System.out.println(instance_variable);
	}
}

public class ClassMemberD {

	public static void main(String[] args) {
		C1 c = new C1();

		// c.static_static();

		// c.static_instance();

		System.out.println("----");

		c.instance_static();

		c.instance_instance();

		System.out.println("-----");

		C1.static_static();

		// C1.static_instance();

		// C1.instance_static();

	}

}
