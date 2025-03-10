package generic3;

public class Snack {
	private String snackName;
	private int price;
	
	public Snack(String snackName, int price) {
		this.snackName=snackName;
		this.price=price;
	}
	
	@Override
	public String toString() {
		return snackName+" "+price+"원";
	}
}
