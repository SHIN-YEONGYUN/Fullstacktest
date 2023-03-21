package chap9;

public class StringSpliter {

	public static void main(String[] args) {
		String address = "서울시.강남구.역삼동.멀티캠퍼스.13층.2호";
		// 공백 구분으로 나눔
		// String[] result = address.split("(-|:|;| )");
		String[] result = address.split("\\.");

		System.out.println(result.length);

		for (int i = 0; i < result.length; i++) {
			System.out.println(i+1+"번째 인덱스" + result[i]);
		}
		System.out.println("====================");
		// 배열 적용 반복문2 (List Set Map)
		for (String s : result) {
			System.out.println(s);

		}

	}

}
