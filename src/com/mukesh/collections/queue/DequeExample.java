package com.mukesh.collections.queue;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DequeExample {

	public static void main(String[] args) {
		Deque<String> deque=new LinkedList<String>();
		//adding element in the deque
		deque.add("element 1"); //add element at tail
		deque.addFirst("element 2"); //add element at head
		deque.addLast("element 3");//add element at tail
		//accessing element from deque
		String firstElement=deque.element();
		System.out.println("first element of deque : "+firstElement);
		String first=deque.getFirst();
		System.out.println("first element of deque : "+first);
		String lastElement=deque.getLast();
		System.out.println("last element of deque: "+lastElement);
		
		//access via iterator
		Iterator<String> iterator=deque.iterator();
		int id=1;
		while(iterator.hasNext()) {
			String element=iterator.next();
			System.out.println("Element "+id+" : "+element);
			id++;
		}
		Iterator<String> iterator2=deque.descendingIterator();
		while(iterator2.hasNext()) {
			String element=iterator2.next();
			System.out.println("Value : "+element);
		}
		
	}

}
