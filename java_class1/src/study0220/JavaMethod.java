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
	
	static String game(int val) { // 1-가위, 2-바위, 3-보
		if(val==1)
			return "가위";
		if(val==2)
			return "바위";
		if(val==3)
			return "보";
		return "잘못입력"; // 반환이 있는 메서드에서 if문으로 return을 했다면 
		// 참인 경우에만 동작할 수 있기 때문에 별도의 return이 필요
	}
	
	// 두개 정수중 큰 값 출력하는거 만들기
	// 두 정수 비교하고 출력하는 메서드 필요
	// 반환없고 매개변수있는 메서드로!!!
	static void compare(int a, int b) {
		if(a>b)
			System.out.println(a);
		else if(a<b)
			System.out.println(b);
		else
			return;
	}
	//국어점수 : 88, 영어점수 : 91, 수학점수 : 74
	//세과목의 총점과 평균을 출력해라
	//총점 계산하는 메서드 평균 계산하는 메서드 
	static int total(int num1, int num2, int num3) {
		int sum = num1+num2+num3;
		System.out.println("세과목의 총점 : "+sum);
		return sum;
	}
	static void avg(int sum) {
		System.out.println("세 과목의 평균 : "+(float)sum/3);
	}
	
	public static void main(String[] args) {
		String res = game(1); // 1은 가위이다.
		
		output();// 이렇게 작성해야 output 메서드 실행된다.
		// 출력
		
		int num = total();
		System.out.println(num);
		
		sum(30, 100);
		sum(40, 5);
		
		int a = 100, b = 232;
		sum(a, b);	
		
		int num1 = 7, num2 = 8;
		compare(num1, num2);
		
		int kor = 88, eng = 91, mat=74;
		int sum = total(kor, eng, mat);
		avg(sum);
	}
}
