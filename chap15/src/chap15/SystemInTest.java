package chap15;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest {

	public static void main(String[] args) {
		System.out.println("키보드 입력 대기중입니다.");
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			while (true) { // os ctrl_z
			//	int i = System.in.read(); // 키보드 입력 1개 값 읽어오기. 1byte
				int i = isr.read(); // 2byte
				if (i == 'x')
					break;
				System.out.println((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace(); //
		}

	}

}
