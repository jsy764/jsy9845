package Pay;

public abstract class PayDate {
	protected int amount; // 결제금액
	protected String paydate; // 결제일
	
	protected PayDate() {}
	protected PayDate(int a, String p) {
		this.amount = a;
		this.paydate = p;
	}
	public abstract void processpay(); 
}
