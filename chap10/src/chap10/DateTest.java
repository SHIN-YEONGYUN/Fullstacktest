package chap10;

import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		// jdk 1.0 날짜 시간 표현클래스 Date -> xxxx
		Date now = new Date(); // 현재 시스템 날짜 시각
		System.out.println(now);
		
		Date userdate = new Date(999999999999L); // 1970년 1월 1일 자정 ~ 1/1000초 단위
		System.out.println(userdate);

	}

}
