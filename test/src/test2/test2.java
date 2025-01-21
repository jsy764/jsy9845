package test2;

import java.util.Scanner;

public class test2 {
	public static void main(String[] args) {
		// 변수는 데이터를 저장하기 위한 메모리 공간
		// 변수의 이름은 데이터가 저장된 공간을 활용하기 위해 부여된 별명
		// 변수 선언 방법은 데이터타입 변수이름 ex) int num;
		// 저장한 데이터에 맞는 데이터 타입을 설정해야한다.
		// 변수이름의 첫글자는 문자로, 자바 예약어는 사용불가
		
		// 자바에서 결과로 호출하는 방법
		// System.out.println("출력하는방법");
		// 자바에서 키보드를 통해 데이터를 입력하는 방법
		// 자바에서 입력하기 위한 순서
		// 1. 입력 객체 생성
		// 2. 입력 객체를 통해 데이터에 맞는 입력메서드 호출
		
		// Scanner 변수이름 = new Scanner(System.in);
		// 사각형의 너비와 높이를 통해 입력받고 넓이를 계산하여 출력해라.
		 Scanner sc = new Scanner(System.in);
		 System.out.println("너비입력 : ");
		 int width = sc.nextInt();
		 System.out.println("높이입력 : ");
		 int height = sc.nextInt();
		 System.out.println("사각형의 넓이 : " + width*height);
		
		// num 이라는 변수에 정수 데이터 입력하여 저장하기
		// nextInt()가 정수 데이터 입력하기 위한 메서드이다.
		// int num = input.nextInt();
		/*
		 * 1월 20일 과제(변수 활용 문제)
		 * 
		 * 사과 상자에 사과가 20개 들어있다.
		 * 오렌지 상자에 15개 들어있다.
		 * 사과 상자는 11개, 오렌지 상자는 12개 있다면
		 * 과일은 총 몇개인가?
		 */
		
		// int applebox = 11; // 사과 상자의 개수
		// int orangebox = 12; // 오렌지 상자의 개수
		// int apple = applebox * 20; // 사과의 개수
		// int orange = orangebox * 15; // 오렌지의 개수
		// System.out.println("과일의 총 개수: " + (apple+orange)); // 과일의 총 개수
		
		int applebox = 11; // 사과상자의 개수
		int apple = 20; // 상자 안 사과의 개수
		int orangebox = 12; // 오렌지상자의 개수
		int orange = 15; // 상자 안 오렌지의 개수
		int apple_total = applebox * apple; // 총 사과의 개수
		int orange_total = orangebox * orange; // 총 오렌지의 개수
		int fruit_total = apple_total + orange_total; // 총 과일의 수
		System.out.println("총 과일수 : " + fruit_total);
	}
}
