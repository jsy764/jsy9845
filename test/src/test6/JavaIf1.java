package test6;

public class JavaIf1 {

	public static void main(String[] args) {
		//바이킹 탑승 - 키가 140이상 만 탑승
		int tall = 163;
		// if문에는 조건식이 반드시 if뒤에 붙어야한다.
		if(tall >= 140){// 중괄호는 조건에 따라 실행될 내용작성
			System.out.println("탑승가능");
			System.out.println("키가 140이상이다.");
			int a = 10;
			a = 132 + 2;
		} else {// else는 조건식이 거짓일 경우 실행
			System.out.println("탑승불가");
		}
		
		// 두 숫자중 큰수는 ?
		int num1 = 35, num2 = 12;
		
		if(num1>num2) {
			System.out.println(num1);
		} else {
			System.out.println(num2);
		}
		
		int 철수=275, 민수=260;
		if(철수 > 민수) {
			System.out.println("철수가 발이 더 크다.");
		} else {
			System.out.println("민수가 발이 더 크다.");
		}
		// 편의점에서 도시락 사먹는데, 가격이 5200원이다.
		// 내 통장 잔액이 4530원이라면, 얼마나 이체 해야하나??
		// (잔액이 충분하다면 이체할 필요가 없다.)
		int money = 4530;
		
		if(money<5200) {
			System.out.println((5200-money)+"원 이체 필요");
		} else {
			System.out.println("이체 필요없음");
		}
		
		// 바이킹 탑승 조건 - 키가 140이상 190이하만 가능
		// 키의 변수는 tall
		if(tall>=140 && tall<=190) {
			System.out.println("탑승가능");
		} else {
			System.out.println("탑승불가");
		}
		// 후룸라이드 탑승 하려면 키가 130이상이거나 몸무게 45kg이상만 가능
		tall = 125;
		int wg = 25;
		if(tall>=130 || wg>=45) {
			System.out.println("탑승가능");
		} else {
			System.out.println("탑승불가");
		}
	}
}
