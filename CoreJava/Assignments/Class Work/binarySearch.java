package org.Array.Search;
import java.util.*;
import java.util.Arrays;

public class binarySearch {
	private static int binarySearch(int[] arr, int target) {
		int low = 0;
		int high = arr.length -1;
		while(low <= high) {
			int mid = low + (high - low) / 2;
			
			if(arr[mid]== target) {
				return mid;
			}
			if (arr[mid] < target) {
				low = mid + 1;
			}
			else {
				high = mid-1;
				
			}
		}
		return -1;
		
		
	}

	public static void main(String[] args) {
		  
		int arr[]=  {10,20,30,40,50,60,70,80,90,100};
		System.out.println("Array: "+Arrays.toString(arr));
		Scanner sc= new Scanner (System.in);
		System.out.print("Enter Element: ");
		int target=  sc.nextInt();
		
		int result= binarySearch(arr,target);
		
		if(result==-1) {
			System.out.println("Element Not Found In Array"+result);
		}
		else {
			System.out.println("Element Found At Index "+result);
		}

	

	
	}

}
