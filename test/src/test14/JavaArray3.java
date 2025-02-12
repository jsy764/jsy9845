package test14;

import java.util.Arrays;
import java.util.Collections;

public class JavaArray3 {

	public static void main(String[] args) {
//		int[] number = new int[] {10, 20, 30, 44, 55, 66, 100, 2323};
//		
//		for(int num : number) {
//			System.out.println(num);
//		}
		// 배열의 인덱스 사용이 불가능하고 차례대로 가져오는 방식이다.
		// 배열의 데이터를 변경하거나 삭제하는것이 불가능
		
		// tall배열은 A반 학생들의 키를 저장한것이다. A반의 평균키보다 큰 키를 찾아서 출력해라.
//		float[] tall = new float[] {167.2f, 163.4f, 175.7f, 173.8f, 158.3f};
//		float total=0;
//		for(int i=0; i<5; i++) {
//			total += tall[i];
//		}
//		for(int i=0; i<5; i++) {
//			if(tall[i]>total/5)
//				System.out.print(tall[i]+" ");
//		}
		
//		int[] num = new int[] {10, 20, 30, 40, 50, 60, 70};
//		
//		System.out.println(Arrays.toString(num));
//		// 자바에서 데이터 출력 메서드 이름은 toString
//		
//		int[] a = new int[7];
//		System.out.println(Arrays.toString(a));
//		
//		// 배열 복사
//		// arraycopy(복사배열, 복사배열시작인덱스, 저장배열, 저장시작인덱스, 크기)
//		System.arraycopy(num, 0, a, 0, num.length);
//		System.out.println(Arrays.toString(a));
//		
//		// 배열 비교
//		boolean isSame = Arrays.equals(num, a);
//		System.out.println(isSame);
		
		// 배열 정렬
		int[] arr = new int[] {45, 23, 53, 47, 32, 56, 13, 24, 46};
		System.out.println("===정렬전===");
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("===정렬후===");
		System.out.println(Arrays.toString(arr));
		
		Integer[] arr2 = {5,4,1,2,3};
		
		Arrays.sort(arr2, Collections.reverseOrder());
		// comparator 구현 필요
		String[] names = {"이순신", "이성계", "김춘추", "정약용", "문익점"};
		System.out.println(Arrays.toString(names));
		
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		
		Arrays.sort(names, Collections.reverseOrder());
		System.out.println(Arrays.toString(names));
		
		
		
		
		
	}

}
