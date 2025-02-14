package test15;

public class JavaArray6 {

	public static void main(String[] args) {
		int[][] board = new int[5][3];
		// 3의 크기를 갖는 1차원 배열 5개를 의미한다.
		
		board[0][0]=1; board[1][0] = 4; board[2][0] = 7; 				  board[4][0] = 50;
		board[0][1]=2; board[1][1] = 5;					  board[3][1]=20; board[4][1] = 100;
		board[0][2]=3; board[1][2] = 6; board[2][2] = 10; board[3][2]=30; 
		
		for(int[] pArr : board) {
	// pArr에 저장되는것은 board[0], board[1], board[2], board[3], board[4]
	// board[0]->메모리주소
			for(int num : pArr) {
	// num에 저장되는것 : board[0][0], board[0][1], board[2][] ....
				System.out.print(num+" ");
			}
			System.out.println();
		}

	}

}
