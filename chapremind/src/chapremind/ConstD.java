package chapremind;

class Calculator0 {
	int left, right;

	void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}

	void sum() {
		System.out.println(this.left + this.right);
	}

	int avg() {
		System.out.println((this.left + this.right) / 2);
		return ((this.left + this.right) / 2);
	}
}

class SubsCalculator extends Calculator0 {
	void substract() {
		System.out.println(this.left - this.right);
	}

	int avg() {
		return super.avg();
	}
}

public class ConstD {

	public static void main(String[] args) {

		SubsCalculator c1 = new SubsCalculator();
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		c1.substract();

		System.out.println("-----------");

	}

}