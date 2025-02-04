package test8;

import java.util.Scanner;

public class JavaSwitch1 {

	public static void main(String[] args) {
//		switch(20) {
//			case 'a':
//					System.out.println("1을 선택");
//			 case 10:
//		}
//		switch(1) {
//		case 1:
//				System.out.println("1을 선택");
//				if() {
//					switch(){}
//				}
//				switch(){}
//				break;
//		case 3:
//				System.out.println("3을 선택");
//				break;
//		case 10:
//				System.out.println("10을 선택");
//				break;
//		}
		
//		int num = 50;
//		switch(num) {
//		case 10:
//				System.out.println("10선택");
//				break;
//		case 30:
//				System.out.println("30할꺼야??");
//				break;
//		case 20:
//				System.out.println("case에 표현하는 데이터는 정수, 문자, 문자열");
//				break;
//		case 50:
//				System.out.println("입력된 값에 맞는 case 실행은 "+"break 또는 }까지 실행");
//				break;
//		default:
//				System.out.println("case에 없는값이야! 다시해!!");
//		}
		
		Scanner sc = new Scanner(System.in);
		int user1 = (int)(Math.random()*3+1);
		System.out.println("1.가위 2.바위 3.보");
		System.out.print("입력 : ");
		int user2 = sc.nextInt();
		if(user1 == user2) // 둘이 같을 경우
			System.out.println("비겼다.");
		else if(user1 == 1) {// 둘이 다른 경우
				if(user2 == 2)
					System.out.println("user2의 승리");
				else // user2 == 3
					System.out.println("user1의 승리");
		}
		else if(user1 == 2) {
				if(user2 == 1)
					System.out.println("user1의 승리");
				else // user2 == 3
					System.out.println("user2의 승리");
		}
		else if(user1 == 3) {
				if(user2 == 1) 
					System.out.println("user2의 승리");
				else // user2 == 2 
					System.out.println("user1의 승리");
		}

	}
}
