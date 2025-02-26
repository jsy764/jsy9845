package Pay;

public class Checkcard extends PayDate{
	public Checkcard() {}
	public Checkcard(int a, String p) {
		super(a, p);
	}
	
	@Override
	public void processpay() {
		System.out.println("체크카드 결제금액은 "+amount+" 결제일은 "+ paydate+"이다.");
	}
}
