package org.generics;

class HashTable<k,v>{
	private k key;
	private v value;
	
	public HashTable(k key, v value) {
		this.key = key;
		this.value = value;	
	}
	public k getKey() {
		return key;	
	}
	public v getValue() {
		return value;
	}
}
public class Generics1 {
	public static void main(String[] args) {
		HashTable<Integer,  String > ht = new HashTable<>(1,"DC");
		
		Integer key = ht.getKey();
		String value =ht.getValue();
		
		System.out.println("Key : "+key);
		System.out.println("Value :  "+value);
		

	}

}
