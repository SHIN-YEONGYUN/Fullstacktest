package Generic2;

import java.util.ArrayList;

class Solid {
	String tellName() {
		return "고체류";
	}
}

class Wine {
	String kind;

	public Wine(String kind) {
		this.kind = kind;
	}

}

class Apple extends Solid {
	String origin;

	public Apple(String origin) {
		this.origin = origin;
	}

}

class Paper extends Solid {
	String size;

	public Paper(String size) {
		this.size = size;
	}

}

class Box<T extends Solid> {
	T contents;

	Box(T contents) {
		this.contents = contents;
	}

	public T getContents() {
		return contents;
	}

	public void setContents(T contents) {
		this.contents = contents;
	}
}

public class GenericTest {

	public static void main(String[] args) {
		Apple a = new Apple("수원");
		Paper p = new Paper("A5");
		Wine w = new Wine("로제 와인");
		Solid s = new Solid();
		Box<Apple> abox = new Box(a);
		Box<Paper> bbox = new Box(p);
		// Box<Wine> cbox = new Box(w);
		System.out.println("abox : " + abox.contents.origin);
		System.out.println("bbox : " + bbox.contents.size);
		
		Box<Solid> sbox = new Box(s);
		sbox.setContents(a);
		//System.out.println("sbox : " + sbox.contents.origin);
		sbox.setContents(p);
		//System.out.println("pbox : " + sbox.contents.size);
		
		ArrayList<Solid> list = new ArrayList();
		list.add(a);
		list.add(p);
		for(Solid i : list) {
			System.out.println(i);
		}
	}

}
