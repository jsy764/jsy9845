package interface4;

public class Aircon implements RemoteCon{

	@Override
	public void turnon() {
		System.out.println("에어컨이 켜졌다.");
		
	}

	@Override
	public void turnoff() {
		System.out.println("에어컨이 꺼졌다.");
		
	}
	
}
