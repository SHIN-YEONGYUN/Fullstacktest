package chapremind;

class Calculator11 {
	int left, right;
	int third = 0;

	void setOprands(int left, int right) {
		System.out.println("setOprands(int left, int right)");
		this.left = left;
		this.right = right;
	}

	void setOprands(int left, int right, int third) {
		System.out.println("setOprands(int left, int right, int third)");
		this.setOprands(left, right);
		this.third = third;
	}

	void sum() {
		System.out.println(this.left + this.right + this.third);
	}

	int avg() {
		System.out.println((this.left + this.right + this.third) / 2);
		return ((this.left + this.right) / 2);
	}
}

public class ConstD4 {

	public static void main(String[] args) {

		Calculator11 c1 = new Calculator11();
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		c1.setOprands(10, 20, 30);
		c1.sum();
		c1.avg();

	}

}