package com.mukesh.collections.map1;
import java.util.*;
public class MapExample {

	public static void main(String[] args) {
		Map<String,String> map=new HashMap<String,String>();
		//adding element in map
		map.put("key1", "element 1");
		map.put("key2", "element 2");
		map.put("key3", "element 3");
		map.put(null, null);
		map.put(null, "jggj");
		map.put(null, null);
		//retrieving element from map
		String element=map.get("key3");
		System.out.println("element is: "+element);
		//retrieving element through keySet() iterator
		int id=1;
		Iterator<String> iterator=map.keySet().iterator();
		while(iterator.hasNext()) {
			Object key=iterator.next();
			Object value=map.get(key);
			System.out.println("value "+id+" is :"+value);
			id++;
		}
		//removing element from map
		System.out.println("removed value is : "+map.remove("key1"));
		//retrieving element through new for-loop
		for(Object key:map.keySet()) {
			Object value=map.get(key);
			System.out.println("value "+value);
		}
		
	}

}
