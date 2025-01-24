package test5;

import java.util.Scanner;

public class JavaOp4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 조건 연산자
		// (조건식) ? 참일경우 실행내용 : 거짓일경우 실행내용

//		void a = (10 > 5) ? System.out.println("5보다 크다"):
//		System.out.println("5보다 작다");
		
//		String result=(1 > 5) ? "5보다 크다" : "5보다 작다";
//		System.out.println(result);
		
//		int age = 21;
//		
//		int price = ( age < 19 ) ? 1000:1500;
//		System.out.printf("나이 : %d살, 버스요금 : %d \n", age, price);
		
//		System.out.print("첫번째 숫자 : ");
//		int num1 = scan.nextInt();
//		System.out.print("두번째 숫자 : ");
//		int num2 = scan.nextInt();
//		
//		int res = (num1 > num2) ? num1:num2;
//		//조건식이 참이면 res=num1 수행
//		//조건식이 거짓이면 res=num2 수행
//		
//		System.out.println("두숫자 중 큰숫자는 : " + res);
		
		// 두 숫자를 입력받아서 두수가 같으면 같다, 같지 않으면 같지 않았다. 출력
//		System.out.println("첫 번째 숫자 입력 : ");
//		int n1 = scan.nextInt();
//		System.out.println("두 번째 숫자 입력 : ");
//		int n2 = scan.nextInt();
//		
//		String result = (n1 == n2) ? "같다":"같지않았다";
//		System.out.println(result);
		
//		System.out.println("숫자1 : ");
//		int num1 = scan.nextInt();
//		System.out.println("숫자2 : ");
//		int num2 = scan.nextInt();
//		
//		String 결과 = (num1 == num2) ? "두숫자가 같다.":"두숫자가 같지않다.";
//		System.out.println(결과);
		
//		System.out.print("정수 입력 : ");
//		int num = scan.nextInt();
		
		// 입력한 정수가 양수냐 음수냐, 0이냐
//		String res = (num > 0) ? "양수" : (num < 0) ? "음수":"0이다.";
//		System.out.println(res);
		
		// 바이킹을 타기 위해서는 키가 135 이상이어야 한다.
		// 바이킹 탑승여부를 출력해라. (키 입력받기)
//		int height = 0;
//		System.out.print("키 입력 : ");
//		height = scan.nextInt();
//		String res = (height >= 135) ? "탑승가능" : "탑승불가";
//		System.out.println(res);
		
//		System.out.print("1. 파미향짬뽕 2. 쿠켄 돈가스 3. 공주순대 : ");
//		int select = scan.nextInt();
//		
//		int price = (select == 1) ? 9000:0;
//		price = (select == 2) ? 8000:price;
//		price = (select == 3) ? 6500:price;
//		
//		System.out.println("가격은 "+price);
		// 정수 세개를 키보드를 통해 입력받기
		// 세 정수 중에서 가장 큰 정수를 출력하세요.
		// 두개가 같은 경우, 세개가 같은 경우는 배제하고!
		
//		System.out.print("정수 입력 : ");
//		int num1 = scan.nextInt();
//		System.out.print("정수 입력 : ");
//		int num2 = scan.nextInt();
//		System.out.print("정수 입력 : ");
//		int num3 = scan.nextInt();
//		
//		int res = (num1 > num2) ? num1 : num2;
//		res = (res > num3) ? res : num3;
//		
//		System.out.println(res);
		
		System.out.print("세 정수 입력: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		int max = (num1 > num2) ? num1 : num2;
		max = (max > num3) ? max : num3;
		System.out.println("가장 큰 수 : "+ max);
	}
}

	// 사칙연산자 : +, -, /, *, %
	// 복합대입연산자 : +=, -=, /=, *=, %=
	// a = a + 123; a += 123;
	// 증감연산자 : ++, --
	// 비교연산자 : 비교연산자를 통해 조건식을 만든다. 조건식은 참 또는 거짓의 결과
	// ==, !=
	// 논리연산자 : &&(and), ||(or), ! (not)
	// 논리연산자는 참이나 거짓을 가지고 연산한다.
	// a > 6 && (b < 4 && 0 || c > 10)