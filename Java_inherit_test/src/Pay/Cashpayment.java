package Pay;

public class Cashpayment extends PayDate{
	public Cashpayment() {}
	public Cashpayment(int a, String p) {
		super(a, p);
	}
	
	@Override
	public void processpay() {
		System.out.println("현금결제는 총 "+amount+"이다.");
	}
}
