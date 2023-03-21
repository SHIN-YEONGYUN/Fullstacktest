package test;

class Trainee{
	String name , title;
	static String camp = "멀티캠프";
    double fee, addFee, returnFee;
	
	double calcReturnFee() {
		if(title.equals("자바")) {
			returnFee = fee * 0.2 + addFee;
		}
		else if(title.equals("jsp")) {
			returnFee = fee * 0.15 + addFee;
		}
		else if(title.equals("spring")) {
			returnFee = fee * 0.1 + addFee;
		}
		else {
			System.out.println("일치하는 과정명은 없습니다.");
			returnFee = 0;
		}
		return returnFee;
	}
	
	// 변수 - 이름, 과정명, 교육기관( 모든 교육생 "멀티캠프" 동일 공유 ), 교육비, 부과금, 환급금
	// 생성자
	// 메소드 - 환급금 계산 메소드 
	// 과정명 자바면 환급금 = 교육비 20% + 부과금
	// 과정명 jsp면 환급금 = 교육비 15% + 부과금
	// 과정명 spring 환급금 = 교육비 10% + 부과금
    // 그외의 과정명은 "일치하는 과정명은 없습니다." 출력 환급금 계산 없음
	// 환급금 리턴
}

public class TraineeTest {

	public static void main(String[] args) {
		// 명령행매개변수 입력 - 홍길동 자바 100000 5000
		// Trainee 객체 생성 
		// 이름 과정명 교육비 부과금 초기화
		// 환급금 계산 메소드 호출
		// 출력 
		// "xxx 교육생은 xxx 과정 수강중이고 교육비는 xxxx 결제했고 최종적인 환급금은 xxxx 입니다."
		

	}

}
