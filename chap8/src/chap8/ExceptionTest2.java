package chap8;

public class ExceptionTest2 {

	public static void main(String[] args) {
		// 최소 2개 이상 입력 변수 필요, 정수 변경 가능값, 0 아닌 값
		// int j = 0;
		try {
			int i = Integer.parseInt(args[0]);
			int j = Integer.parseInt(args[1]);

			System.out.println(i / j);
			System.out.println(i % j);
		} catch (ArithmeticException e) { // catch 되면 대신 수행할 코드 작성
			// j = 100;
			System.out.println("0은 입력할 수 없습니다.");
			// e.printStackTrace(); // 예외 발생 정보 찾아서 출력
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("2개 이상의 값을 입력하세요.");
		} catch (NumberFormatException e) {
			System.out.println("숫자만 입력 가능합니다.");
		}
		System.out.println("메인 종료");
	}

}
