package store;

public abstract class Fruit {
	protected int cost; // 판매금액
	protected int capacity; // 용량?
	
	protected Fruit() {}
	protected Fruit(int c, int cp) {
		this.cost=c;
		this.capacity=cp;
	}
	public abstract void makeJuice(); // 과일 주스 만들기
	public abstract void pieceFruit(); // 과일 소량 컵?에 팔기
}
