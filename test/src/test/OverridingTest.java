package test;

public class OverridingTest {

	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		MySum ms1 = new MySum(i, j);
		MySum ms2 = new MySum(j, i);
		System.out.println(ms1);
		System.out.println(ms2);
		if (ms1.equals(ms2)) {
			System.out.println("ms1과 ms2의 합계는 동일합니다.");
		}

	}
}

class MySum {
	// toString 패키지명,클래스명@16진수 주소
	int first, second;

	MySum(int first, int second) {
		this.first = first;
		this.second = second;
	}

	public String toString() {
		return String.valueOf(first + second);
	}
	// if (ms1.equals(ms)
	public boolean equals(Object o) { 
		// 자동형변환, 이후 o.(Object)변수명 
		// 자동형변환, 이후 o.(Object)메소드명  
		// 자동형변환, 이후 o.(MySum클래스)오버라이딩메소드명 
		if(o instanceof MySum) {
			return this.toString().equals(o.toString());
		}
		else {
			return false;
		}
	}
}

/*
 * 30 30 합계 동일합니다.
 */
