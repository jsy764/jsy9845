package testMain;

public class Circle extends Shape {

	public Circle() {}
	public Circle(int w, int h) {
		super(w, h);
	}
	@Override
	public void draw() {
		System.out.println("원의 지름은 "+width+"이다.");
	}
}
