package inter;

interface I {
	void ma();

	// 인터페이스 구현 하위클래스들 다수 사용중 상황에서 mb 추가
	// jdk 8 이후 (jdk 17)
	default void mb() {
		System.out.println("추가되어도 기존 설계 변경 없음 - 선택적 오버라이딩");
	}

	// 인터페이스 구현 하위클래스들 다수 사용중 상황에서 mc 추가 - 구현 상태 제공 -> 모든 하위클래스들 공통
	static void mc() {
		System.out.println("추가되어도 기존 설계 변경 없음 - 구현 상태 (하위클래스 동일) -> 오버라이딩 불가");
	}
}

class A implements I {
	public void ma() {
		System.out.println("A클래스 ma 메소드 오버라이딩");
	}

}

public class InterfaceTest3 {

	public static void main(String[] args) {
		A a1 = new A();
		a1.ma();
		a1.mb();
		I.mc();

	}

}
