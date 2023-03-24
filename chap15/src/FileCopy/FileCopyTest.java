package FileCopy;

// import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

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
			fw = new FileWriter(args[1]);
			/*
			 * int linenumber = 1; fw.write(linenumber + " : "); while (true) { int i =
			 * fr.read(); // 1문자를 2바이트 단위 if (i == -1) break; else if (i == '\n') { String
			 * result = ++linenumber + " : "; fw.write(result); } else { fw.write(i); } }
			 * 
			 * }
			 */
			int linenumber = 1;
			Scanner sc = new Scanner(fr);
			while (true) {
				String result = sc.nextLine(); // \n 1줄로 인식하고 이전 입력 저장
				if (sc.hasNextLine() == false)
					break;
				fw.write(linenumber++ + " : " +  result + "\n");

			} // while end
		} // try end

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
