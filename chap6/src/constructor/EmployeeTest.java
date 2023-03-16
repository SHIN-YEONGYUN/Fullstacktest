package constructor;

class Employee {
	// 매개변수, 지역변수 - 선언 블록 사용 scope
	// 자바 모든 클래스 자동 기본 생성자 정의
	// Employee(){ super(); }
	// 생성자 명시적 정의 - 자동 기본 생성자 삭제
	Employee(int id, String name, String dept, double pay, String title) {
		this.id = id;
		this.name = name;
		this.title = title;
		this.dept = dept;
		this.pay = pay;
		System.out.println("생성자 호출");
	}

	Employee(int id, String name) {
	  new Employee(id, name, "부서미정", 0.0 , "직급미정");
	}

	Employee() {
	    this(-1, "모름","부서미정", 0.0 , "직급미정");
	}

	int id;
	String name;
	String title;
	String dept;
	double pay;

	void work() {
		System.out.println(title + " 직급을 가지고 " + dept + " 부서에서 일합니다.");
	}

	void calcPay() {
		System.out.println("이 달의 급여는 5% 보너스가 추가됩니다. = " + (pay + pay * 0.05));
	}
}

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1 = new Employee(100, " 김시원", "IT개발부", 50000, "사원"); // 객체들 = 창조형변수 - heap Employee 변수 복사 메모리 할당

		// 클래스명 변수명 = new 생성장();
		/*
		 * 1. stack 영역 e1=null 저장 2. heap 영역 객체 복사 저장 3. 생성자가 있다면 정의 실행 4. 객체 주소를 e1 변수에
		 * 대입
		 */
		System.out.printf("사원의 사번은 %d , 이름은 %s , 부서는 %s , 직급은 %s , 급여는 %.2f 입니다.\n", e1.id, e1.name, e1.dept, e1.title,
				e1.pay);
//		e1.work();
//		e1.calcPay();

		Employee e2 = new Employee(200, "박대리");
		System.out.printf("사원의 사번은 %d , 이름은 %s , 부서는 %s , 직급은 %s , 급여는 %.2f 입니다.\n", e2.id, e2.name, e2.dept, e2.title,
				e2.pay);
//		e2.work();
//		e2.calcPay();

		Employee e3 = new Employee(); // 스프링 자바 클래스 기본 생성자 필수 요구하는 라이브러리가 다수 존재
		System.out.printf("사원의 사번은 %d , 이름은 %s , 부서는 %s , 직급은 %s , 급여는 %.2f 입니다.\n", e3.id, e3.name, e3.dept, e3.title,
				e3.pay);
	}

}
