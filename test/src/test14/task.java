package test14;

public class task {

	public static void main(String[] args) {
		int[] board = new int[25];
		int num, n=0;
		while(true) {
			num = (int)(Math.random()*50+1);
			board[n] = num;
			if(board[24]!=0)
				break;
			n++;
		}
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.printf("%2d ", board[i*5+j]);
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}
