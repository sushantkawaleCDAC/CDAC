package org.map;
//***** Iteration In HashMap *****
import java.util.*;
public class HashMap2 {

	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<>();

		map
		.put("India",120);
		map.put("Chaina", 80);
		map.put("US", 50);
		map.put("UK", 111);
		System.out.println(map);
		
	//Important 	
		for(Map.Entry<String,Integer>e : map.entrySet()) {
			System.out.println(e.getKey());
			
			System.out.println(e.getValue());
			
		}
		System.out.println("**********");
		Set<String> Keys = map.keySet();  
		for(String key : Keys) {
			System.out.println(key+ " "+map.get(key));
		}

	}

}
//int arr[] = {11,15,20};
//for(int i=0; i<3;i++) {
//	System.out.print(arr[i]+ " " );
//}
//System.out.println();
//for(int val : arr ) {
//	System.out.print(val+" ");
//}
//for(int val : arr)