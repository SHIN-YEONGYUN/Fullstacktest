package chap6;

class Factorial {
	void facto(int n) { // 반복문
		// n * n-1 * n-2 ... * 1
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result = result * i;
			System.out.println(i + " ! 구하는 단계 = " + result);
		}
		System.out.println(n + "!= " + result);
	}

	int facto2(int n) { // 재귀호출
		// n * n-1 * n-2 ... * 1
		int result = 0;
		if (n == 1) {
			result = 1;
		}
		else {
			result = n * facto2(n-1);
		}
		System.out.println(n + "!=" + result);
		return result;
	}
}

public class FatorialTest {

	public static void main(String[] args) {
		new Factorial().facto(6);
		System.out.println("-------------------");
		new Factorial().facto2(9);

		// Factoral f = new Factoral();

	}

}
