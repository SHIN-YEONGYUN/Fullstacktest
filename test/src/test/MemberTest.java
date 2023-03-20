package test;

class Member {
	String userid;
	int pw;
	String name;
	int age;

	void insert(String userid, int pw, String name, int age) {
		this.userid = userid;
		this.pw = pw;
		this.name = name + " 회원님";
		this.age = age;
		System.out.println("----------------------");
		System.out.printf("아이디 : %s\n 이름 : %s\n 나이 : %d\n 가입 완료되었습니다.\n", userid, name, age);
		System.out.println("----------------------");
	}

	void login(String userid, int pw) {
		System.out.println("----------------------");
		if (this.userid.equals(userid) && this.pw == pw) {
			System.out.println("로그인되었습니다.");
		} else {
			System.out.println("로그인 정보를 확인하세요.");
		}
		System.out.println("----------------------");
	}

	void setPassword(int pw) {
		this.pw = pw;
		System.out.printf("----------------------\n암호를 변경하셨습니다.\n----------------------\n");
	}

	String getMyInfo() {
		String result = "----------------------\n" + "아이디 : " + /* this. */userid + " 회원님 정보는 다음과 같습니다.\n" + "암호 : "
				+ pw + "\n" + "이름 : " + name + "\n" + "나이 : " + age + "\n" + "----------------------\n";
		return result;
	}

	String logout() {
		System.out.printf("----------------------\n로그아웃되었습니다.\n----------------------\n");
		userid = null;
		pw = -1;
		name = null;
		age = -1;
		return userid;
	}
	// end
	// end
}

public class MemberTest {

	public static void main(String[] args) {
		Member mem = new Member();
		mem.insert("test", 1234, "이자바", 25);
		mem.login("test", 4321);
		mem.login("test", 1234);
		mem.setPassword(1111);
		String myinfo = mem.getMyInfo();
		System.out.println(myinfo);

		String id = mem.logout();
		if (id == null) {
			System.out.println("다시 로그인하셔야 합니다.");
		}

	}
}
