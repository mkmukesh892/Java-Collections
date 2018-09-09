package com.mukesh.collections.set;

import java.util.*;

public class NavigableSetExample {

	public static void main(String[] args) {
		NavigableSet<String> original=new TreeSet<>();
		original.add("1");
		original.add("2");
		original.add("3");
		NavigableSet<String> original2=original.descendingSet();
		original2.add("4");
		original2.add("5");
		System.out.println(original);
		
		SortedSet<String> subset=original.subSet("2",true, "4",true);
		System.out.println(original.pollFirst());
		System.out.println(original.pollLast());
		 
		System.out.println(subset);
		Iterator<String> iterator=original.descendingIterator();
		System.out.println("Ceiling value : "+original2.ceiling("1"));
		System.out.println("floor value : "+original.floor("5"));
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
