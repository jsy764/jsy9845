package test;

public class javaType {
	public static void main(String[] args) {
		int num = 20;
		float pi=3.14f;
		
		pi = num; // 자동 형변환
		num = (int)pi; //강제 형변환 - 일시적 타입 변환
		
//		과제
//		담배 한개피에 수명이 2분 단축된다.
//		어떤 사람이 담배를 20년동안 피웠다.
//		이 사람이 하루에 몇개피 피우는지 (변수값에 저장)
//		
//		이사람이 단축된 수명이 총 몇분인가? 출력
//		이사람이 단축된 수명은 총 몇 시간인가? 출력
//		이사람이 단축된 수명이 총 몇일인가? 출력
		
		int smoke_num = 3;
		int minute = smoke_num*2*365*20; // 단축된 수명 분
		int time = minute/60; // 단축된 시간
		int day = time/24; // 단축된 일수
		System.out.println(minute); // 단축된 분
		System.out.println(time); // 단축된 시간
		System.out.println(day); // 단축된 일수
	}
}
