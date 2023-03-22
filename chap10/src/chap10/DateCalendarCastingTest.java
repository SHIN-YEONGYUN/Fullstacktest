package chap10;

import java.util.Calendar;
import java.util.Date;

public class DateCalendarCastingTest {

	public static void main(String[] args) {
		// 기본형변수끼리-() , 객체들끼리(상속)-()
		//Calendar -> Date
		Calendar now = Calendar.getInstance();
		Date now2 = now.getTime();
		System.out.println("타입 = " + now2.getClass().getName());
		
		//Date -> Calendar
		
		Date now3 = new Date();
		now.setTime(now3);
		System.out.println("타입 = " + now.getClass().getName());

	}

}
