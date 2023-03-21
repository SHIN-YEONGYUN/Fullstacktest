package chap9;

public class BinaryTest {

	public static void main(String[] args) {
		int i = 127;
		String binaryString = Integer.toBinaryString(i);
		String otaString = Integer.toOctalString(i);
		String hexString = Integer.toHexString(i);
		System.out.println(binaryString);
		System.out.println(otaString);
		System.out.println(hexString);

	}

}
