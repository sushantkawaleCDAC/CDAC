package org.LinkedList.Queue;
import java.util.Queue;
import  java.util.LinkedList;
public class LinkedListQueue {

	public static void main(String[] args) {
		 Queue <Integer> queue= new LinkedList();
//	1	 offer(E e)==> add's element 
		 queue.add(10);
		 queue.offer(20);
		 queue.offer(30);
		 queue.offer(40);
		 queue.offer(50);
		 
		 System.out.println(queue);
//	2	 poll()==> Remove & Return The Head (front)	of the queue	 
		 System.out.println("poll(): "+queue.poll());
		 System.out.println(queue);
		 
//	3	 peek()==> Return the head of queue without removing it
		 System.out.println("peek(): "+queue.peek());
		 System.out.println(queue);
		 
//	4	 remove()==> Remove the head of queue 
		 System.out.println("remove():  "+queue.remove());
		 System.out.println(queue);
		 
//	5 	element()==> Retrieves the head of queue without removing it
		 System.out.println("element(): "+queue.element());
		 System.out.println(queue);
//	6	 add();add element 
		 queue.add(111);
		 System.out.println(queue);
		 
		 
		 
	}

}
