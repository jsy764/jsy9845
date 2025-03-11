package collection7;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MainMt {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("수박", 15000); map.put("바나나", 5400);
		map.put("앵두", 2300); map.put("딸기", 12400);
		
		System.out.println(map);
		
		map.put("수박", 19000);
		System.out.println(map);
		
		if(map.containsKey("수박")) {
			System.out.println("key로 수박 사용중");
		}
		// 포함여부는 contains인데 key, value 각각 있다.
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		System.out.println(map.get("앵두"));
		System.out.println(map.get("참외"));
		
		// 맵에 저장되어있는 특정 key의 value 변경
		map.put("앵두", 3100);
		System.out.println(map);
		
		map.replace("앵두", 4300);
		System.out.println(map);
		// put메서드는 새로운 값 저장 또는 변경
		
		map.put("토마토", 5600);
		System.out.println(map);
		
		map.replace("구아바", 9800);
		System.out.println(map);
		
		Set<String> keys = map.keySet();
		System.out.println(keys);
		
		System.out.println(map.entrySet());
		
		for(Entry<String, Integer> ent : map.entrySet()) {
			System.out.println(ent.getKey()+" "+ent.getValue());
		}

	}

}
