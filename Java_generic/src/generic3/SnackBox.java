package generic3;

public class SnackBox<T> {
	T snack;
	
	public void makeBox(T snack) {
		snack = snack;
		System.out.println(snack);
		System.out.println("과자 박스만들기");
	}
}
