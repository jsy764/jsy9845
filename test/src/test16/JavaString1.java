package test16;

import java.util.Scanner;

public class JavaString1 {

	public static void main(String[] args) {
		String title = "자바는 즐거워";
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.print("제목 입력 : ");
//		title = scan.next();
		
		System.out.println(title);
		
		System.out.print("나이 : ");
		int age = scan.nextInt();
		
		// scan.nextLine();
		
		System.out.print("이름 : ");
		String name = scan.next();
		
		System.out.print("키 : ");
		int tall = scan.nextInt();
		
		System.out.println(age+" "+name);
		
		// 키보드로 입력하면 버퍼에 쌓인다.
		// next()는 엔터 이전의 버퍼에 쌓여있는 값을 가져온다.
		// nextLine()은 버퍼에 엔터가 있어야 버퍼의 값을 가져온다.
		
		// 파일 불러오기 (읽기)하면 버퍼의 영향을 받을 수도 있다.
		// next()를 이용해서 문자열 입력받는 것이 무조건 답은 아니다.
		// 필요에 의해서는 nextLine을 통해 문자열 입력 받도록 해야한다.
	}

}
