package chap4;

public class WhileTest {

	public static void main(String[] args) {
		/*int sum = 0;
		int i = 1;
		while(i <= 10) {
			sum = sum + i;
			System.out.println("i=" + i + " , sum=" + sum);
			i++;
			
		}*/
		
		/*while(true) {
		 //종료조건식!!!
			System.out.println(1);
		}*/
		

		
	/*	int alpha = (int)(Math.random() * 26 ) + 97; 
		System.out.println((char)alpha);*/

/*		int yournumber = 50;
		int javanumber = (int)(Math.random() * 100 ) + 1;  // 1-100 정수
		while (true) {
			System.out.println( "진행중입니다.");
			if(yournumber == javanumber) {
				System.out.println( "끝났습니다.");
				break;//반복문종료
			}
			else if(yournumber > javanumber) {
				System.out.println( "50이 더 큽니다.");
				//javanumber = (int)(Math.random() * 100 ) + 1;
			}
			else {
				System.out.println( "자바넘버가 더 큽니다.");
				//javanumber = (int)(Math.random() * 100 ) + 1;
			}
			
		}//while
	*/	
		int sum = 0;
		int i = 11;
		do{
			sum = sum + i;
			System.out.println("i=" + i + " , sum=" + sum);
			i++;
			
		}while(i <= 10) ;
		
	}//main end

}//class end









