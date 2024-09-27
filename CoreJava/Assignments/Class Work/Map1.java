package org.map;
import java.util.Map;
import java.util.HashMap;
public class Map1 {

	public static void main(String[] args) {
		Map<String, Integer> number = new HashMap<>();
		number.put("One", 1);
		number.put("Two", 2);
		number.put("Three", 3);
		number.put("Four", 4);
		number.put("Five", 5);
		
		
		
		
		number.putIfAbsent("Two", 4);
		System.out.println(number);
		for (Map.Entry <String, Integer> e: number.entry		);  c 

	}

}
