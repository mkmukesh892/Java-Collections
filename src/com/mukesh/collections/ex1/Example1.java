package com.mukesh.collections.ex1;

import java.util.*;
//import java.util.Set;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> aSet=new HashSet<String>();
		aSet.add("1");
		aSet.add("2");
		aSet.add("3");
		List<String> aList=new ArrayList<String>();
		aList.add("A");
		aList.add("B");
		aList.add("C");
		Collection<String> collection=new LinkedHashSet<String>();
		
		collection.addAll(aList);
		//System.out.println("xxx");
		collection.addAll(aSet);
		/*if("6".compareTo("A")<0) {
			System.out.println("hi");
		}*/
		/*Iterator<String> iterator1=aSet.iterator();
		while(iterator1.hasNext()) {
			collection.add(iterator1.next());
		}*/
		/*Iterator<String> iterator2=aList.iterator();
		while(iterator2.hasNext()) {
			collection.add(iterator2.next());
		}*/
		//collection.retainAll(aSet);
		//collection.removeAll(aSet);
		//collection.removeAll(aList);
		Collection<String> elements=new LinkedHashSet<String>();
		elements.add("1");
		elements.add("B");
		//System.out.println(elements);
		System.out.println("is present: "+collection.contains("3"));
		System.out.println("is present "+elements+" : "+collection.containsAll(elements));
		System.out.println("number of elements in  collection are: "+collection.size());
		Iterator<String> iterator=collection.iterator();
		int id=1;
		while(iterator.hasNext()) {
			System.out.println("Element "+id+" : "+iterator.next());
			id++;
		}
		for(Object object:collection) {
			System.out.println(object);
		}
		}

}
