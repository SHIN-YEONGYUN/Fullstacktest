package chapremind;

class Multiple extends Calculator0 {
	public void multiplication() {
		System.out.println(this.left * this.right);
	}
}

public class ConstD2 {

	public static void main(String[] args) {

		Multiple c1 = new Multiple();
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		c1.multiplication();

		System.out.println("-----------");

	}

}