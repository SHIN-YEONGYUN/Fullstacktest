package chap5;

import java.util.Arrays;

public class ArrayTest3 {

	public static void main(String[] args) {
		// 자바 배열 - 1.sample 스택 -> 배열내용 힙
		// 2. 길이 수정 불가
		int sample[] = new int[5];
		for (int i = 0; i < sample.length; i++) {
			sample[i] = (int) (Math.random() * 100) + 1;
		}

		int sample2[] = new int[10];
		System.arraycopy(sample, 0, sample2, 0, sample.length);
		// 배열값 출력 1 
		for (int i = 0; i < sample2.length; i++) {
			System.out.print(sample2[i] + " ");
		}
		System.out.println();
		// 배열값 출력 2
		Arrays.toString(sample2);
		System.out.println(Arrays.toString(sample2));

	}

}
