package chap6;

class Person {
	String name; // 객체변수(인스턴스변수)
	int age;
	static String nation = "대한민국"; // 클래스변수 (static 변수)
}

public class PersonTest {

	public static void main(String[] args) {
		System.out.println(Person.nation);
		Person p1 = new Person();
		p1.name = "김한국";
		p1.age = 22;
		// p1.nation = "대한민국";
		System.out.printf("p1 객체의 이름은 %s 나이는 %d 국적은 %s \n", p1.name, p1.age, Person.nation);

		p1 = null; // p1:100 --> 100 [name = xxx age = xxx]

		Person p2 = new Person();
		p2.name = "홍길동";
		p2.age = 18;
		// p2.nation = "대한민국";
		System.out.printf("p2 객체의 이름은 %s 나이는 %d 국적은 %s \n", p2.name, p2.age, Person.nation);

	}

}
