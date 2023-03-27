package Server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class TCPServerTest {

	public static void main(String[] args) throws IOException {
		// port - 0 - 65535번 - 2^16
		// 5000번 이내 지양
		// 10000번 이상
		ServerSocket ss = new ServerSocket(10000);
		System.out.println("[서버]가 10000번 포트에서 대기중입니다.");

		while (true) {
			Socket s = ss.accept();
			String clientip = s.getInetAddress().getHostAddress();
			System.out.println("[서버] " + clientip + "클라이언트와 연결되었습니다.");

			InputStream request = s.getInputStream();
			Scanner sc = new Scanner(request);
			String name = sc.next();
			// System.out.println("[서버]" + request_str + " 를 전달 받았습니다.");
			String age = sc.next();
			// System.out.println("[서버]" + request_str2 + " 를 전달 받았습니다.");
			String title = sc.next();
			// System.out.println("[서버]" + request_str3 + " 를 전달 받았습니다.");

			HashMap<String, Integer> titlemap = new HashMap<String, Integer>();
			titlemap.put("자바", 25);
			titlemap.put("html", 25);
			titlemap.put("리액트", 30);
			titlemap.put("스프링부트", 35);
			titlemap.put("mysql", 40);

			Set<String> titles = titlemap.keySet();
			String response = "";
			boolean isTitle = false;
			for (String t : titles) {
				if (t.equals(title)) {
					Integer a = titlemap.get(t);
					if (a == Integer.parseInt(age)) {
						response = name + " 님은 " + title + " 과정 수강 가능합니다.\n";
					}
				} else {
					response = name + " 님은 " + title + " 과정 수강 불가능합니다.\n";
				}
				isTitle = true;
				break;
			}
			if (isTitle == false) {
				response = name + "님은 수강신청 불가능합니다.\n";
			}

			// title이 목록에 있고 해당 나이가 같으면 "홍길동님은 자바 과정 수강 가능합니다."
			// title이 목록에 있고 해당 나이가 같지 않으면 "홍길동님은 자바 과정 수강 불가능합니다."
			// title이 목록에 없으면 "홍길동님은 수강신청 불가능합니다."

			OutputStream os = s.getOutputStream();
			// 1 바이트단위 "안녕하세요" // String - 2바이트 1문자를 여러개 --> byte[]
			// String response = "저도 안녕하세요\n";
			byte[] response_byte = response.getBytes();
			os.write(response_byte);

			s.close();
			System.out.println("[서버]가 클라이언트와 연결 해제되었습니다.");

		} // while end
	}
}
