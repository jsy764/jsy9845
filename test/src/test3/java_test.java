package test3;

import java.util.Scanner;

public class java_test {
	public static void main(String[] args) {
	// 연산자
	/*
	 * 사칙연산자 : +, -, *, /(몫), %(나머지)
	 * 대입연산자 : =(오른쪽에서 왼쪽에 대입-저장)
	 * 증감연산자 : ++, --
	 * 복합 대입 연산자 : +=, -=, *=, /=, %=
	 * 비교 연산자 : >, <, >=, <=, ==, !=
	 * 논리 연산자 : &&, ||, !
	 * 조건연산자(삼항연산자) : (조건식) ? 참일경우 실행내용 : 거짓일경우 실행내용
	 * 비트연산자 
	 * - 비트 논리연산자 : &, |, ~, ^(xor)
	 * - 비트 쉬프트연산자 : <<, >>
	 */
	
	Scanner scan = new Scanner(System.in); // 자동완성 : ctrl + spacebar
	
	// 만나이 입력
	int age = 0;
	System.out.print("나이 : ");
	age = scan.nextInt();
	
	// 태어난 년도
	int birth = 2025 - age;
	System.out.println("나이 : "+ age + "살");
	System.out.println("태어난 년도 : " + birth + "년");
}
}