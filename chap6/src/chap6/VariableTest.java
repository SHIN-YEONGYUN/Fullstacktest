package chap6;

class Sample {
	// 객체 속성 정보 표현 - 객체 모든 메소드 사용 가능. 멤버 변수
	int member = 10;

	void test() {
		int local = 20; // 지역변수(메소드 영역)
		for (int i = 0; i < 5; i++) { // 지역변수 (for 영역)
			System.out.println(i);
		}
		System.out.println(member);
		System.out.println(local);
	}

	void test2() {
		System.out.println(member);
		// System.out.println(local);
	}

	int add(int a, int b) {
		int result = a - b;
		return result;
	}

	int div(int a, int b) {
		if (b != 0) {
			return a / b; // 결과물 가지고 "되돌아감" - 나머지 문장 수행 x
		}
		return 0;
	} // div end

	void div2(int a, int b) {
		if (b == 0) {
			return;
		}
		System.out.println(a / b);
		System.out.println("0으로 나눌 수 없습니다.");
	} // div2 end
}// sample end

public class VariableTest {

	void m1() {
		System.out.println("m호출");
	}

	static void m2() {
		System.out.println("m2호출");
	}

	// main. m2 - 객체생성이전 메모리 저장
	// m1 - 객체생성 시 메모리 저장
	public static void main(String[] args) {
		m2();
		VariableTest vt = new VariableTest();
		vt.m1();
		// Sample 클래스 test 메소드 실행 결과 출력
		Sample s = new Sample(); // s.test()
		s.test();
		s.test2();
		System.out.println(s.add(10, 20));
		int result1 = s.div(10, 5);
		System.out.println(result1);

	}

}
