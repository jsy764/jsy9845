package test13;

import java.util.Scanner;

public class JavaHomework {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// 문제 7. 알파벳 찾기(반드시 반복문 사용해서)
		// 알파벳(대문자 또는 소문자 모두 가능하게) 입력
		// 입력한 알파벳이 몇번째 알파벳인지 찾기 - 반드시 for문으로
//		System.out.print("문자 입력 : ");
//		char ch =scan.nextLine().charAt(0);
//		for(int i=1; i<26; i++) {
//			if(ch==(i+64)||ch==(i+96)) {
//				System.out.printf("알파벳 %c는 %d번째 알파벳\n", ch, i);
//				break;
//			}
//		}
		
//		1~9 중의 임의의 숫자 3개를 뽑아낸다. (중복없이)
//	  	 3개의 숫자를 맞추기 해야한다.
//	  	 예) 임의의 숫자 - 7 1 8
//	  	 입력 : 1 2 3
//	  	 결과 : 0스트라이크 1볼 2아웃
//	  	 입력 : 4 7 9
//	  	 결과 : 0스트라이크 1볼 2아웃
//	  	 입력 : 4 1 8
//	  	 결과 : 2스트라이크 0볼 1아웃
		int num1, num2, num3;
		do {
		num1=(int)(Math.random()*9+1);
		num2=(int)(Math.random()*9+1);
		num3=(int)(Math.random()*9+1);
		}while(!(num1 != num2 && num1 != num3 && num2 != num3));
		// 3개의 숫자가 중복없이 1~9 중의 하나를 가진다.
		while(true) {
			System.out.print("정수1 입력 : ");
			int user1=scan.nextInt();
			System.out.print("정수2 입력 : ");
			int user2=scan.nextInt();
			System.out.print("정수3 입력 : ");
			int user3=scan.nextInt();
			
			int str=0, ball=0; // 스트라이크, 볼, 아웃은 계산
			//스트라이크인 경우
			if(num1==user1)str++;
			if(num2==user2)str++;
			if(num3==user3)str++;
			
			//볼인 경우
			if(num1==user2||num1==user3)ball++;
			if(num2==user1||num2==user3)ball++;
			if(num3==user1||num3==user2)ball++;
			
			System.out.printf("%d스트라이크 %d볼 %d아웃\n", str, ball, 3-str-ball);
			if(str==3)break;
		}
	}
}
