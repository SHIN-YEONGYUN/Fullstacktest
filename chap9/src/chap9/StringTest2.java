package chap9;

class StringTest2 {
	public static void main(String[] args) {

		String first = "Arnold";
		String middle = "Alois";
		String last = "Schwarzenegger";
		String initials;
		String firstInit, middleInit, lastInit;

		firstInit = first.substring(0, 1);
		middleInit = middle.substring(0, 1);
		lastInit = last.substring(0, 1);
		initials = firstInit + middleInit + lastInit;
		// initials = firstInit.concat(middleInit).concat(lastInit);

		System.out.print("1. 이름: ");
		System.out.println(first + " " + middle + " " + last);
		System.out.print("2. 이름 (대문자): ");
		System.out.println(first.toUpperCase() + " " + last.toUpperCase());
		System.out.print("3. 이니셜:  ");
		System.out.println(initials);

		System.out.println("4. First Name은 arnold이다. (대소문자 구분; T/F):  " + first.equals("arnold"));
		System.out.println("5. First Name은 arnold이다. (대소문자 미구분; T/F):  " + first.equalsIgnoreCase("arnold"));

		System.out.println("6. Last Name " + last + "의 index 번호 6~14까지 문자열 : " + last.substring(6, 14));
		System.out.println("7. Last Name " + last + "에서 negger 문자열의 위치 : " + last.indexOf("negger"));
		
		String test1 = ""; //empty string
		String test2 = null; //null string
		System.out.println(test1.length()); // 0
		
		test2 = "test2";
		System.out.println(test2.length()); // 컴파일 오류 X
	}

}
