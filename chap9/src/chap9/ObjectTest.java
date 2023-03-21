package chap9;

public class ObjectTest {

	public static void main(String[] args) {
		MyObject o1 = new MyObject("jsp");
		MyObject o2 = new MyObject("테스트");
		MyObject o3 = new MyObject("테스트");
		String s4 = new String("테스트");
		
		/* o1.equals(o2) -> false 
		 * o2.equals(o3) -> true
		 * o2.equals(s4) -> false
		 * */
		System.out.println(o1/* .toString() */); // 하위 오버라이딩 가능 - 객체 출력 내용 변경 가능
		// 패키지명.클래스명@16진수 주소값 = java.lang.Object@85ede7b
		System.out.println(o2);

		if (o1.equals(o2)) { // false 모든 클래스.(객체 주소값 동등 비교, 상속 하위클래스 오버라이딩 가능)
			System.out.println("o1.equals(o2) true");
		}
		if (o2.equals(o3)) { 
			System.out.println("o2.equals(o3) true");
		}
		if (o2.equals(s4)) { 
			System.out.println("o2.equals(s4) true");
		}
		if (o1 == o2) { // false 기본 + 참조형 (stack 저장값을 동등 비교, 자바 연산자 오버로딩,오버라이딩 X)
			System.out.println("o1 == o2 true");
		}
	}

}

class MyObject /* extends Object */ {
	String msg;

	MyObject(String msg) {
		this.msg = msg;
	}

	// + 자동 toString(), equals(),
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return msg;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MyObject) {
		return msg.equals(((MyObject) obj).msg);
		}
		else {
			return false;
		}

	}
	

}
