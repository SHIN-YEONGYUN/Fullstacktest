package test;

import test.DownloadThread;
import test.MusicThread;
import test.NewsThread;
import test.Runnable;

@FunctionalInterface
interface Runnable {
	void run();
};

class MusicThread implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 3; i++) {
			System.out.print("음악듣는 중입니다.");
		}
	}

}

class DownloadThread implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.print("다운로드 중입니다.");
		}
	}

}

class NewsThread implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.print("뉴스보는 중입니다.");
		}
	}

}

public class ThreadTest {

	public static void main(String[] args) {

		Thread arr[] = new Thread[3];
		// arr[0] = new Thread(new MusicThread());
		// arr[1] = new Thread(new DownloadThread());
		// arr[2] = new Thread(new NewsThread());

		MusicThread music = new MusicThread();
		DownloadThread down = new DownloadThread();
		NewsThread news = new NewsThread();
		music.run();
		System.out.println();
		down.run();
		System.out.println();
		news.run();
	}

}
