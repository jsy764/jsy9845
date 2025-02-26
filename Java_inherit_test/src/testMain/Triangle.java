package testMain;

public class Triangle extends Shape {
	public Triangle() {}
	public Triangle(int w, int h) {
		super(w, h);
	}
	
	@Override
	public void draw() {
		System.out.println("삼각형의 밑변은 "+width+"이고 높이는 "+height+"이다.");
	}
}
