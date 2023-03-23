package chap14;

@FunctionalInterface
interface Calculable {
	int sum(int a, int b);
}

@FunctionalInterface
interface MyFunction {
	public int getValue(int x);
}

@FunctionalInterface
interface GenericInterface<T> {
	public T getValue(T i, T j);
}

public class LambdaTest2 {

	public static void main(String[] args) {
		Calculable calc = null;
		// 메소드 형태 유추, 리턴타입 명시되어있지않아도 리턴문장
		calc = (int a, int b) -> {
			return a + b;
		};
		System.out.println(calc.sum(10, 20));

		// 매개 변수 타입 유추.
		calc = (a, b) -> {
			return a + b;
		};
		System.out.println(calc.sum(20, 40));

		// {} 내부에 1문장이고 return문장이라면 생략
		calc = (a, b) -> a + b;
		System.out.println(calc.sum(50, 50));

		MyFunction fun = i -> i * i * i;
		System.out.println(fun.getValue(5));

		GenericInterface<String> gen1 = (s1, s2) -> s1 + s2;
		GenericInterface<Integer> gen2 = (s1, s2) -> s1 + s2;
		System.out.println(gen1.getValue("람다","표현식"));
		System.out.println(gen2.getValue(30, 40));
	}

}
