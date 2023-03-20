package chap4;

public class MonthTest {

	public static void main(String[] args) {

		
		int month =  (int)(Math.random() * 12) + 1;// 1월 ~ 12월
		// 1,3,5,7,8,10,12 월은 31일까지 있습니다.
		// 4, 6, 9, 11  월 30일
		// 2 월 28일
		
		int day = 0;
		
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			day = 30;
			break;
		default : //2
			day = 28;
		}
		System.out.println(month + " 월은 " + day + " 일까지 있습니다. ");

		
		/*String title="spring";
		switch(title) {
		case "java":
			//
			break;
		case "spring":
			//
			break;
		}*/
	}

}



