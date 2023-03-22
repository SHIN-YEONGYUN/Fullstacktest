package chap10;

import java.util.Calendar;

public class CalendarTest2 {

	public static void main(String[] args) {

		Calendar now = Calendar.getInstance(); // 현재 시간
		Calendar end = Calendar.getInstance(); // 현재 시간을 2023.8.24 D-Day 계산
		end.set(2023, 7, 24);

		// 과정 종료일까지 xxx일 남았습니다.
		long nowmil = now.getTimeInMillis(); // 1/1000초 단위
		long endmil = end.getTimeInMillis();
		System.out.println(Math.abs(nowmil - endmil) + "(1/1000초)단위"); //
		System.out.println(Math.abs(nowmil - endmil) / 1000 + "초 단위");
		System.out.println(Math.abs(nowmil - endmil) / (1000 * 60) + "분 단위");
		System.out.println(Math.abs(nowmil - endmil) / (1000 * 60 * 60) + "시간 단위");
		System.out.println(Math.abs(nowmil - endmil) / (1000 * 60 * 60 * 24) + "일 단위");//
	}

}
