package day1;

public class VariableTest {

	public static void main(String[] args) {
		System.out.println("변수 테스트중");
		int i = 10;
		int j = 20;
		int k = i + j;
		System.out.println(i + "+" + j + "=" + k); // 10+20=30

		char c = '가';
		System.out.println(c);

		boolean b = false; // b 변수 정의하면서 false 값 저장
		System.out.println(b);
		b = 10 > 5; // b 변수값 변경
		System.out.println(b);

		System.out.print("종료줄");
		System.out.println("종료줄2");

		// byte -2^7 ~ 2&7-1 ==> -128 ~ 127
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		// byte, short, int ,long

		byte b2 = 127; // 1111111
		byte b3 = 1;
		byte b4 = (byte) (b2 + b3); // [0][1111111]
		int b5 = b2 + b3;
		System.out.println(b4); // -128
		System.out.println(b5);

		double d = 89.8989;
		int di = (int) d; // 89 (값 손실 가능성)
		System.out.println(di);

		char plus = 'A';
		int intPlus = plus;
		System.out.println(intPlus); // 'a'~'z' = 97 ~ 122, 'A' ~ 'Z' = 65 ~ 90 '0' ~ '9' = 48 ~ 57

		// System.out.println((int)'+');
		// System.out.println((int)"+");

		double qq = (10 / (double) 3);
		System.out.println(qq); // 나누기 몫 소수점
		double ee = (112 % (double) 3);
		System.out.println(ee); // 나누기 나머 소수점

		int ii = 20;
		int pp = ii++;
		int www = ii + pp;
		System.out.println(www); // 증감연산자 - 후위형

		boolean qi = true;
		boolean wi = false;
		boolean ei = qi && wi;
		boolean ri = qi || wi;
		System.out.println(ei);
		System.out.println(ri);

		int xx = 49;
		String result1 = xx > 10 ? "크다" : "작다";
		int result2 = xx > 10 ? 1 : -1;
		double result3 = xx > 10 ? 10 : 9.99;
		int result4 = xx >= 10 && xx < 99 ? 1 : -1;

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	

	}

}
