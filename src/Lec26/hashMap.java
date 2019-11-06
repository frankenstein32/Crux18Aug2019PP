package Lec26;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class hashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> map = new HashMap<>();

		// put
		map.put("India", 10);
		map.put("USA", 2);
		map.put("UAE", 3);
		map.put("Africa", 4);
		map.put("Pakistan", 0);

		System.out.println(map);

		// Get
		int temp = map.get("India");
		System.out.println(temp);

		System.out.println(map.get("Paris"));
		System.out.println(map.get("Tokyo"));

		// containsKey
		System.out.println(map.containsKey("africa"));

		// HashSet
		Set<Integer> set = new HashSet<>();

		set.add(1);
		set.add(1);

		System.out.println(set.contains(1));

		// keySet
		Set<String> keyset = map.keySet();
		ArrayList<String> new_keyset = new ArrayList<>(keyset);

		// Traverse
		for (String val : new_keyset) {

			System.out.println(val + " -> " + map.get(val));
		}

		System.out.println(map.getOrDefault("Paris", -1));
		
		
		map.remove("Paris");
		
		//Remove
		System.out.println(map);

	}

}
