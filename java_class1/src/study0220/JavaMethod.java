package study0220;

public class JavaMethod {
	// 메서드에 반환값(출력값)이 없는 경우 void타입으로 작성한다.
	
	// 메서드 정의
	// 반환과 매개변수 없는 메서드 형태
	// 외부 데이터도 필요없고 출력하는 값도 없기 때문에 대부분 단순 출력용이 많다.
	// 또는 클래스 객체의 메서드인경우에도 반환과 매개변수없이 정의한다.
	static void output() {
		System.out.println("반환이 없는");
		System.out.println("매개변수도 없는 메서드");
	}
	// 반환없고 매개변수 있는 메서드
	// 메서드의 내용을 실행하는데 필요한 데이터를 가지고 있지않다면 메서드 외부에서
	// 가져와야한다.
	static void sum(int num1, int num2) { // 두 정수의 합을 구해서 출력
		System.out.println(" 합 : "+(num1+num2));
	}
	static void sum(int num1, float num2) {
		System.out.println(" 합 : "+(num1+num2));
	}
	//반환이 있고 매개변수 필요없는 메서드로 매개변수가 필요없기 때문에 자체적으로 필요한
	// 데이터를 생성할 수 있거나 클래스 객체가 가지고 있는 인스턴스 변수의 데이터를 가공
	//(계산같은거)하여 외부로 내보내기 위한 목적인 경우 대표적인 예로는 int num = 
	// scan.nextInt();
	static int total() {
		int a=10, b=20, c=30;
		int tot = a+b+c;
		return tot;
	}
	
	//반환,매개변수가 있는 메서드 name.equals("박문수");
	
	public static void main(String[] args) {
		output();// 이렇게 작성해야 output 메서드 실행된다.
		// 출력
		
		int num = total();
		System.out.println(num);
		
		sum(30, 100);
		sum(40, 5);
		
		int a = 100, b = 232;
		sum(a, b);	
		
		
		
		
		
	}
}
