package chap12;

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

class Box {
	Object contents;

	Box(Object contents) {
		this.contents = contents;
	}

	public Object getContents() {
		return contents;
	}

	public void setContents(Object contents) {
		this.contents = contents;
	}
}

public class NonGenericTest {

	public static void main(String[] args) {
		Apple a = new Apple("대구");
		Paper p = new Paper("A4");
		Box abox = new Box(a);
		Box bbox = new Box(p);
		System.out.println("abox : " + ((Apple)abox.contents).origin);
		System.out.println("bbox : " + ((Paper)bbox.contents).size);

	}

}
