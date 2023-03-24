package chap15;

// import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*명령행 매개변수
 * 1. a.txt b.txt --> 예외발생
 * 2. src/chap15/FileCopyTest.java b.txt -->  새로 생성
 * 3. src/chap15/FileCopyTest.java b.txt --> 이전 저장 내용 삭제
 * 4. (소스수정 - true) src/chap15/ScannerTest.java b.txt --> 이전 저장 내용 유지 후 추가
 * */

public class FileCopyTest {

	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader(args[0]);
			fw = new FileWriter(args[1], true);
			while (true) {
				int i = fr.read(); // 1문자를 2바이트 단위
				if (i == -1)
					break;
				fw.write(i+" "); //100
			}

		}
		// catch(FileNotFoundException e) {}
		catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
				fr.close();
			} catch (IOException e) {
			}

		}

	}

}
