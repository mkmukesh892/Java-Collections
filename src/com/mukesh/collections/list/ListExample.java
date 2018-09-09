package com.mukesh.collections.list;

import java.util.*;

public class ListExample {
public static void main(String[] args) {
	List<String> list=new ArrayList<String>();
	//add elements in the list
	list.add("Abhishek");
	list.add("Mukesh");
	list.add("Dhiraj");
	list.add("1");
	list.add("2");
	//access via index
	System.out.println("Access via index");
	System.out.println(list.get(0));
	System.out.println(list.get(1));
	System.out.println(list.get(2));
	//access via iterator
	System.out.println("\nAccess via iterator");
	Iterator<String> iterator=list.iterator();
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	//access via new for-loop
	System.out.println("\nAccess via new for-loop");
	for(Object object:list) {
		String element=(String)object;
		System.out.println(element);
	}
	//remove element from list
	list.remove("Mukesh");
	list.remove(2);
	//clearing all element from list
	//list.clear();
	//list size
	System.out.println("size of list is : "+list.size());
	for(Object object:list) {
		String element=(String)object;
		System.out.println(element);
	}
}
}
