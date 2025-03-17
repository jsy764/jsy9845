package thread2;

public class Barista implements Runnable{
	private final Cafe cafe; // 바리스타가 일하는 카페
	
	public Barista(Cafe cafe) {
		this.cafe = cafe;
	}
	@Override
	public void run() {
	try {
		while(true) {
			Order order = cafe.give();
			System.out.println("바리스타 제조 : "+order.getOrderId()+" - " + order.getMenu());
			Thread.sleep(3000); // 그냥 주문 시간 설정만한거 nullpointer와 상관없음
			System.out.println("바리스타 제조완료 : "+order.getMenu());
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
	}
	
}
