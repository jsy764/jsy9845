package interface4;

public class MainMt {

	public static void main(String[] args) {
		RemoteCon[] rcon = new RemoteCon[] {
				new Aircon(), new Light(),
				new Tv()
	};
	for(RemoteCon con:rcon) {
		con.turnon();
		con.turnoff();
	}
		
	}
}
