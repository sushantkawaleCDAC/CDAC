package org.Array;
//*****Syntax*****

import java.util.*;

public class array2 {

	public static void main(String[] args) {
//		Declaration Without Initialization
		int [] arr = new int [5];
		
//		Declaration with Initialization
		int are1[]= {1,23,4,5,6,7};
//		3. Declaration and Initialization Using new Keyword
		int arr3[]= new int [] {1,23,4,45,1,2,3,4};
		
//		4. Multi-Dimensional Array Declaration
//		dataType[][] arrayName = new dataType[rows][columns];
		int[][] matrix = new int[3][3];  // Declares a 2D array with 3 rows and 3 columns
		
		int[][] matrix1 = {
			    {1, 2, 3},
			    {4, 5, 6},
			    {7, 8, 9}
			};  // Declares and initializes a 2D array (3x3 matrix)
		System.out.println(Arrays.deepToString(matrix1));
		


		

		

		
	}

}
