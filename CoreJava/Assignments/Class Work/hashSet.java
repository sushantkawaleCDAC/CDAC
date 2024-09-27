package org.HashSet;
import java.util.Set;
import java.util.HashSet;
public class hashSet {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(10);						//add()
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		System.out.println( set);
	    set.remove(50);						//remove()
		System.out.println(set);
		System.out.println(set.contains(30));//contains()
		
		System.out.println("set isEmpty: "+set.isEmpty());  //isEmpty()
		
		System.out.println("Size: "+set.size());			//size()
		
		set.clear();
		System.out.println( set);
		
		
//		System.out.println(set.iterator());
	}

}

