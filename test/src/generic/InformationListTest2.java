package generic;

import java.util.ArrayList;

class Information1 {
	String id;
	String name;

	public Information1(String id, String name) {
		this.id = id;
		this.name = name;
	}

	String print() {
		return id + ":" + name;
	}
}

class Product1 extends Information1 {
	int price;

	public Product1(String id, String name, int price) {
		super(id, name);
		this.price = price;
	}

	@Override
	String print() {
		return super.print() + " : " + price;
	}

}

class Board1 extends Information1 {
	String contents;
	int viewcount;

	public Board1(String id, String name, String contents, int viewcount) {
		super(id, name);
		this.contents = contents;
		this.viewcount = viewcount;
	}

	@Override
	String print() {
		return super.print() + " : " + contents + " : " + viewcount;
	}

}

class Member1 extends Information1 {
	String email;
	String phone;

	public Member1(String id, String name, String email, String phone) {
		super(id, name);
		this.email = email;
		this.phone = phone;
	}

	@Override
	String print() {
		return super.print() + " : " + email + " : " + phone;
	}

}

public class InformationListTest2 {

	public static void main(String[] args) {
		ArrayList<Information1> list = new ArrayList<Information1>(5);

		list.add(new Board1("1", "게시물1", "현재 조회수 10입니다", 10));
		list.add(new Product1("100", "멀티컴퓨터", 300000));
		list.add(new Member1("hong", "홍길동", "hong@a.com", "010-222-2222"));
		list.add(new Board1("2", "게시물2", "새로운 게시물 추가합니다", 0));
		list.add(new Product1("200", "벤처정수기", 1000000));
		// 명령행 매개변수 5 이면 5개 저장. 예외발생 - 중단
		list.add(new Member1("lee", "이철수", "chul@b.com", "010-333-3333"));

		/* for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).print());

		}*/
		for (Information1 i : list) {
			System.out.println(i.print());
		}

	}
}
