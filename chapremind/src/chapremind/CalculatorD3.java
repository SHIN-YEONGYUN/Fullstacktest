package chapremind;

class Calculator {
	static double PI = 3.14;
	// 클래스 변수인 base가 추가됨.
	
	int left, right;

	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void sum() {
		System.out.println(this.left + this.right);
	}

	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}

}

public class CalculatorD3 {

	public static void main(String[] args) {

		Calculator c1 = new Calculator();
		//System.out.println(c1.PI);
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();

		System.out.println("-----------");

		Calculator c2 = new Calculator();
		//System.out.println(c2.PI);
		c2.setOprands(20, 40);
		c2.sum();
		c2.avg();

		System.out.println("-----------");

		System.out.println(Calculator.PI);

	}

}
