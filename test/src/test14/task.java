package test14;

public class task {

	public static void main(String[] args) {
		int[] board = new int[25];
		int num;
		while(true) {
			int i = 0;
			num = (int)(Math.random()*50+1);
			if(board[i]!=num) {
				board[i] = num;
				i++;
			}
			if(board[24]!=0)
				break;
		}
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(board[i*5+j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}
