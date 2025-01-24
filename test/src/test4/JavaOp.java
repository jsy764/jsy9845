package test4;

import java.util.Scanner;

public class JavaOp {

	public static void main(String[] args) {
		int num = 20; // 대입연산자에 의해 오른쪽의 값을 왼쪽에 저장
		num = 20 + 3 + 1*10; // +,*연산 후 대입연산 실행
		int num2 = 10, num3 = 55;
		
		num = num2 + 13/num3 +123;
		// 대입연산자는 다른 연산자들보다 우선순위가 낮다.
		
		// 사칙연산자
		System.out.println(num2+num3); // +
		System.out.println(num3-num2); // -
		System.out.println(num2*4); // *
		System.out.println(num3/num2); // 몫
		System.out.println(num3 % 4); // %연산은 나머지
		System.out.println(10 / 3.0);
		System.out.println(10 % 3.0);
		
		// 복합 대입 연산자
		num = 10;
		// num = num + 20;
		num += 20;
		// num2 = num2 * 5;
		num2 *= 5;
		// num = num+5*num3;
		num += 5*num3;
		
		Scanner scan = new Scanner(System.in); // 키보드 입력받기 위해 생성
		
		//원의 둘레 구하기
		int r=0, dist=0;
		System.out.println("반지름 : ");
		r = scan.nextInt();
		
		dist = (int)(r*2*3.14);
		
		System.out.println("원의 둘레 : " + dist);
	}
}
