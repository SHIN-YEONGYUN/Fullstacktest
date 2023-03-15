package chap5;

public class ArrayTest {

	public static void main(String[] args) {
		int[] array = new int[5]; // 5개의 정수값을 저장하기 위한 배열 생성
		for (int i = 0; i < array.length; i++) // 배열의 각 요소에 1~5의 값을 저장
			array[i] = i + 1; //array[0]에 1이 저장
		int temp = 0; // 두 값을 바꾸는데 사용할 임시변수
		int j = 0; // 임의의 값을 얻어서 저장할 변수
		
		// 배열에 저장된 값이 잘 섞이도록 충분히 큰 반복횟수를 지정
		// 배열의 첫 번째 요소와 임의의 요소에 저장된 값을 서로 바꿔서 값을 얻음
		for(int i=0; i < 100; i++) {
			j = (int) (Math.random() * 5); //배열 범위(0~5)의 임의의 값을 얻음
			temp = array[0];
			array[0] = array[j];
			array[j] = temp;
		}
		// 배열 array의 앞에서부터 3개의 요소 출력
		for(int i=0; i < 3; i++)
		System.out.println(array[i] + " ");
		///////////////////////////////////////////
		String[] names = {"홍길동", "박한국", "김대한", "최강산", "김우리", "이자바"}; // 선언 생성 초기화 문장
		int scores[] = new int[names.length]; // 선언 생성 (자동초기화 - 정수 = 0)
		// 배열 여러 요소 - 길이 한정
		for(int i = 0; i < names.length; i++) {
		    scores[i] = (int)(Math.random() * 100) + 1;
			System.out.println(names[i] + "학생의 점수 = " + scores[i]);
		}
		///////////////////////////////////////
		for(int i = 0; i < names.length; i++) {
			System.out.print(scores[i] + ",");
		}
		// scores 배열에서 최대값 찾기
		int max = 0; int maxIndex = 0;
		for(int i = 0; i< scores.length; i++) {
			if (max < scores[i]) {
				max = scores[i];
				maxIndex = i;
			}
		}
		
        // scores 배열에서 최소값 찾기
		int min = 200; int minIndex = 0;
		for(int i = 0; i< scores.length; i++) {
			if (min > scores[i]) {
				min = scores[i];
				minIndex = i;
			}
		}
		/* scores => { 99, 21, 66, 89, 90, 44 }
		   for (int n : scores) { // 임의 변수 n에 scores 값 저장
			if (n > max) // 임의 변수 n 값이 max 값보다 크다면 max 에 n 값 저장되게 반복 
				max = n;
		 }
		 */
	
		System.out.println(names[maxIndex] + "학생의 점수가 " + max + "이고 1등입니다."); // 최대값
		System.out.println(names[minIndex] + "학생의 점수가 " + min + "이고 6등입니다."); // 최소값
		
		System.out.println('\u0000'); // '\t'  '\n'  '\u0000'
		
		String[] names1 = {"홍길동", "박한국", "김대한", "최강산", "김우리", "이자바"}; // 선언 생성 초기화 문장
		int scores1[][] = {new int[names1.length]}; // 선언 생성 (자동초기화 - 정수 = 0)
		// 배열 여러 요소 - 길이 한정
		for(int i = 0; i < names1.length; i++) {
		    scores[i] = (int)(Math.random() * 100) + 1;
			System.out.println(names1[i] + "학생의 점수 = " + scores1[i]);
		}
	
	}

}
