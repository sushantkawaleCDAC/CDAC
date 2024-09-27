package org.Stack;
import java.util.Stack;
public class Stack1 {

	public static void main(String[] args) {
		Stack<String> animals= new Stack<>();
//		push==> add's an element
		animals.push("Dog");
		animals.push("Lion");
		animals.push("Tiger");
		animals.push("Horse");
		animals.push("Cat");
		System.out.println(animals);
		
//	1	peek==> Return(But Does Not Remove) the top element of stack
		System.out.println(animals.peek());
		
//	2	pop==>Remove And Return The Top Element Of  The Stack
		
		System.out.println(animals.pop());
		
		System.out.println(animals.peek());
		System.out.println(animals);
		
//		System.out.println(animals.empty());

	}

}
