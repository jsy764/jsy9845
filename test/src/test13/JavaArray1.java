package test13;

import java.util.Scanner;

public class JavaArray1 {
	
	public static void main(String[] args) {
	// 변수 : 값(데이터, 주소 등등)을 저장하기 위한 메모리 공간
	
//	int a=10;
//	a=20;
	//배열 : 같은 데이터 타입의 연속적인 메모리 공간
	// 			  다른말로 -> 변수공간 여러개를 연속적으로 사용
	
	//자바스크립트 배열 let arr=[]; let arr=new Array();
	//							const arr={1,"aaa",3.31,4];
	
	//자바 배열 선언 방법
//	int[] arr = new int[5]; // 5개 공간으로 이루어진 배열 선언
//	int[] arr2 = new int[] {1, 20, 50, 15}; // 4개 공간 배열 선언
//	
//	arr[2]=20;//arr의 세번째 공간에 20저장
//	System.out.println(arr[2]);
//	arr[0]=10;
//	arr[1]=30;
//	arr[3]=40;
//	arr[4]=60;
//	
//	for(int i=0; i<5; i++) {
//		System.out.println(arr[i]);
//	}
//	// 배열의 각각의 공간을 표현하려면 인덱스로 표현해야한다.
//	// 인덱스는 0부터 시작한다.
//	// 그래서 반복문의 초기값은 0으로 지정하면 된다.
//	// 반복문의 조건식은 배열인덱스의 마지막까지 표현될 수 있게 하면 된다.
//	// 배열의 크기(공간갯수)가 8이라면 마지막 인덱스는 7
//	// 조건식<=7 하면된다.
//	for(int j=0; j<4; j++) {
//		System.out.println(arr2[j]);
//	}
	
	int[] apple = new int[10];
	// 참조변수를 사용할때 배열이면 인덱스 객체인경우는 .접근연산자이다.
//	Scanner[] ab = new Scanner[50];
//	ab[0]=new Scanner(System.in);
	//Scanner라는 이름의 클래스 타입이다.
	
	Scanner sc = new Scanner(System.in);
	// 배열에 데이터 입력
	for(int i=0; i<=9; i++) {
		System.out.print("정수 입력 : ");
		apple[i] = sc.nextInt();
	}
	//apple.length -> 배열의 크기(공간갯수)
	// 실수데이터는 정확도가 100%가 아니라 잘못처리 될 수도 있다.
	for(int i=0; i<apple.length; i++) {
		System.out.println("배열값 : "+apple[i]);
	}
	}
}
