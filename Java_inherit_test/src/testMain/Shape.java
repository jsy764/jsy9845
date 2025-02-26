package testMain;

public abstract class Shape {
	protected int width; // 밑변
	protected int height; // 높이
	
	public Shape() {}
	protected Shape(int w, int h) {
		this.width = w;
		this.height = h;
	}
	public abstract void draw();
}
