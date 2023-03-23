package generic;

import java.util.ArrayList;

class Information {
	String id;
	String name;

	Information() {

	}

	public Information(String id, String name) {
		this.id = id;
		this.name = name;
	}

	String print() {
		return id + ":" + name;
	}
}

class Product extends Information {
	int price;

	Product(String id, String name, int price) {
		this.price = price;
		super.id = id;
		super.name = name;
	}

	@Override
	String print() {
		return id + " : " + name + " : " + price;
	}

}

class Board extends Information {
	String contents;
	int viewcount;

	public Board(String id, String name, String contents, int viewcount) {
		super.id = id;
		super.name = name;
		this.contents = contents;
		this.viewcount = viewcount;
	}

	@Override
	String print() {
		return "게시물 번호 : " + id + " 게시물명 : " + name + " 게시물 내용 : " + contents + " 현재 조회수 " + viewcount + "입니다.";
	}

}

class Member extends Information {
	String email;
	String phone;

	public Member(String id, String name, String email, String phone) {
		super.id = id;
		super.name = name;
		this.email = email;
		this.phone = phone;
	}

	@Override
	String print() {
		return "회원 아이디 : " + id + " 회원 이름 : " + name + " 이메일 : " + email + " 전화번호 : " + phone;
	}

}

public class InformationListTest {

	public static void main(String[] args) {
		ArrayList<Information> list = new ArrayList<Information>();

		list.add(new Board("1", "게시물1", "현재 조회수 10입니다", 10));
		list.add(new Product("100", "멀티컴퓨터", 300000));
		list.add(new Member("hong", "홍길동", "hong@a.com", "010-222-2222"));
		list.add(new Board("2", "게시물2", "새로운 게시물 추가합니다", 0));
		list.add(new Product("200", "벤처정수기", 1000000));
		list.add(new Member("lee", "이철수", "chul@b.com", "010-333-3333"));

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).print());

		}

	}
}
