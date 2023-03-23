package chap13;

class JoinThread extends Thread {
	int i = 1;

	public void run() {
		i = 10;
		System.out.println("run 메소드 내부 = " + i);
	}
}

public class JoinTest {

	public static void main(String[] args) { // main 스레드 객체취급
		JoinThread j = new JoinThread(); // j: 생성상태, main: 실행상태
		j.start(); // j: 실행 가능 상태, main: 실행 상태
		try {

			j.join(); // 1. j:실행 상태, main: 일시중단상태
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main 메소드 내부 = " + j.i); // main : 실행 상태
		System.out.println("main 메소드 종료"); // main : 실행 상태
		// j: 실행 상태 main: 종료 상태
	}

}
