package generic3;

public class MainMt {

	public static void main(String[] args) {
		매운새우깡 매운새우깡1 = new 매운새우깡("매운새우깡", 12000);
		예감 예감1 = new 예감("예감", 10000);
		포스틱 포스틱1 = new 포스틱("포스틱", 11000);
		
		SnackBox<포스틱>포스틱 = new SnackBox<>();
		포스틱.makeBox(포스틱1);
		SnackBox<매운새우깡>매운새우깡 = new SnackBox<>();
		매운새우깡.makeBox(매운새우깡1);
		SnackBox<예감>예감 = new SnackBox<>();
		예감.makeBox(예감1);
		
		포스틱 포스틱2 = new 포스틱("포스틱", 15000);
		포스틱.makeBox(포스틱2);
		매운새우깡 매운새우깡2 = new 매운새우깡("매운새우깡", 14000);
		매운새우깡.makeBox(매운새우깡2);
		
	}

}
