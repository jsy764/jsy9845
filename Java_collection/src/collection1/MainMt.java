package collection1;

import java.util.ArrayList;

public class MainMt {

	public static void main(String[] args) {
//		MyArray a = new MyArray();
//		a.add(100);
//		a.add(20);
//		a.add(50);
//		a.add(1232);
//		a.add(543);
//		
//		System.out.println(a.get(2));
		
		ArrayList list = new ArrayList();
		list.add(100);
		list.add(2313);
		list.add("장미란");
		list.add("포카칩");
		
		System.out.println(list.size());
		
		System.out.println(list.get(2));
		
		System.out.println(list.indexOf("포카칩"));
		
		list.remove(0); // 인덱스를 지정하여 해당 데이터 삭제
		list.remove("포카칩");
		System.out.println(list);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println(list.contains("장미란"));
		
		list.clear(); // 배열모두 삭제
	}

}
