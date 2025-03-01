package customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Scanner;

import store.Banana;
import store.Fruit;
import store.Grape;
import store.Orange;

public class MainMethod {

	public static void main(String[] args) {
		// 바나나와 포도, 오렌지 갯수가 많이 필요하다면???
		// 바나나 - 15개, 포도 - 6개, 오렌지 - 54개
		// 망고, 수박, 토마토 등등등
//		Banana[] ba = new Banana[15];
//
//		ba[0].makeJuice(); // 아직 바나나 객체가 없기에 null이기에 오류
//		
//		ba[0] = new Banana(2500, 500);
//		ba[1] = new Banana(3500, 500);
//		ba[2] = new Banana(5200, 500);
//		ba[3] = new Banana(5200, 500);
//		
//		ba[0].makeJuice();
		
		// 다형성 - 하나의 타입으로 여러타입을 다룰 수 있다.
		// 상속 관계, Implements
		
//		Fruit f = new Banana(2500, 500);
//		f.makeJuice();
//		Fruit g = new Grape(3500, 400);
//		g.makeJuice();
		
		Fruit[] menu = new Fruit[10];
		
		// 데이터베이스 연결하기(드라이브 로드)
		// com.mysql.cj.jdbc.Driver
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패");
			e.printStackTrace();
		}
		// 계정 로그인 - 주소, DB명, 계정명, 비밀번호
		String user = "jsy9845";
		String password = "1234";
		String url = "jdbc:mysql://localhost:3306/jsy9845";
		
		// 데이터베이스와 연결한 객체를 저장해둬야 한다.
		Connection conn = null; // 데이터베이스 연결 객체 저장할곳
		
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 쿼리문 작성하여 보내고 받기
		// select * from stor_menu1;
		
		String sql = "select * from store_menu1";
		// 작성한 쿼리문을 데이터베이스에 보내려면
		// Statement, PreparedStatement
		
		Statement st=null; // 쿼리문 보낼때 필요
		ResultSet rs=null; // 조회 결과 받을때 필요
		
		try {
			st=conn.createStatement(); // 쿼리문 전송하기 위한 준비
			rs=st.executeQuery(sql); // 쿼리문 보내고 결과 받기
			
			// rs.next()를 통해서 조회된 결과값이 존재하는지 확인
			for(int i=0; rs.next(); i++) {
				
				int cost = rs.getInt("cost"); // 금액
				int cap = rs.getInt("capacity"); // 용량
				String type = rs.getString("fruit_type"); // 과일종류
				
				if(type.equals("banana"))
					menu[i] = new Banana(cost, cap);
				if(type.equals("grape"))
					menu[i] = new Grape(cost, cap);
				if(type.equals("orange"))
					menu[i] = new Orange(cost, cap);
			}
		} catch (SQLException e) {
			System.out.println(" 쿼리문 조회 실패 ");
			e.printStackTrace();
		}
		
		// 데이터베이스에서 조회한 데이터들을 바나나, 포도, 오렌지 객체로 저장될 수 있게 하기

		
//		menu[0] = new Banana(2500, 250);
//		menu[1] = new Banana(3000, 400);
//		menu[2] = new Orange(3500, 400);
//		menu[3] = new Banana(3500, 400);
//		menu[4] = new Grape(4500, 350);
//		menu[5] = new Banana(4500, 550);
//		menu[6] = new Grape(5000, 450);
//		menu[7] = new Orange(4000, 350);
//		menu[8] = new Orange(5000, 550);
//		menu[9] = new Grape(6000, 600);
		
//		menu[2].makeJuice();
//		menu[6].pieceFruit();
		
		Buyer ctm1 = new Buyer(10000); // 구매자
		
		for(int i = 0; i<menu.length; i++) {
			System.out.println((i+1)+"번째 "+menu[i]);
			// 출력 결과 -> 바나나 2500원 350ml
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("구매번호 : ");
		int num = sc.nextInt();
		
		// 결제 진행하고 언제 주스를 사먹었는지 어떤 주스인지 기록
		ctm1.setMoney(ctm1.getMoney()-menu[num-1].getCost());
		// 내가 만약 5번을 선택했다면 num-1은 4가 되니까 4번의 인덱스의 객체를 선택한 것이고 해당 객체의 getCost니까 cost 변수의 값을 가지고 온다.
		// ctm1.getMoney는 get으로 시작하는 메서드 변수의 값 출력이니까 10000을 가지고온다. 그러니까 10000-3500 된다. 이것의 결과 6500을 setMoney를 통해
		// Money 변수에 저장하게되니 money 변수는 6500을 가진다.
		ctm1.setBuyDate(new Date());
		ctm1.setItem(menu[num-1]);
		
		System.out.println(ctm1);
		
		// 출력 결과 -> 보유 머니 : 10000원
		
		//System.out.println(" 보유머니 : "+ctm1.getMoney());
	}

}

/*

	자바프로그램에서 데이터베이스 사용하기
	1. 데이터베이스와 연결하기 위한 드라이버 로드
	2. 계정 로그인
	3. 쿼리문 작성하여 주고 받고 하기


*/