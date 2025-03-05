package exception3;

public class MainMt {

	public static void main(String[] args) {
		int [] arr = {10, 40, 50, 20};
		try {
			System.out.println(arr[5]);
		} catch (Exception e) {
			System.out.println("배열의 범위를 넘어섰습니다.");
		}
		String str = "123ab";
		int num = 0;
		try {
			num = Integer.parseInt(str); // Integer.parseInt는 문자열 -> 정수변환
		} catch(Exception f) {
			System.out.println("정수를 입력해라");
		}
		
		String word = "good Bye!!";
		try {
			System.out.println(word.substring(word.indexOf("B")));
		} catch(Exception g) {
			System.out.println("없는 문자입니다.");
		}
		try {
			System.out.println(word.substring(word.indexOf("m")));
		} catch(Exception h) {
			System.out.println("없는 문자입니다.");
		}
		
		
		

	}

}
