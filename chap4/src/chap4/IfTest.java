package chap4;

public class IfTest {

	public static void main(String[] args) {
		// 남궁성 국어 영어 수학 총점 평균(정수,실수) 
		// 등급(80점이상 A등급  60점이상 B등급 40점이상 C등급 그이하 D등급)
		String name = "남궁성";
		int kor = (int)(Math.random() * 100) + 1;
		int eng = (int)(Math.random() * 100) + 1;
		int mat = (int)(Math.random() * 100) + 1;
		int sum = kor + eng + mat;
		int avgInt = sum / 3;
		double avgDouble = (double)sum / 3;
		
		System.out.println("이름=" + name);
		System.out.println("국어=" + kor);
		System.out.println("영어=" + eng);
		System.out.println("수학=" + mat);
		System.out.println("총점=" + sum);
		System.out.println("점수 평균=" + avgInt);
		System.out.println("실수 평균=" + avgDouble);
		//변수 선언만하고 값을 안넣어도 실행되는데 null이라도 꼭 뭔갈 넣는게 좋은가요?
		
		String grade ;
		if(avgInt >= 80){
			grade="A등급";
		}
		else if(avgInt >= 60) {
			grade="B등급";
		}
		else if(avgInt >= 40) {
			grade="C등급";
		}
		else {
			grade="D등급";
		}
		
		System.out.println(grade);
		
		//변수 scope {}
		/*String result = "";
		if(avgInt >= 70) {//true
			result = "수료";
			
		}
		else {//false
			result = "미수료";
	
		}

		System.out.println(result);*/
	}

}





