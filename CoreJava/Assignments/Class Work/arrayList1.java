package org.ArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class arrayList1 {

	public static void main(String[] args) {
		List<Integer>List = new ArrayList();
		List.add(1);
		List.add(2);
		List.add(3);
		List.add(4);
		List.add(5);
		List.add(6);
		System.out.println(List);
//		Add element        ***add***
		List.add(7);
		System.out.println(List);
//		Remove element		***remove***
		List.remove(6);
		System.out.println(List);
//		Add element in perticular index
		List.add(1, 11);
	//      (index, element)	
		System.out.println(List);
		
//		create a newList
		List<Integer> newList = new ArrayList();
		newList.add(111);
		newList.add(222);
		newList.add(333);
//		Adding newList in current List ***addAll***
		List.addAll(newList);
		System.out.println(List);
		
//		get the element of specific index  ***get***		
		System.out.println(List.get(7));
		
//		System.out.println(List.remove(1));
		

	}

}

