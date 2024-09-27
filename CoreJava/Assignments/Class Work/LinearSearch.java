package org.Array.Search;
import java.util.*;
public class LinearSearch {

	public static void main(String[] args) {
		
		int arr[]= {11,22,33,44,55,66,};
		System.out.println("Array "+Arrays.toString(arr));
		System.out.println("Enter Element: ");
		Scanner sc = new Scanner(System.in);
		
		
		 int target=sc.nextInt();
		 
		 int index=linearSearch(arr,target);
		  
		 if(index !=-1) {
			 System.out.println("Element "+target+" Found at index: "+index);
		 }
		 else {
			 System.out.println("Element "+target+" Not Found");
		 }
				 
		 sc.close();
	}

	private static int linearSearch(int[] arr, int target) {
		for(int i = 0; i < arr.length;i++){
		if(arr[i] ==target) {
			return i;
		}
	}
	return -1;

}
}
