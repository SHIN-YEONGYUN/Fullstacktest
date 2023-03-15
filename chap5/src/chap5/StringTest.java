package chap5;

public class StringTest {

	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "java";
		String s3 = new String("java");
		String s4 = new String("java");
		System.out.println("s1 == s2 동등성 여부 = " + (s1 == s2));
		System.out.println("s3 == s4 동등성 여부 = " + (s3 == s4));
		// 주소가 같은지 확인
		System.out.println("s1.equals(s2) 동등성 여부 = " + s1.equals(s2));
		System.out.println("s3.equals(s4) 동등성 여부 = " + s3.equals(s4));

	}

}
