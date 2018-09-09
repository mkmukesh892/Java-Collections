package com.mukesh.collections.queue;

import java.util.*;

public class QueueExample {

	public static void main(String[] args) {
		Queue<String> queue=new LinkedList<String>();
		//adding element to queue
		queue.add("element 0");
		queue.add("element 1");
		queue.add("element 2");
		//access via Iterator
		int id=1;
		Iterator<String> iterator=queue.iterator();
		while(iterator.hasNext()) {
			String element=iterator.next();
			System.out.println("Element "+id+" : "+element);
			id++;
		}
		//access via new for-loop
		for(Object object :queue) {
			String element=(String)object;
			System.out.println("Element = "+element);
			
		}
		//access top element from queue
		System.out.println("top element : "+queue.peek());
		//remove first element from queue
		System.out.println("first element : "+queue.remove());
		System.out.println("top element : "+queue.element());

	}

}
