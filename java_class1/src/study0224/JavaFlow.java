package study0224;

public class JavaFlow {
	
	static void total(Game g1, Game g2, Game g3) {
		int tot = g1.cnt+g2.cnt+g3.cnt;
		System.out.println("총합 : "+tot);
	}
	public static void main(String[] args) {
		Game g1 = new Game();
		Game g2 = new Game("문명", 435);
		Game g3 = new Game("사이버펑크", 3412);
		total(g1, g2, g3);
		
	}

}
