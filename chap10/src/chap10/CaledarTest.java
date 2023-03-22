package chap10;

import java.util.Calendar;

public class CaledarTest {

	public static void main(String[] args) {
		// abstract class -> 상속 ( 객체 생성 불가능)
		// 지역별 날짜시간 다르고 포맷도 다름 - 현재 컴퓨터 지역 상속 하위클래스 객체 생성(자동)
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		// 년도 월 일 시 분 초 요일
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		System.out.printf("오늘은 %d년도 %d월 %d일 %d시 %d분 %d초입니다. \n"
				, year, month, day, hour, minute, second);
		
		String[] weekdays = {"","일","월","화","수","목","금","토"};
		System.out.println(cal.get(Calendar.DAY_OF_WEEK) + " : " + weekdays[cal.get(Calendar.DAY_OF_WEEK)]);
		// 1 - 일 2 - 월 3 - 화 4 - 수요일 5 - 목 6 - 금 7 - 토 
		
		
		//cal.set(Calendar.DAY_OF_YEAR, day-1);
		

	}

}
