package test15;

import java.util.Scanner;

public class JavaArray7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] board = new int[][]
		{
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,2,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
			
		}; // [13][15]
		
		int x=0, y=0;
		while(true) {
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board[i].length; j++) {
				if(board[i][j] == 1)
					System.out.printf("■");
				if(board[i][j] == 0)
					System.out.printf(" ");
				if(board[i][j] == 2) {
					System.out.printf("@");
					x=j; y=i;
				}
			}
			System.out.println();
			} // 화면 그리기 반복문 끝
			
			// 이동 시키기 w,a,s,d
			System.out.print("방향 입력 : ");
			char key = sc.nextLine().charAt(0);
			
			switch(key) { // if(board[y][x]==1)
					case 'w':
							if(board[y-1][x]==1) break;
							board[y][x]=0;
							y--;
							board[y][x]=2;
							break;
					case 's':
							if(board[y+1][x]==1) break;
							board[y][x]=0;
							y++;
							board[y][x]=2;
							break;
					case 'a':
							if(board[y][x-1]==1) break;
							board[y][x]=0;
							x--;
							board[y][x]=2;
							break;
					case 'd':
							if(board[y][x+1]==1) break;
							board[y][x]=0;
							x++;
							board[y][x]=2;
							break;
					default:
							System.out.println("잘못입력");
			}
				
				
			
		}
		
	}

}
