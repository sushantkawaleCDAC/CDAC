package org.map;
import java.util.HashMap;
public class HashMap1 {

	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<>();
//		           key, value   
//		Insertion(add key & value pair)
		map.put("India",120);
		map.put("Chaina", 80);
		map.put("US", 50);
		map.put("UK", 111);
		
		System.out.println(map);
//		map.putIfAbsent("UK",111);
//		System.out.println(map);
		
//		Update the value
		map.put("India", 100);
		System.out.println(map);
//		get()==>get value associated with key
		
		System.out.println(map.get("UK"));
		
//		remove()==> remove the key value pair
		System.out.println(map.remove ("Chaina", 80));
		System.out.println(map);
		
//		contains key/value==> check contains
		System.out.println(map.containsKey("India"));
		
//		size==> get number of key/value pairs in the map
		System.out.println(map.size());
		
		
	}

}
