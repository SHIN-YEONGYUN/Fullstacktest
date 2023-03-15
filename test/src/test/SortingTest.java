package test;

import java.util.Arrays;

class Student {
	String name;
	int score;
}

public class SortingTest {

	public static void main(String[] args) {
		Student[] stu = new Student[args.length];
		System.out.println("입력된 학생의 이름수 = " + args.length);
		System.out.println(Arrays.toString(args));

		int score[] = new int[args.length]; // 선언 생성 (자동초기화 - 정수 = 0)
		// 배열 여러 요소 - 길이 한정
		for (int i = 0; i < args.length; i++) {
			score[i] = (int) (Math.random() * 100) + 1;
		}
		for (int i = 0; i < score.length; i++) {
			for (int j = i; j < score.length; j++) {
				if (score[i] < score[j]) {
					int temp = score[i];
					score[i] = score[j];
					score[j] = temp;
				}
			}
		}
		for (int i = 0; i < score.length; i++) {
			System.out.printf("학생 이름: %s 점수: %d %d등\n", args[i], score[i], i + 1);
		}
		System.out.println();
	}

	// 명령행매개변수 5개 입력 - 5명 Student 객체 생성하여 학생이름 name 저장
	// score 1-100 난수 5개 생성하여 저장
	// 5명 Student 객체들을 stu 배열에 저장

	// Student 객체들 score 를 내림차순 정렬 출력
	// 학생이름 : 점수 : 1등
	// .......

}