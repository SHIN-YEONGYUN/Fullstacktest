package chap5;

public class ArrayTest2 {

	public static void main(String[] args) {
		// 학생이름 6명 데이터 배열
		String[] names = { "홍길동", "박한국", "김대한", "최강산", "김우리", "이자바" };
		// 정수타입 국어 영어 수학 총점 평점
		int score[][] = new int[5][names.length];
		for (int i = 0; i < score.length - 2; i++) { // 3번
			for (int j = 0; j < score[i].length; j++) { // 6번
				score[i][j] = (int) (Math.random() * 100) + 1;
				// System.out.print(score[i][j] + "\t");
			}
			// System.out.println();
		}
		// 총점 평균 배열 저장
		int sums[] = new int[names.length];
		int avgs[] = new int[names.length];
		for (int i = 0; i < score.length - 2; i++) { // 3번
			for (int j = 0; j < score[i].length; j++) { // 6번
				sums[j] += score[i][j];
				avgs[j] = sums[j] / 3;
				// sums[j] = sums[j] + score[i][j];
			}
		}
		score[3] = sums;
		score[4] = avgs;
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " \t");
		}
		System.out.println();
		for (int i = 0; i < score.length; i++) { // 3번
			for (int j = 0; j < score[i].length; j++) { // 6번
				System.out.print(score[i][j] + "\t");
			}
			System.out.println();
		}

		/*
		 * for(int i = 0; i < sums.length; i++) { System.out.print(sums[i] + "\t"); }
		 * System.out.println(); for(int i = 0; i < sums.length; i++) {
		 * System.out.print(avgs[i] + "\t"); } System.out.println();
		 */
		int sample[][] = new int[5][0];
		sample[0] = new int[3];
		sample[1] = new int[2];
	}
}
