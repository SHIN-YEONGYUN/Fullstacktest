package casting;

class Parent {
	int su = 10;

	void print() {
		System.out.println(su);
	}

	void mp() {
		System.out.println("Parent클래스");
	}
}

class Child1 extends Parent {
	int su = 20;

	void print() {
		System.out.println(su);
	}

	void mc() {
		System.out.println("Child1클래스");
	}
}

public class CastingTest {

	public static void main(String[] args) {
		Parent p1 = new Parent();
		System.out.println(p1.su);
		p1.print();
		p1.mp();
		Child1 c1 = new Child1();
		System.out.println(c1.su);
		c1.print();
		c1.mp();
		c1.mc();
		Parent p2 = new Child1(); // 객체 자동형변환 ( 여러가지 객체 타입 1개 통일)
		System.out.println(p2.su);
		p2.print();
		p2.mp();
		Child1 c2 = (Child1) p2; // 명시적 형변환 - 다시 원래 하위클래스로 변환
		c2.mc(); // Child1 클래스
		System.out.println(c2.su); // 20

		Parent list[] = new Parent[3];
		list[0] = p1; // 형변환 필요 없음
		list[1] = c1; // 자동형변환 발생
		list[2] = p2; // 자동형변환 발생

		list[0].mp();
		list[1].mp();
		list[2].mp();
		// Child1 c3 = (Child1)list[2];
		// c3.mc();
		((Child1) list[2]).mc();
		System.out.println("---------");
		for (int i = 0; i < list.length; i++) {
			list[i].mp();
			if (list[i] instanceof Child1) // Child1 클래스로 만들어진 내용만.
				((Child1) list[i]).mc();
		}

	}

}
