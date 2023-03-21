package chap9;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		// Math.rand()- 난수 발생
		// 0.0 <= ? < 1.0 "실수"
		int i = (int) (Math.random() * 100) + 1;

		System.out.println("================");

		Random ran = new Random();
		int j = ran.nextInt(100); // 1-100
		double k = ran.nextDouble(3.0);
		String kk = String.format("%.3f", k);

		System.out.println(i + " : " + j + " : " + kk);
	}

}
