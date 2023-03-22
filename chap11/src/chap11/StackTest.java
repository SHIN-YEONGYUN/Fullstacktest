package chap11;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack st = new Stack(); //
		st.push(1);
		st.push(2);
		st.push(3);
		System.out.println(st.size());
		System.out.println(st.peek());
		System.out.println("====================");
		while (!st.isEmpty()) {
			System.out.println(st.pop());
		}
		String pair = "{(소괄호)중괄호}[대괄호]}";
		// 스택 { ( [ - stack push
		// } ) ] - stack pop 
	}

}
