package chap16;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLTest {

	public static void main(String[] args) throws MalformedURLException, IOException {
		URL url = new URL("https://www.daum.net");
		FileWriter fw = new FileWriter("daum.txt");
		// 페이지 소스 입력 받아서 내 컴퓨터 daum.txt 파일로 저장
		InputStream daum = url.openStream();
		InputStreamReader isr = new InputStreamReader(daum);
		BufferedReader br = new BufferedReader(isr);
		while (true) {
			String line = br.readLine();
			if (line == null)
				break;
			fw.write(line + "\n"); // 자바 임시메모리 저장
		}
		br.close();
		fw.close(); // 파일로 이동
	}

}
