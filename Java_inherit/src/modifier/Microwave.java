package modifier;

import inherit1.Product;
public class Microwave extends Product{

	public Microwave() {
		System.out.println(super.brand);
	}
	@Override
	public void power() {
		System.out.println("전자레인지 전원");
	};
}
