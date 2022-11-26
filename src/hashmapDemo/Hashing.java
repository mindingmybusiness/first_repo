package hashmapDemo;

import java.util.HashSet;
import java.util.Iterator;

public class Hashing {
	
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(1);
		
		if(set.contains(1)){
			System.out.println("Contains 1");
		}
		System.out.println(set);
		System.out.println(set.size());
		
		set.remove(1);
		System.out.println(set);
		set.add(1);
		
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
