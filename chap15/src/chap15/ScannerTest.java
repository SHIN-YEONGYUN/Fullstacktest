package chap15;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// java,util.Scanner - java.io 클래스들 변환 -
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 2개를 입력하면 덧셈 결과를 보여드립니다.");
		int first = sc.nextInt(); // 100 200
		int second = sc.nextInt();
		System.out.println(first + second);
		System.out.println("한글 문자열을 입력하세요.");
		sc.nextLine();
		String third = sc.nextLine();
		System.out.println(third);
	}

}
