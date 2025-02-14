package test15;

import java.util.Arrays;

public class JavaArray8 {

	public static void main(String[] args) {
		int[][][] arr = new int[3][2][2];
		arr[0][0][1] = 10;
		arr[0][1][1] = 20;
		arr[0][1][0] = 30;
		arr[1][0][0] = 50;
		arr[1][0][1] = 60;
		arr[2][0][0] = 100;
		
		System.out.println(Arrays.toString(arr[0][0]));
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length; j++) {
				for(int k=0; k<arr[i][j].length; k++) {
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
