package generic;

import java.util.ArrayList;


class Wine {
	String kind;

	public Wine(String kind) {
		this.kind = kind;
	}

}

class Apple {
	String origin;

	public Apple(String origin) {
		this.origin = origin;
	}

}

class Paper {
	String size;

	public Paper(String size) {
		this.size = size;
	}

}

class Box<T> {
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
		Box<Apple> abox = new Box<Apple>(a);
		Box<Paper> bbox = new Box<Paper>(p);
		Box<Wine> cbox = new Box<Wine>(w);
		System.out.println("abox : " + abox.contents.origin);
		System.out.println("bbox : " + bbox.contents.size);

		
		}
	}

