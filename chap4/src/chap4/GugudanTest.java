package chap4;

public class GugudanTest {

	public static void main(String[] args) {
		
		//2*1=4  3*1=6   4*1=8 .....  9*1=18
				
		//2단만 
		for(int i = 1; i <= 9; i++ ) {
			for(int dan = 2; dan <= 9; dan++) {
				if(dan == 6) { break; }
				System.out.print( dan + "*" + i + "=" + dan*i + "\t");
			}
			System.out.println();
		}
		

	}

}
