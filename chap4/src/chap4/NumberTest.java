package chap4;

public class NumberTest {

	public static void main(String[] args) {
		int su = 21;
		//su 3의 배수일 경우만 7의 배수인지 판단
		String result = "";
		
		if(su % 3 == 0) {
			if(su % 7 == 0) {
				result = "3의 배수이고 7의 배수이다";
			}//inner if end
			else {
				result = "3의 배수이고 7의 배수는 아니다";
			}//inner else end
			
			
		}//outer if end
		
		else {
			result = "3의 배수 아니다 ";
		}
		
		System.out.println(result);
		
	}//main end

}//class end
