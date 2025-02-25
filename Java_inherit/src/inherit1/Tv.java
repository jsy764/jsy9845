package inherit1;

public class Tv extends Product{
//		boolean onOff = false;
//		
//		public void power() {
//			// power 메서드 실행 시 onOff가 false면 true 변경, true면 false
//			// false로 변경하려면 올바른 코드는?
////			if(onOff == false)
////				onOff = true;
////			else
////				onOff = false;
//			onOff=!onOff;
//		}
		public Tv() {
			super(); // 부모클래스의 생성자 메서드
			// super는 부모클래스의 객체를 의미한다.
		}
		public Tv(String brand, int price, String name) {
			super();
			super.brand = brand;
			this.price = price;
			this.name = name;
		}
}
