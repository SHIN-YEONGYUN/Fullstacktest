package chap4;

public class CharacterTest {
	public static void main(String args[]) {
		char alpha = 'G'; //'A' '가' '0' '$'
		//alpha 소문자/대문자이면 대문자/소문자 변환 출력
		
		/*System.out.println((int)'a');//97
		System.out.println((int)'z');//122
		System.out.println((int)'A');//65
		System.out.println((int)'Z');//90
		*/
		char result = '1'; 
		if(alpha >= 97 && alpha <= 122) {
			result = (char)(alpha - 32);//대문자로 변환
		}
		else if(alpha >= 65 && alpha <= 90) {
			result = (char)(alpha + 32);//소문자로 변환
		}
		else {
			result = alpha;
		}
		
		System.out.println(alpha + "의 대소문자 변환 결과는 " + result + " 입니다.");
		
	}
}
