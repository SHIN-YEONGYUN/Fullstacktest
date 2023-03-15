package chap5;

import java.util.Arrays;

public class MainTest {

	public static void main(String[] args) {
		System.out.println("입력된 변수의 갯수 = " + args.length);
		System.out.println(Arrays.toString(args));

		// 100 200 
		System.out.println(args[0] + args[1]);
		// 형변환연산자 - 기본형끼리만 (데이터타입)
		// String --> int 1> 연산자 2> 라이브러리메소드 3> 기능구현단위 = 메소드/클래스포함
	    int first = Integer.parseInt(args[0]);
	    int second = Integer.parseInt(args[1]);
	    System.out.println(first + second);
	    
	   double third = Double.parseDouble(args[2]);
	   double four = Double.parseDouble(args[3]);
	   System.out.println(third + four);
	}

}
