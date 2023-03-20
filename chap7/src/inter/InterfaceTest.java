package inter;

class StudentWorker implements Worker, Student {
	// title = 교직원, 학생
	String title = "조교";

	public void work() {

		System.out.println("오후에는 " + Worker.title + "으로서 일한다");
	}

	@Override
	public void study() {
		System.out.println("오전에는 " + Student.title + "으로서 공부하다");

	}

	@Override
	public void lunch() {
		System.out.println("점심을 먹는다");

	}

	void team() {
		System.out.println(title + "들이 단합대회");
	}

}

public class InterfaceTest {

	public static void main(String[] args) {
		StudentWorker sw = new StudentWorker();
		sw.study();
		sw.lunch();
		sw.work();
		sw.team();
		System.out.println("---------");
		Worker sw2 = new StudentWorker();
		// sw.study();
		sw2.lunch();
		sw2.work();
		// sw.team();
		System.out.println("---------");
		Student sw1 = new StudentWorker();
		sw1.study();
		sw1.lunch();
		// sw.work();
		// sw.team();

	}

}
