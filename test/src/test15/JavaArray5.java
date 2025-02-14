package test15;

public class JavaArray5 {

	public static void main(String[] args) {
		// 1차원 배열 : 같은 배열의 변수가 연속적으로 이루어진 구조
		// 2차원 배열 : 같은 타입의 1차원배열이 여러개로 이루어진 구조
		
		int q=10;
		int as=20;
		int gf=232;
		
		int[] a = new int[] {3, 4, 5}; // 3의 크기를 가진 1차원 배열
		int[] b = new int[] {1, 20, 60}; // 3의 크기를 가진 1차원 배열
		int[] c = new int[] {23, 98, 54}; // 3의 크기를 가진 1차원 배열
		// A반 학생의 성적 -> 1차원 배열
		// 1학년 전체 학생성적 -> 2차원 배열

		// int[][] abc = new int[2][3];
		// int[][] abc = new [][]{{1,2}{3,4}}
		int [][] abc = new int [][] {a, b, c};
		System.out.println(abc[0][0]);
		System.out.println(abc[0]);
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(abc[i][j]+" ");
			}
			System.out.println();
		}
		
		int[][] arr = new int[3][4]; // 크기는 3, 4
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		arr[1][0] = 50;
		arr[1][3] = 100;
		arr[2][1] = 40;
		
		for(int i=0; i<3; i++) {
			for(int j=0;j<4;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int i=0; i<arr.length; i++){
		 	 for(int j=0; j<arr[i].length; j++){
		 		 System.out.print(arr[i][j]+" ");
		 	 }
		 	 System.out.println();
		}
		
		// 1차원 배열 -> 향상된 for : for(int a: array){}
		
		for(int i=0; i<arr.length; i++) {
			for(int num: arr[i]) {
				System.out.print(num+" ");
			}
			System.out.println();
		}
		
		for(int[] tmp : arr) {
			for(int num: tmp) {
				System.out.print(num+" ");
			}
			System.out.println();
		}
		
					
		
		
		
		
		
		
		
	}

}
