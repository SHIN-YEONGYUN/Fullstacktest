package chap15;

import java.io.IOException;
import java.util.Scanner;

public class MenuTest {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		Member member = new Member();
		/*
		 * 회원관리 프로그램입니다. 사용 가능 메뉴 1. 회원가입 2. 로그인 3. 로그아웃 4. 내 정보보기 5. 내 정보수정 6. 종료 번호 입력
		 * : 1
		 */
		while (true) {
			System.out.println("회원관리 프로그램입니다. 사용 가능 메뉴는 다음과 같습니다.");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 로그아웃");
			System.out.println("4. 내 정보보기");
			System.out.println("5. 내 정보수정");
			System.out.println("6. 종료");
			System.out.print("번호 입력 : ");
			/*
			 * int menunumber = System.in.read(); // '1' -> 49 if (menunumber == 54) {
			 * return; } else if (menunumber == 49) { System.out.println("회원가입 메뉴 선택"); }
			 */

			int membernum = sc.nextInt();
			switch (membernum) {
			case 6:
				return;
			case 1:
				member.insert("test", 1234, "이자바", 25);
				break;
			case 2:
				member.login("test", 1234);
				break;
			case 3:
				member.logout();
				break;
			case 4:
				System.out.println(member.getMyInfo());
				break;
			case 5:
				member.setPassword(1111);
				break;
			}
		}
	}
}
