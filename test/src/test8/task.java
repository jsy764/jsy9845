package test8;

import java.util.Scanner;

public class task {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 가위바위보 게임 만들기
		// 1.가위 2.바위 3.보
		// 내가 이겼는지, 졌는지, 비겼는지 출력
		int user1 = (int)(Math.random()*3+1);
		System.out.println("1.가위 2.바위 3.보");
		System.out.print("입력 : ");
		int user2 = sc.nextInt();
		if(user1 == user2) // 둘이 같을 경우
			System.out.println("비겼다.");
		else if(user1 == 1) { // 둘이 다를 경우
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
