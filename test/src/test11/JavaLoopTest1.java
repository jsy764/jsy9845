package test11;

import java.util.Scanner;

public class JavaLoopTest1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		문제1
//		정수 한개씩 계속 입력 받기
//		입력하다가 0을 입력하면
//		지금까지 입력한 모든 숫자의 합을 출력
//		int num=0, sum=0;
//		while(true) {
//			System.out.print("숫자 입력 : ");
//			num = sc.nextInt();
//			sum+=num;
//			if(num == 0)
//				break;
//		}
//		System.out.println(sum);
//		문제2
//		컴퓨터와 가위바위보 게임하기
//		내가 10번을 이길때까지 계속 게임하기
//		10번 이기면 그동안 몇번 패배하고 몇번 비겼는지 출력
//		int user, com, num=0, num1=0, num2=0;
//		boolean b = true;
//		while(true) {
//			System.out.print("1.가위 2.바위 3.보 : ");
//			user=sc.nextInt();
//			com=(int)(Math.random()*3+1);
//			if(user==com)
//				num1++;
//			else if(b==((user==1&&com==3)||(user==2&&com==1)||(user==3&&com==2)))
//				num++;
//			else
//				num2++;
//			
//			if(num==10)
//				break;
//		}
//		System.out.println("비긴 수 : "+num1);
//		System.out.println("패배한 수 : "+num2);
//		문제3
//		컴퓨터와 주사위 게임을 한다. 각각 주사위 2개를 던져서 주사위 합이 큰쪽이 이긴다.
//		단, 주사위 2개가 같은 숫자라면 합이 작아도 이긴다.
//		예) 나 - 3,4 컴 - 1,3 내가 이김
//			나 - 5,6 컴 - 1, 1 컴퓨터이김
//		5판을 진행 했을때 몇승 몇패 몇무인지 출력
//		int user1, user2, com1, com2, i, num1, num2, win=0, lose=0, draw=0;
//		for(i=0; i<5; i++) {//user는 사람 com은 컴퓨터
//			user1=0; user2=0; com1=0; com2=0; num1=0; num2=0;
//			user1 = (int)(Math.random()*6+1);
//			num1 += user1;
//			user2 = (int)(Math.random()*6+1);
//			num1 += user2;
//			com1 = (int)(Math.random()*6+1);
//			num2 += com1;
//			com2 += (int)(Math.random()*6+1);
//			num2 += com2;
//			if(num1>num2 || user1==user2)
//				win++;
//			else if(num2>num1 || com1==com2)
//				lose++;
//			else if(num1==num2 || (user1==user2 && com1==com2))
//				draw++;
//		}
//		System.out.println("이긴 횟수 : "+win);
//		System.out.println("진 횟수 : "+lose);
//		System.out.println("비긴 횟수 : "+draw);
		
//		베스킨라빈스 31게임 만들기
//		나와 컴퓨터 둘이서 진행
//		31을 제시하는쪽이 패배
//		나부터 시작한다.
//		숫자를 몇개를 제시할 것인지 갯수를 입력하면 자동으로 숫자가 나온다.
//		컴퓨터는 렌덤을 이용해서 몇개 재시험할것인지 해야한다.
//		숫자는 1개부터 3개까지 가능
		int user=0, com=0, num=1;
		while(true) {
			System.out.print("숫자 입력 : ");
			user = sc.nextInt();
			for(int i=0; i<user; i++) {
				System.out.print(num+" ");
				num++;
				if(num>31) {
				System.out.println("컴퓨터 승리!!");
					return;
				}
			}
			System.out.println();
			System.out.print("컴퓨터 입력 : ");
			com = (int)(Math.random()*3+1);
			for(int i=0; i<com; i++) {
				System.out.print(num+" ");
				num++;
				if(num>31) {
				System.out.println("유저 승리!!");
					return;
				}
			}
			System.out.println();
		}
		
		
			
		
		
		
	}
}
