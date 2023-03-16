package test;

import java.util.Arrays;

class Students {
	String name;
	int score;
}

public class SortingTest2 {

	public static void main(String[] args) {
		Students[] stu = new Students[args.length];

		for (int i = 0; i < args.length; i++) {
			stu[i] = new Students(); // Student 객체 생성 + stu 배열에 저장
			stu[i].name = args[i]; // 학생이름 name 저장
			stu[i].score = (int) (Math.random() * 100) + 1; // score 1-100 난수 5개 생성하여 저장
		}

		for (int i = 0; i < args.length; i++) {
			System.out.println(stu[i].name + "학생의 점수 = " + stu[i].score);
		}

		for (int i = 0; i < stu.length; i++) {
			for (int j = i + 1; j < stu.length; j++) {
				if (stu[i].score < stu[j].score) {
					Students temp = stu[i];
					stu[i] = stu[j];
					stu[j] = temp;
				}
				// System.out.println("i=" + i + "," + "j=" + j + "sample[i]=" + sample[i] +
				// "sample[j]=" + sample[j]);
			}
		}
		for (int i = 0; i < stu.length; i++) {
			System.out.println("학생 이름 : " + stu[i].name + "학생 점수 : " + stu[i].score + "\t" + (i + 1) + "등");
		}
	}

}
