package chap4;

public class ReturnTest {
	public static void mymethod() {//메소드 정의 ( 메소드 실행 x)
		System.out.println("2.mymethod 실행 시작");
		if(false) { return; }
		System.out.println("3.mymethod 실행 종료");		
	}
	
	public static void main(String[] args) {
		//자바 클래스 main메소드 정의 자동 실행 - run메뉴(cmd java.exe 명령) - 
		System.out.println("1.main시작");
		mymethod(); //메소드 실행 
		//if(true) {return;}
		System.out.println("4.main종료");		
	}

}
