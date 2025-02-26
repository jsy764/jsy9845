package Pay;

public class Creditcard extends PayDate{
	public Creditcard() {}
	public Creditcard(int a, String p) {
		super(a, p);
	}
	
	@Override
	public void processpay() {
		System.out.println("신용카드 결제금액은 "+amount+" 결제일은 "+ paydate+"이다.");
	}
}
