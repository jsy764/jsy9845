package test4;

import java.util.Scanner;

public class JavaOp3 {

	public static void main(String[] args) {
		// 비교연산자 - 두개 데이터를 비교하여 참, 거짓 결과
//		System.out.println(10>5);
//		System.out.println(11<4);
		
		Scanner scan = new Scanner(System.in);
		
//		int num;
//		
//		System.out.print("정수 입력 : ");
//		num = scan.nextInt();
//		
//		System.out.println("5보다 큰숫자인가?"+(num > 5));
//		boolean big;
//		big = num >= 10;
//		System.out.println("10이상인가 ? " + big);
		
//		System.out.println(10==10);
//		System.out.println(10==13);
//		
//		String word="가나다"; // 문자열의 타입은 String 클래스 타입
//		String word2=new String("가나다"); 
//		
//		System.out.println(word == word2); // false
//		System.out.println(word.equals(word2)); // true
//		System.out.println('a'>'b');
//		// == 비교연산자는 비교하는 2개의 값이 같은 자료형인지 판별
		
		// System.out.println(10 != 5);
		// 놀이동산에 가서 바이킹을 타는데 140이상만 탈 수 있다.
//		int tall = 0;
//		System.out.print("키 : ");
//		tall = scan.nextInt();
//		System.out.println(tall >= 140);
		
		// 바이킹 탑승조건 : 키 140이상 190이하
		// 비교연산자로 만들어진 조건식이 여러개인경우 논리연산자를 사용
//		int tall;
//		System.out.print("키 입력 : ");
//		tall = scan.nextInt();
//		System.out.println(tall >= 140 && tall <= 190);
		
		// 140 <= tall <= 190
		// System.out.println(140 <= tall <= 190);
		// 비교 데이터 타입 불일치
		
		// 청소년 버스요금은 1000원이다. (청소년은 13세부터 19세)
		// 나이를 입력받아서 청소년이면 false 아니면 true가 출력되게 하세요
		int age = 0;
		System.out.print("나이 입력 : ");
		age = scan.nextInt();
		System.out.println(age < 13 || age > 19);
		
		// 조건식 - 비교연산자와 논리연산자를 사용하여 만든식
		// 조건식을 만드는 연습을 해야한다.
		// total > count
	}
}
