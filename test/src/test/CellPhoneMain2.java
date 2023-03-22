package test;

class CellPhone1 {
	String model; // 핸드폰 모델 번호
	double battery; // 남은 배터리 양

	public CellPhone1(String model) { // 모델 번호를 인자로 받는 생성자
		this.model = model;
	} // 생성자 End

	void call(int time) {
		if (time < 0) {
			throw new IllegalArgumentException("통화시간 입력오류");
		}
		battery -= time * 0.5;
		if (battery < 0) {
			battery = 0;
		}
		System.out.println("통화 시간 : " + time + "분");

	}

	void charge(int time) {
		if (time < 0) {
			throw new IllegalArgumentException("충전시간 입력오류");
		}
		battery += time * 3;
		if (battery > 100) {
			battery = 100;
		}
		System.out.println("충전 시간 : " + time + "분");
	}

	void printBattery() {
		System.out.println("남은 배터리 양 : " + battery);

	}

	public boolean isSame(CellPhone1 other) {
		return model.equalsIgnoreCase(other.model);
	}
}

public class CellPhoneMain2 {

	public static void main(String[] args) {
		CellPhone1 myPhone = new CellPhone1("GALAXY-7");

		try {

			myPhone.charge(20);
			myPhone.printBattery();
			myPhone.call(300);
			myPhone.printBattery();
			myPhone.charge(50);
			myPhone.printBattery();
			myPhone.call(40);
			myPhone.printBattery();
			myPhone.call(-20);
		} catch (IllegalArgumentException e) {
			// throw new IllegalArgumentException("통화시간 입력 오류");
			System.out.println(e.getMessage());
		}

		CellPhone1 yourPhone = new CellPhone1("galaxy-7");

		if (myPhone.isSame(yourPhone)) {
			System.out.println("동일 모델입니다.");
		} else
			System.out.println("다른 모델입니다.");
	}
}
