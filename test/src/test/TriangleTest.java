package test;

public class TriangleTest {

	public static void main(String[] args) {
		int lines = 5;
		for(int i = 1; i<= lines; i++) {
			//공백
			for(int space = lines; space > i; space--) {
				System.out.print(' ');
			}
			for(int star = 1; star < 2*i; star++) {
				System.out.print('*');
			}
			//*
			System.out.println(); //줄바꿈 /개행처리 . 'a' '\n'
			// System.out.print('\n');
		}
		/*
		 5줄 출력
		 각줄 -
		 공백 -->1-4개  2-3개  3-2개  4-1개 5-0개    
		 * --> 1-1개   2-3개  3-5개.. --> (라인번호*2)-1 
		 
		 
		 * 
		*** 
	   *****
	  *******
	 *********
	
		 * */

	}

}