package chap11;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(100);
		set.add(225);
		set.add(3);
		set.add(44);
		set.add(55);
		set.add("하이");
		set.add(66); // 무시
		System.out.println(set.size());
		for(Object o : set) {
			System.out.println(o);
		}
		// 1-45 난수 생성하여 lottoset 이름의 HashSet 객체 저장
		System.out.println("========================");
		
		HashSet lottoset = new HashSet(6);
		// 반복문 시작 - 1-45 난수 생성 2> lottoset 저장 3 >lottoset 가 6개라면 중단 
		while (lottoset.size() < 6) {
			int num = (int) (Math.random() * 45);
	    	if(num != 0) {
	    		lottoset.add(num);
	    	}
	    }
	    System.out.println(lottoset);
	}

}
