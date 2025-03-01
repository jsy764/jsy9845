package interface4;

public class Light implements RemoteCon{

	@Override
	public void turnon() {
		System.out.println("전구가 켜졌다.");
		
	}

	@Override
	public void turnoff() {
		System.out.println("전구가 꺼졌다.");
		
	}

}
