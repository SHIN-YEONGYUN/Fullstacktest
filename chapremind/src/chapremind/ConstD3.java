package chapremind;

class Division extends Multiple {
	public void division() {
		System.out.println(this.left / this.right);
	}
}

public class ConstD3 {

	public static void main(String[] args) {

		Division c1 = new Division();
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		c1.multiplication();
		c1.division();

		System.out.println("-----------");

	}

}