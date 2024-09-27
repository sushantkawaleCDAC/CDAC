package org.priorityQueue;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Comparator;
public class Priority {

	public static void main(String[] args) {
		//Queue<Integer> pq = new PriorityQueue<>();
		Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
//	1	 offer(E e)==> add's element 
		pq.offer(100);
		pq.offer(20);
		pq.offer(30);
		pq.offer(40);
		pq.offer(50);
//		pq.offer(1);
		
		System.out.println(pq);
		
//	2	 poll()==> Remove & Retrieves The Head (front)	of the queue	 
		System.out.println("poll(): "+pq.poll());
		System.out.println(pq);
//	3	 peek()==> Retrieves the head of queue without removing it
		System.out.println("peek(): "+pq.peek());
		System.out.println(pq);
		
//	4	 remove()==> Remove a single instance of the sp//ecified elements in the queue
//		System.out.println("remove(): "+remove(11));
		
		
	}

}
