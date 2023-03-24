package chap15;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterTest {

	public static void main(String[] args) {
		System.out.println("학생 정보를 입력하세요(이름 국어 영어 수학 순서로 입력하세요)");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int mat = sc.nextInt();
		int sum = kor + eng + mat;
		double avg = sum / 3.0;
		System.out.println(sum);
		try {
		FileWriter fw = new FileWriter("src/chap15/score.txt", true);
		// 1. 파일 없으면 새로 생성
		// 2. 있으면 저장내용 삭제 이후 저장
		// 3. 있으면 저장내용 유지 이후 추가 저장
		
		/*fw.write(name + " "); // String
		fw.write(String.valueOf(kor)+ " "); //int (unicode 문자)
		fw.write(String.valueOf(mat)+ " ");
		fw.write(String.valueOf(eng)+ "\n"); */
		
		fw.write(name + " " + kor + " " + eng + " " + mat + " " + sum + " " + avg + "\n");
		fw.close();
		}catch(IOException e) {
			System.out.println("출력 도중 예외발생");
		}
		sc.close();
	}

}
