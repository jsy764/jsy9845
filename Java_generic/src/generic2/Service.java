package generic2;

public class Service {
	public void drink(Bottle<? extends Alcohol> soju) { // 알코올섭취
		System.out.println(soju.item);
		System.out.println("한잔 마신다.");
	}
}
