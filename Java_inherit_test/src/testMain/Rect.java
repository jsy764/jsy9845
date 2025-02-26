package testMain;

public class Rect extends Shape {
	public Rect() {}
	public Rect(int w, int h) {
		super(w, h);
	}
	
	@Override
	public void draw() {
		System.out.println("사각형의 밑변은 "+width+"이고 높이는 "+height+"이다.");
	}
}
