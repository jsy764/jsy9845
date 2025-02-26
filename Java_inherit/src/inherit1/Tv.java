package inherit1;

public class Tv extends Product{
		public Tv() {
			super(); // 부모클래스 생성자메서드가 반드시 먼저 실행된다.
			System.out.println("자식클래스 생성");
//			super(); // 부모클래스의 생성자 메서드
			// super는 부모클래스의 객체를 의미한다.
		}
		public Tv(String brand, int price, String name) {
			super(brand, price, name);
		}
		// 오버라이딩
		// 상속 관계인 경우 인터페이스 implements인 경우에 사용
		// 성립 조건
		// 1. 메서드의 원형은 그대로 유지
		// 2. 내용만 변경한다.
		// 3. 상속 또는 implements인 경우에만 가능
		
		@Override
		public void power() {
			onOff=!onOff;
			System.out.println("컴퓨터의 전원 : "+onOff);
		};
}
