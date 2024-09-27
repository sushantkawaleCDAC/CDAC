package org.Array.Operations;

public class Traversal {
	public static void traverse(int[]arr) {
		System.out.println("Array Elements:  ");
		for(int i = 0; i < arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int arr[]= {10,11,21,32,45,23};
		traverse(arr);

	}

}
