package Pay;

public class Acounttransfer extends PayDate{
	public Acounttransfer() {}
	public Acounttransfer(int a, String p) {
		super(a, p);
	}
	
	@Override
	public void processpay() {
		System.out.println(amount+"원이 이체됩니다.");
	}
}
