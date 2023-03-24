package FileCopy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedInTest {

	public static void main(String[] args) throws IOException {
		long starttime = 0, endtime = 0;
		// BufferdReader, Scanner - 1줄 라인 입력
		FileReader fr = new FileReader("/Users/shin-yeongyun/Desktop/day6.pdf");
		// 현재 시간 1/1000초
		starttime = System.currentTimeMillis();

		while (true) {
			int i = fr.read();
			if (i == -1)
				break;
		}
		// 현재 시간 1/1000초
		endtime = System.currentTimeMillis();
		System.out.println("버퍼 미사용시 소요시간 = " + (endtime - starttime) + "ms단위");
		fr.close();

		fr = new FileReader("/Users/shin-yeongyun/Desktop/day6.pdf");
		BufferedReader br = new BufferedReader(fr);
		// 현재 시간 1/1000초
		starttime = System.currentTimeMillis();

		while (true) {
			int i = br.read();
			if (i == -1)
				break;
		}
		// 현재 시간 1/1000초
		endtime = System.currentTimeMillis();
		System.out.println("버퍼 사용시 소요시간 = " + (endtime - starttime) + "ms단위");

	}

}
