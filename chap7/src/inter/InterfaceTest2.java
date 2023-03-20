package inter;

// 1 -> 추상클래스 - 1개 클래스 단일 상속
// 2 -> 인터페이스 - 다중 상속.
// 3 -> Speaker, Tv, Radio 3개 서로 다른 객체들 --> Volume 타입 통일 
// 4 -> 폐쇄(수정금지) - 개방의(수정 가능) 법칙
interface Volume {
	void volUp(int level); // 볼륨 조정 가능 장치 - 증가

	void volDown(int level); // 볼륨 조정 가능 장치 - 감소
}

class Speaker implements Volume {
	int VolLevel;

	@Override
	public void volUp(int level) {
		VolLevel += level;
		if (VolLevel > 100) {
			VolLevel = 100;
		}
		System.out.println("현재 스피커 볼륨 = " + VolLevel);

	}

	@Override
	public void volDown(int level) {
		VolLevel -= level;
		if (VolLevel < -100) {
			VolLevel = -100;
		}
		System.out.println("현재 스피커 볼륨 = " + VolLevel);
	}

}

class Radio implements Volume {
	int VolLevel;

	@Override
	public void volUp(int level) {
		VolLevel += level;
		System.out.println("현재 라디오 볼륨 = " + VolLevel);

	}

	@Override
	public void volDown(int level) {
		VolLevel -= level;
		System.out.println("현재 라디오 볼륨 = " + VolLevel);
	}

}

class Tv implements Volume {
	int VolLevel;

	@Override
	public void volUp(int level) {
		VolLevel += level;
		System.out.println("현재 Tv 볼륨 = " + VolLevel);

	}

	@Override
	public void volDown(int level) {
		VolLevel -= level;
		if (VolLevel < 0) {
			VolLevel = 0;
		}
		System.out.println("현재 Tv 볼륨 = " + VolLevel);
	}

}

public class InterfaceTest2 {

	public static void main(String[] args) {
		Volume[] v = new Volume[3];
		v[0] = new Speaker();
		v[1] = new Radio();
		v[2] = new Tv();
		for (int i = 0; i < v.length; i++) {
			v[i].volUp(100);
			v[i].volDown(250);
			v[i].volUp(50);
			v[i].volDown(50);

		}

	}

}
