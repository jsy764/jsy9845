package thread2;

public class Cafe{
	private Order order;
	private boolean orderPlace = false; // 주문했냐(true) 안했냐(false)
	
	public synchronized void placeOrder(String menu) throws InterruptedException{
		while(orderPlace) {
			wait();
		}
		order=new Order(menu);
		System.out.println("손님 매장주문 "+order.getOrderId() + " - "+order.getMenu());
		orderPlace = true;
		notify();
	}

	public synchronized Order give() throws InterruptedException {
		while(!orderPlace) {
			wait();
		}
		orderPlace=false;
		notify();
		return order;
	}
//	public void takeOrder(String menu) {
//		order = new	Order(menu);
//		System.out.println("손님 포장주문 : " + order.getOrderId() + " - "+order.getMenu());
//		// 주문이 들어오기전까지 바리스타는 대기
//	}
}
