package test17;

import java.util.Scanner;

public class JavaTest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 문제1.
		// 학생 5명의 시험 성적을 키보드를 통해 입력 받고 평균 점수를 구하여 출력해라. 반드시 시험성적은 배열에 저장.
//		int[] score = new int[5];
//		float total = 0, avg = 0;
//		for(int i=0; i<5; i++) {
//			System.out.print("학생들의 성적 입력 : ");
//			score[i]=sc.nextInt();
//			total += score[i];
//		}
//		avg = total/score.length;
//		System.out.println("학생들의 평균점수 : "+avg);
		
		// 2. 알파벳 문자 하나를 입력하세요. 입력한 알파벳으로 시작하는 단어를 모두 찾아 출력하세요. 그리고 출력한 단어가 총 몇개인지 출력하세요.
		
		String[] word = new String[] {
				"apple", "banana", "cherry", "date", "elderberry", 
	            "fig", "grape", "honeydew", "kiwi", "lemon", 
	            "mango", "nectarine", "orange", "papaya", "quince", 
	            "raspberry", "strawberry", "tangerine", "ugli", "vanilla", 
	            "watermelon", "xigua", "yam", "zucchini", "avocado", 
	            "blueberry", "cantaloupe", "dragonfruit", "apricot", "blackberry", 
	            "coconut", "dragonfruit", "eggplant", "feijoa", "grapefruit", 
	            "huckleberry", "iceplant", "jackfruit", "kiwifruit", "lime", 
	            "mangosteen", "nectar", "orange", "peach", "pineapple", 
	            "pear", "plum", "pomegranate", "pear", "lime", 
	            "apricot", "banana", "papaya", "melon", "peach", 
	            "plum", "raspberry", "blueberry", "citrus", "mango", 
	            "blackcurrant", "cucumber", "fennel", "grape", "strawberry", 
	            "apricot", "blackberry", "currant", "kiwi", "orange", 
	            "lemon", "watermelon", "melon", "tangerine", "apple", 
	            "date", "elderberry", "fruit", "peach", "fruit", 
	            "apple", "cherry", "fig", "honeydew", "jackfruit", 
	            "papaya", "blueberry", "plum", "pomegranate", "grape", 
	            "avocado", "kiwi", "lemon", "watermelon", "tangerine", 
	            "strawberry", "dragonfruit", "lime", "pear", "peach"
		};
//		System.out.print("문자 입력 : ");
//		char ch = sc.next().charAt(0);
//		int num=0;
//		for(int i=0; i<word.length; i++) {
//			if(word[i].charAt(0)==ch) {
//				System.out.println(word[i]);
//				num++;
//			}
//		}
//		System.out.print("출력한 단어의 개수 : "+num);
		
//		System.out.print("알파벳 입력 : ");
//		char alp = sc.nextLine().toLowerCase().charAt(0); // 알파벳을 무조건 소문자로 변환
//		
//		int total=0;
//		
//		for(String str : word) {
//			if(str.charAt(0) == alp) {
//				System.out.println(str); total++;
//			}
//		}
//		System.out.println("총 단어 갯수 : "+total);
		
		
		// 문제3. 영화관 예약 사이트를 만들려고 한다. 영화관에 관별로 좌석수가 다르다. 3관의 좌석수는 96개(8줄 12열)이다. 좌석에 예약완료 된 곳은 1로 표시 비어있는 좌석은 0으로 표시
		// 몇명 예약할것인지 인원수를 입력하면 연속적으로 비어있는 자리로 지정해준다. 몇번째 좌석에 예약이 되었는지 출력
		
		int y=0, x=0;
		System.out.print("인원수 입력 : ");
		int num=sc.nextInt();
		int[][] arr = new int[8][12];
		for(y=0; y<8 ;y++) {
			for(x=0; x<12; x++) {
				arr[y][x]=(int)(Math.random()*2+0);
			}
		}
		int n=num;
		for(y=0; y<8; y++) {
			for(x=0; x<12; x++) {
				if(arr[y][x]==0)
					num--;
				if(arr[y][x]!=0)
					num = n;
				if(num==0) {
					if(x>=1)
					System.out.printf("좌석[%d][%d]에 배치되었습니다.", y+1, x-n+1);
					if((x-n+1)<1)
					System.out.printf("좌석[%d][%d]에 배치되었습니다.", y, 10-(x-n+1));
				}
			}
		}
		System.out.println();
		for(y=0; y<8; y++) {
			for(x=0; x<12; x++) {
				System.out.print(arr[y][x]);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}

}
