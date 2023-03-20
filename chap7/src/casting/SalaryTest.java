package casting;

class Employee {
	int id;
	int BaseSalary;
	int empFee;
	int TotalSalary;
	String name;

	Employee() {
	}

	Employee(int id, String name, int BaseSalary, int empFee) {
		this.id = id;
		this.BaseSalary = BaseSalary;
		this.empFee = empFee;
		this.name = name;
	}

	public void Calc() {
		TotalSalary = BaseSalary + empFee;
	}
}

class Manager extends Employee {
	int manFee;

	Manager(int id, String name, int BaseSalary, int empFee, int manFee) {
		// super(); // 자동 정의 Employee () 생성자 호출
		super(id, name, BaseSalary, empFee); // Employee (int,String, int, int) 생성자 호출
// this.id =id;
// this.name =name;
// this.BaseSalary = BaseSalary;
// this.empFee = empFee;
		this.manFee = manFee;
	}
	@Override // @xxxx - annotation
	public void Calc() {
		super.Calc();
		TotalSalary += manFee;
	}
}

class Engineer extends Employee {
	int certiFee, techFee;

	public Engineer(int id, String name, int BaseSalary, int empFee, int certiFee, int techFee) {
		super(id, name, BaseSalary, empFee);
		this.certiFee = certiFee;
		this.techFee = techFee;
	}

	public void Calc() {
		super.Calc();
		TotalSalary += certiFee + techFee;
	}
}

class Secretary extends Employee {
	int secFee;

	public Secretary(int id, String name, int BaseSalary, int empFee, int secFee) {
		super(id, name, BaseSalary, empFee);
		this.secFee = secFee;
	}

	public void Calc() {
		super.Calc();
		TotalSalary += secFee;
	}
}

public class SalaryTest {

	public static void main(String[] args) {
		Employee e[] = new Employee[4];
		// 1.상속 2.생성자(타입 순서 갯수....)
		e[0] = new Employee(1000, "김사원", 10000, 5000);

		e[1] = new Manager(2000, "김간부", 20000, 10000, 10000);

		e[2] = new Engineer(3000, "박기술", 15000, 7500, 5000, 5000);

		e[3] = new Secretary(4000, "최비서", 15000, 7000, 10000);
		System.out.println("사번 : 이름 : 본봉 : 총급여");
		for (int i = 0; i < e.length; i++) {
			e[i].Calc(); // 오버라이딩 메소드. 각 객체 내부 메소드 호출
			System.out.println(e[i].id + " : " + e[i].name + " : " + e[i].BaseSalary + " : " + e[i].TotalSalary);
			if (e[i] instanceof Engineer) {
				System.out.println("기술직사원의 경우 : " + (((Engineer) e[i]).certiFee + ((Engineer) e[i]).techFee));
			}
		}
		/*
		 * 배열 내의 각 객체의 급여계산메소드 호출하고 사번, 이름, 총급여 출력 단, 기술직 사원은 기술수당, 자격수당도 출력
		 * 
		 * 사번:이름:본봉:총급여 1000:이사원:10000:xxxxx 2000:김간부:20000:xxxxx 3000:박기술:15000:xxxxx
		 * 기술직사원의 경우 : 기술수당 자격수당 4000:최비서:15000:xxxxx
		 */

	}

}
