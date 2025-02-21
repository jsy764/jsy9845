package study0218;

public class Member {
	String name; // 이름
	int age; // 나이
	String job; // 직업
	
	Member(){ // 생성자 메서드
		this.name="박문수";
		System.out.println(this);
	}
	Member(int age, String job){//메소드 오버로딩
		this.age=age;
		this.job=job;
	}
	Member(int age, String job, String name){
		this.name=name;
		this.age=age;
		this.job=job;
	}
	//오버로딩 조건
	//1.메서드 이름이 같아야 한다.
	//2.매개변수가 같으면 안된다.
	//3.매개변수 갯수가 달라도 성립
	//4.하나의 클래스 내부에서만 가능하다.
	
	// 자바변수 종류
	// 인스턴스 변수
	// 지역변수
	// 클래스 변수
	
	// 변수 우선순위
	// 지역변수 > 인스턴스 변수 >= 클래스 변수
	
	// 생성자 메서드
	// 생성자 메서드는 자바에서 클래스를 정의할 때 기본 생성자 메서드도 같이 만들어진다.
	// 눈에 보이지 않게 처리된 것이지 없는것은 아니다. 생성자 메서드는 클래스 객체 공간
	// 생성 시 인스턴스들의 초기화를 담당하는 메서드이다.
}
