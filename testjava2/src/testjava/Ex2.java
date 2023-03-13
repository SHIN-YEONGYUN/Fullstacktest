package testjava;

public class Ex2 {

	public static void main(String[] args) {
		System.out.println("책권수가 학생 수보다 많다면");

		int cntOfBooks = 97;
		int cntOfStu = 12;
		int x = cntOfBooks / cntOfStu;
		int y = cntOfBooks % cntOfStu;
		String result = cntOfBooks > cntOfStu ? "1명의 학생당 " + x + "권씩 가질 수 있습니다." + "남아있는 책은 " + y + "권입니다."
				: "나눠줄 수 없습니다.";
		System.out.println(result);

		int cntOfBooks1 = 97;
		int cntOfStu1 = 12;
		int x1 = cntOfBooks1 / cntOfStu1;
		int y1 = cntOfBooks1 % cntOfStu1;
		String result1 = cntOfBooks < cntOfStu ? "1명의 학생당 " + x1 + "권씩 가질 수 있습니다." + "남아있는 책은 " + y1 + "권입니다."
				: "나눠줄 수 없습니다.";
		System.out.println(result1);

	}

}
