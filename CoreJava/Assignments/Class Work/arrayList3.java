package org.ArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class arrayList3 {

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
//		replace the element		***set***
		list.set(0, 11);        
		
		System.out.println(list);
//		***contains***==> it is check the element are present in the list
//		if element are present it will return true; else false
		System.out.println(list.contains(12));
		
//		Iterator==> Using for each loop
		for(Integer element:list) {
			System.out.println("foreach element is: "+element);
		}
//		Using Iterator ==> will be used to iterate any Collection object
		Iterator<Integer> it= list.iterator();
		while(it.hasNext()) {
			System.out.println("iterator: "+it.next());
		}
		
		
	}

}

