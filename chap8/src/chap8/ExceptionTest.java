package chap8;

public class ExceptionTest {

	public static void main(String[] args) {
		// 최소 2개 이상 입력 변수 필요, 정수 변경 가능값, 0 아닌 값
		// int j = 0;
		try {
			int i = Integer.parseInt(args[0]);
			int j = Integer.parseInt(args[1]);
			System.out.println(i / j); // 0 입력 시 중단
			// 자동실행 new ArithmeticException()
			// catch 이동
			
			System.out.println(i % j);
		} catch (Exception e) { // catch 되면 대신 수행할 코드 작성
			// j = 100;
			System.out.println("모든 종류의 예외를 처리합니다.");
			// e.printStackTrace(); // 예외 발생 정보 찾아서 출력
			/*
			 * } catch (ArrayIndexOutOfBoundsException e) {
			 * System.out.println("2개 이상의 값을 입력하세요."); } catch (NumberFormatException e) {
			 * System.out.println("숫자만 입력 가능합니다."); }
			 */
			System.out.println("메인 종료");
		}

	}
}
