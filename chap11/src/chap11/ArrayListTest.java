package chap11;

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
		return id + "-" + name + "-"+pay;
	}
	
}

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList list = new ArrayList(5);

		list.add("java");
		list.add(100); // 컬렉션프레임워크 객체들만 저장 - Integer 취급
		list.add(1, 3.14);
		list.add("spring");
		list.add(200);
		// 자동 5개 증가
		list.add(3.14); // 추가

		list.set(1, 300); // 수정
		list.remove(1); // 삭제

		Employee e1 = new Employee(100, "김사원", 50000.0);
		list.add(e1);
		Employee e2 = new Employee(200, "최과장", 65000.0);
		list.add(e2);
		Employee e3 = new Employee(300, "신부장", 80000.0);
		list.add(e3);

		System.out.println(list.indexOf(3.14)); // 데이터 위치 찾기
		System.out.println(list.size()); // 데이터 개수 조회
		for (int i = 0; i < list.size(); i++) {
			// 1. Employee 타입이면 name 변수 출력
			/*if (list.get(i) instanceof Employee) {
				System.out.println(((Employee) list.get(i)).name); */ // 데이터 조회,
			
				// 2. id-name-pay 형식 출력. 문자열, 정수, 실수 타입 값만 출력
			System.out.println(list.get(i));
			
			}
		}
		// int array[] = new int[5];
		// System.out.println(array.length);// 배열 생성 0 자동 초기화
	}

