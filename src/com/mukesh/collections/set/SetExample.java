package com.mukesh.collections.set;
import java.util.*;
public class SetExample {

	public static void main(String[] args) {
	Set<String> set=new HashSet<String>();	
	//Set<String> set=new LinkedHashSet<String>();
	//Set<String> set=new TreeSet<String>();
	//Set<String> set=new EnumSet<String>();
/*	String element="Mukesh Kumar";
	set.add(element);
	System.out.println(set.contains(element));*/
	//adding element in the set
	set.add("element 0");
	set.add("element 1");
	set.add("element 2");
	//removing element from set
	set.remove("element 1");
	//access via Iterator
	Iterator<String> iterator=set.iterator();
	while(iterator.hasNext()) {
		String element=iterator.next();
		System.out.println(element);
	}
	//access via new for-loop
	for(String str:set) {
		String element=str;
		System.out.println(element);
	}
	}

}
