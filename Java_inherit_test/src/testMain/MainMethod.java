package testMain;

public class MainMethod {
	
	public void main(String[] args) {
		Triangle t = new Triangle(10, 20);
		Rect r = new Rect(20, 10);
		Circle c = new Circle(10, 0);
		t.draw();
		r.draw();
		c.draw();
	}
}
/*
  원, 사각형, 삼각형 도형을 그리는데 그리고자하는 도형의 크기를
  지정하여 draw 메서드로 그리기 수행할 것이다.
  상속 관계로 알맞은 클래스들을 정의하여 원, 사각형, 삼각형이
  그려질 수 있도록 하세요.
  draw메서드의 내용은 다음과 같이 원클래스의 객체로 draw를 실행 한다면
  System.out.println("지름이 " + width+"인 원을 그린다.)
*/