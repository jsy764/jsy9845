package innerTest;

public class Car {
	private Tire tire;
	
//	public Car() {
//		tire=new Tire();
//	}
	public Car(Tire tire) {
		this.setTire(tire);
	}

	public Tire getTire() {
		return tire;
	}

	public void setTire(Tire tire) {
		this.tire = tire;
	}
	
	// 포함관계에서 클래스객체 생성시기
}
