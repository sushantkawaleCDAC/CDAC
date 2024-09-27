package org.ArrayDeque;
import java.util.ArrayDeque;
public class ArrayDeque1 {
	
	public static void main (String[]args) {
		
		ArrayDeque <Integer> adq =new ArrayDeque();
//	1	offer	
		adq.offer(10);
		adq.offerFirst(1);
		adq.offerLast(100);
		adq.offer(200);
//	2	peek()/	first/last
		System.out.println(adq);
		System.out.println("peek(): "+adq.peek());
		System.out.println("peekFirst(): "+adq.peekFirst());
		System.out.println("peekLast(): "+adq.peekLast());
		System.out.println(adq);
//	3	remove()//poll() fist/last	
//		System.out.println("remove: "+adq.remove());
//		System.out.println("removeFirst: "+adq.removeFirst());   
//		System.out.println("removeLast: "+adq.removeLast());
//		System.out.println(adq);
		
		System.out.println("poll(): "+adq.poll());
		System.out.println("pollFirst(): "+adq.pollFirst());   
		System.out.println("pollLast(): "+adq.pollLast());
		System.out.println(adq);
	}

}
