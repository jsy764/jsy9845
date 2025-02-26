package Pay;

public class Card {

	public static void main(String[] args) {
		Creditcard creditcard = new Creditcard(10000, "2월 27일");
		Checkcard checkcard = new Checkcard(20000, "2월 27일");
		Cashpayment cashpayment = new Cashpayment(40000, "");
		Acounttransfer acounttransfer = new Acounttransfer(10000, "");
		creditcard.processpay();
		checkcard.processpay();
		cashpayment.processpay();
		acounttransfer.processpay();
	}

}
