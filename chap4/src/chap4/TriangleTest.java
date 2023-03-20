package chap4;

public class TriangleTest {

	public static void main(String[] args) {
		int lines = 5;
		// *******
		// 
		char star = '*';
		for(int i = 1; i <= lines; i++) {//라인수. 각 라인번호변수=i
			// for() { 공백출력}
			
			for(int j = 1; j <= i; j++) {  //1개라인 * 반복
				System.out.print(star);
			}
			System.out.println();
		}
		
	}

}
/*
    *
   ***
  *****  
 *******
*********  

*/
