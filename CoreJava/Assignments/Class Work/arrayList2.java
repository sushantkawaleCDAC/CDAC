package org.ArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class arrayList2 {

	public static void main(String[] args) {
		List<Integer> list =new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		
		System.out.println(list);
		list.remove(1); // index 1 remove
		System.out.println(list);
		list.remove(Integer.valueOf(30));//remove element
		System.out.println(list);
		
//		***clear*** clear whole list
		
		list.clear();
		System.out.println(list);
	
	}

}

