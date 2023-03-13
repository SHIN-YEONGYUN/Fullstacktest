package testjava;

public class Ex4 {

	public static void main(String[] args) {
		System.out.println("시간");

		int time = 10000;

		int hour = time / (60 * 60);
		int minute = time / 60 - (hour * 60);
		int second = time % 60;
		System.out.println(time + "초는 " + hour + "시간, " + minute + "분, " + second + "초입니다.");

	}

}
