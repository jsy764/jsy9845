package test8;

import java.util.Scanner;

public class JavaIf4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Math.random()은 0.00000~ 0.9999~까지이다.
		// 곱하기 계산과 더하기 계산으로 범위를 지정할 수 있다.
//		int num = (int)(Math.random()*10)+1;
//		System.out.println(num);
		
//		int user=0, coin=0;
//		System.out.print("1.앞면, 2뒷면 : ");
//		user = sc.nextInt();
//		
//		coin= (int)(Math.random()*2+1);
//		
//		if(coin == user) {
//			System.out.println("정답!!");
//		} else {
//			System.out.println("땡!!");
//		}
		
		//컴퓨터가 동전을 15개 가지고 있다.
		//컴퓨터가 제시한 동전갯수가 짝인지 홀인지 맞추는 게임
		// 1.짝 2.홀
//		int coin = (int)(Math.random()*15+1);
//		String string;
//		if(coin%2==0) {
//			string = "짝";
//		} else {
//			string = "홀";
//		}
//		System.out.print("입력 : ");
//		String s = sc.next();
//		if(s.equals(string)) {
//			System.out.println("정답!");
//		} else {
//			System.out.println("땡!");
//		}
		// 주사위게임(육면체)
		// 컴퓨터 주사위를 던진다.
		// 주사위값이 3이하라면 작은값, 주사위값이 4이상이라면 큰값이다.
		// 1.작다 2.크다
		// 주사위값이 작은값인지 큰값인지 맞추세요.
		System.out.print("1.작다 2.크다 : ");
		int user=sc.nextInt();
		
		int dice = (int)(Math.random()*6+1);
		
		if(user == 1||user == 2) {
			if(dice<=3 && user == 1)
				System.out.println("작은값 정답!!");
			else if(dice>=4 && user==2)
				System.out.println("큰값 정답!!");
			else
				System.out.println("땡!!");
		} else {
			System.out.println("잘못입력했습니다.");
		} 
		

	}
}
