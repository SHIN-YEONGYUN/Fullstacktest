package chap11;

import java.util.Arrays;
import java.util.HashMap;

/* 이름 키 : String[] 홍길동 : 010-1234-5678 집 사무실 이메일 주소 */
public class HashMapTest {

	public static void main(String[] args) {
		HashMap phonemap = new HashMap();
		String infrom1[] = { "010-1234-5678", "02-111-2222", "032-111-2222",
				"hong@a.com", "서울시 강남구 역삼동" };
		String infrom2[] = { "010-3832-8092", "070-543-2798", "031-111-3333",
				"kim@a.com", "수원시 영통구 광교동" };
		String infrom3[] = { "010-0982-1235", "02-111-7892", "032-1231-4444",
				"park@a.com", "부산시 해운대구 해운대동" };
		
		phonemap.put("홍길동", infrom1);
		phonemap.put("김한국", infrom2);
		phonemap.put("박대한", infrom3);
		// phonemap.put("홍길동", new String[] {});
		System.out.println(phonemap.size());
		
		// 명령행 매개변수 홍길동 입력
		String[] s = (String[])phonemap.get(args[0]);
		System.out.println(args[0] + "의 정보는 다음과 같습니다.");
		System.out.println(Arrays.toString(s));
		System.out.println("======================");
		for(int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		System.out.println("====================");
		for(String one : s) {
			System.out.println(one);
		}
	}

}
