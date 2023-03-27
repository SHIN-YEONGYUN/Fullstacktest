package Client;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TCPClientTest {

	public static void main(String[] args) throws Exception {

		Socket s = new Socket("localhost", 10000);
		String serverip = s.getInetAddress().getHostAddress();
		System.out.println("(클라이언트)" + serverip + "서버로 접속 완료했습니다.");

		Scanner input = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		String name = input.next()+" ";
		System.out.print("나이 입력 : ");
		String age = input.next()+" ";
		System.out.print("과정명 입력 : ");
		String title = input.next()+" ";

		// 클라이언트가 서버로 출력 3번
		// 키보드로 이름 입력 : xxx
		// 나이 입력 : xxx
		// 과정명 입력 : xxx

		OutputStream os = s.getOutputStream(); // 1 바이트단위 "안녕하세요"
		// String - 2바이트 1문자를 여러개 --> byte[]
		// String request = "안녕하세요\n";
		// byte[] request_byte = request.getBytes();
		os.write(name.getBytes());
		os.write(age.getBytes());
		os.write(title.getBytes());

		InputStream is = s.getInputStream();
		Scanner sc = new Scanner(is);
		String request_str = sc.nextLine();
		System.out.println("(클라이언트)" + request_str + " 를 전달 받았습니다.");

		s.close();
		System.out.println("(클라이언트) 서버로 접속 해제했습니다.");
	}

}
