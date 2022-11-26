package hashmapDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("India", 120);
		map.put("China", 150);
		map.put("US", 30);
		
		System.out.println(map);
		
		if(map.containsKey("India")) {
			System.out.println(map.get("India"));
		}
		
		for( Map.Entry<String, Integer> e: map.entrySet()) {
			System.out.println(e);
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
		
		Set<String> keys = map.keySet();
		for(String key:keys) {
			System.out.println(key);
			System.out.println(map.get(key));
		}
		
		map.remove("China");
		System.out.println(map);
	}

}
