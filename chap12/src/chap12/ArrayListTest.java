package chap12;

import java.util.ArrayList;

class Employee {
	int id;
	String name;
	double pay;

	public Employee(int id, String name, double pay) {
		// super();
		this.id = id;
		this.name = name;
		this.pay = pay;
	}

	@Override
	public String toString() {
		return id + "-" + name + "-" + pay;
	}

}

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>(5);
		/*
		 * Employee generic 타입 선언 - 
		 * 1. 컴파일러 미리 저장 타입 알려줌. 다른 타입 데이터 저장 오류 
		 * 2. 해당 객체의 타입 명시적 형변환 필요 없음. 타입 확인 필요 없음.
		 */

		Employee e1 = new Employee(100, "김사원", 50000.0);
		list.add(e1);
		Employee e2 = new Employee(200, "최과장", 65000.0);
		list.add(e2);
		Employee e3 = new Employee(300, "신부장", 80000.0);
		list.add(e3);

		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			// 1. Employee 타입이면 name 변수 출력
			System.out.println(list.get(i).name); // 데이터 조회,
			// 2. id-name-pay 형식 출력. 문자열, 정수, 실수 타입 값만 출력
			System.out.println(list.get(i));

		}
	}
	// int array[] = new int[5];
	// System.out.println(array.length);// 배열 생성 0 자동 초기화
}
