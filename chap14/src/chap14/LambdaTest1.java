package chap14;

public class LambdaTest1 {

	public static void main(String[] args) {
		// test1 내부클래스
		class MyThread implements Runnable {
			public void run() {
				System.out.println("Runnable 내부 클래스로 구현");
			}
		}
		MyThread mt = new MyThread();
		new Thread(mt).start();

		// test2 내부 무명클래스
		Runnable mt2 = new Runnable() {
			public void run() {
				System.out.println("Runnable 무명 클래스로 구현");
			}// run
		};// 무명 end
		new Thread(mt2).start();

		// test3 람다식 (메소드 1개 가진 인터페이스 상속받아 구현)
		Runnable mt3 = () -> {
			System.out.println("Runnable 람다식으로 구현");
		};// run

		new Thread(mt3).start();
	}

}
