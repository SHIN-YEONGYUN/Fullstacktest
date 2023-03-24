package test2;
/*
class MusicThread implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 3; i++) {
			System.out.print("음악듣는중입니다.");
		}
	}

}

class DownloadThread implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.print("다운로드중입니다.");
		}
	}

}

class NewsThread implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.print("뉴스보는중입니다.");
		}
	}

} */

public class ThreadTest2 {

	public static void main(String[] args) {
		Thread arr[] = new Thread[3];
		// arr[0] = new Thread(new MusicThread());
		// arr[1] = new Thread(new DownloadThread());
		// arr[2] = new Thread(new NewsThread());

		Runnable musicthread = () -> {
			for (int i = 1; i <= 3; i++) {
				System.out.println("람다 - 음악듣는중입니다.");
			}
		};
		Runnable downloadthread = () -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println("람다 - 다운로드중입니다.");
			}
		};
		Runnable newsthread = () -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println("람다 - 뉴스보는중입니다.");
			}
		};
		new Thread(downloadthread).start();
		new Thread(newsthread).start();
		new Thread(musicthread).start();
	}
}
