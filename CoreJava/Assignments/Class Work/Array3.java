package org.Array;
import java.util.*;


public class Array3 {
	public static void main(String [] args) {
		String arr []=  {"1,2,34,5,6,7","11","sdfgh"};
		
		String target = "11";
		List<String> list =Arrays.asList(arr);
	    if(list.contains(target)) {
	    	System.out.println(target);
	    }
	}

	public static void main1(String[] args) {
//		Find the specific element  in the arrays
		
		String arr[]= {"sushant","pratik", "Amol", "Duggu"};
		String target =" +sushassnt";
		List<String> list= Arrays.asList(arr);
		
		if(list.contains(target)) {
			System.out.println("Element "+target+" Found");
		}
		else {
			System.out.println("Element "+target+" Not found");
			
			
			
			
			
			
	}
	}

}
