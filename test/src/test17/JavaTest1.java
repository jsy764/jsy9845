package test17;

import java.util.Arrays;
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
		
//		int y=0, x=0;
//		System.out.print("인원수 입력 : ");
//		int num=sc.nextInt();
//		int[][] arr = new int[8][12];
//		for(y=0; y<8 ;y++) {
//			for(x=0; x<12; x++) {
//				arr[y][x]=(int)(Math.random()*2+0);
//			}
//		}
//		int n=num;
//		for(y=0; y<8; y++) {
//			for(x=0; x<12; x++) {
//				if(arr[y][x]==0)
//					num--;
//				if(arr[y][x]!=0)
//					num = n;
//				if(num==0)
//					System.out.printf("좌석[%d][%d]에 배치되었습니다.", y, x);
//			}
//		}
//		System.out.println();
//		for(y=0; y<8; y++) {
//			for(x=0; x<12; x++) {
//				System.out.print(arr[y][x]);
//			}
//			System.out.println();
//		}
		// 문제 4. 도서관의 관리자로 대출한 사람들의 기록을 관리하고 있다. 도서관에서 여러사람들이 책을 대출하며 각 사람은 여러권의 책을 대출할 수 있다.
				// 각 사람이 대출한 책의 제목을 배열로 저장하고 그 사람의 대출 내역을 출력하는 프로그램을 작성하시오.
				// 조건
				// - 도서관에는 3명의 이용자가 있고 최대 5권까지 대출
				// - 각 이용자의 이름과 대출한 책 제목을 출력
				// # 이용자의 이름과 책 제목은 키보드를 통해 입력해도 되고 배열 선언시 초기값 지정도 된다.
//		String[][] library = new String[][]{{"김철수", "책먹는 여우", "여우 전화박스"}, {"최유리", "나의 낡은 오렌지 나무", "선녀와 나무꾼"}, {"최수영", "금도끼 은도끼"}};
//		for(int i=0; i<library.length; i++) {
//			System.out.print("이용자 : "+library[i][0]);
//			for(int k=1; k<library[i].length; k++) {
//				System.out.print(" "+library[i][k]);
//			}
//			System.out.println();
//		}
		
//		String[][] book = new String[][] {
//			{"이순신", "자바", "C언어", "html"},
//			{"김유신", "C++", "컴퓨터 개론", "삼국지1", "삼국지2"},
//			{"박문수", "홍길동전", "심청전", "안데르센동화1"}
//		};
//		for(String[] info : book) {
//			for(String tmp: info) {
//				System.out.print(tmp+" ");
//			}
//			System.out.println();
//		}
		
		// 문제5. 농장 수확량을 계산하는데 농장의 일일 수확량을 배열에 저장했다. 전체 수확량을 구하고 평균 수확량을 구하세요 그리고 가장 많은 수확량은 얼마인지 출력하는데 힌트:ㅈㄹ
		int[] harvest = {9, 10, 11, 8, 7, 5};
//		float total = 0, avg=0;
//		for(int i=0; i<6; i++) {
//			total += harvest[i];
//		}
//		avg=total/harvest.length;
//		int max=0;
//		for(int i=0; i<harvest.length; i++) {
//			if(harvest[i]>max)
//				max = harvest[i];
//		}
//		System.out.println("전체 수확량 : "+(int)total);
//		System.out.println("평균 수확량 : "+avg);
//		System.out.println("전체 수확량 : "+max);
		
		int total=0;
		for(int am:harvest) {
			total = total+am;
		}
		System.out.println("전체 수확량 : "+total);
		float avg=total/(float)harvest.length;
		System.out.println("평균 수확량 : "+avg);
		
		Arrays.sort(harvest); // 정렬 오름차순
		
		System.out.println("가장 많은 수확량 : "+harvest[harvest.length-1]);
		
		
		
		
		
	}

}
