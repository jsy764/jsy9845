package inherit1;

public class Refri extends Product {
	
	@Override
	public void power() {
		onOff=!onOff;
		System.out.println("컴퓨터의 전원: "+onOff);
	};
}

// 부모클래스가 추상 메서드를 가지고 있는 추상 클래스라면 자식 클래스에게 추상 메서드를 
// 상속시키기 때문에 자식클래스 추상메서드 가지고 있는것과 마찬가지가 된다.