package member;
/* 1. 자동 import - 현재 패키지의 클래스 사용시
 * 2. 자동 import - 라이브러리 java.lang 패키지 포함 클래스 사용시
 * 
 * */

import java.util.ArrayList;

import board.Writing;

public class Member {

	void writeBoard() {
		Writing w = new Writing();
		w.write();
		ArrayList list = new ArrayList();
	}
}
