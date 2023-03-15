package test;

public class PrimeNumberTest {

	public static void main(String[] args) {
		int i = 78; 
		for(int k = 2; k <= i; k++) {
			int cntOfZero = 0;
			for(int j = 1; j <= k; j++ ) {
				if(k % j == 0) cntOfZero++;
			}
			
			if(cntOfZero == 2) {
				System.out.println(k + " : 소수이다");
			}
			else {
				System.out.println(k + " : 소수가 아니다");
			}
		}

	}

}

/*  2 ~ 78 사이 모든 수에 대하여 판단
 * 2 : 소수이다
 * 3 : 소수이다
 * ....
 * 78 : 소수 아니다
 * 
 * */


