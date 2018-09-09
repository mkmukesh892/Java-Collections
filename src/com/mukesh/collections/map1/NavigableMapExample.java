package com.mukesh.collections.map1;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;

public class NavigableMapExample {

	public static void main(String[] args) throws NullPointerException {
		NavigableMap<String, String> map=new TreeMap<String,String>();
		map.put("key1","value1");
		map.put("key2","value2");
		map.put("key3","value3");
		String x1=map.put("key4","value4");
		String x=map.put("key4","value4");
		System.out.println("---"+x+"---"+x1);
		NavigableMap<String, String> reverse=(NavigableMap<String, String>) map.descendingMap();
		reverse.put("key5", "value5");
		Iterator<String> iterator=reverse.keySet().iterator();
		while(iterator.hasNext()) {
			String key=iterator.next();
			System.out.println("value is : "+map.get(key));
		}
		//headmap 
		
		//SortedMap<String,String> headmap1=map.headMap("key4");
		SortedMap<String,String> headmap1=map.headMap("key4",true);
		for(Object key:headmap1.keySet()) {
			Object value=headmap1.get(key);
			System.out.println("headmap1 value : "+value);
		}
		
		//submap
		//SortedMap<String, String> submap1=map.subMap("key2", "key4");
		SortedMap<String, String> submap1=map.subMap("key1",true, "key4",true);
		for(Object key1:submap1.keySet()) {
			Object value1=submap1.get(key1);
			System.out.println("submap1 value : "+value1);
		}
		//ceilingKey
		Object ceilingKey=map.ceilingKey("key4");
		System.out.println("ceiling key : "+ceilingKey+" ; ceiling value : "+map.get(ceilingKey));
		//floorKey
				Object floorKey=map.floorKey("key7");
				System.out.println("floor key : "+floorKey+" ; floor value : "+map.get(floorKey));
				
		//higherKey
		Object higherKey=map.higherKey("key3");
		System.out.println("higher key : "+higherKey+" ; higher value : "+map.get(higherKey));
		//lowerKey
				Object lowerKey=map.lowerKey("key3");
				System.out.println("higher key : "+lowerKey+" ; higher value : "+map.get(lowerKey));
		//ceilingEntry
			Object ceilingEntry=map.ceilingEntry("key6");
			System.out.println("ceiling Entry : "+ceilingEntry);
		//floorEntry
			Object floorEntry=map.floorEntry("key6");
			System.out.println("floor Entry : "+floorEntry);
			//higherEntry
			Object higherEntry=map.higherEntry("key4");
			System.out.println("higher Entry : "+higherEntry);
			//lowerEntry
			Object lowerEntry=map.lowerEntry("key6");
			System.out.println("lower Entry : "+lowerEntry);
			
			//pollFirstEntry
			System.out.println("poll first Entry : "+map.pollFirstEntry());
			//pollLastEntry
			System.out.println("poll last Entry : "+map.pollLastEntry());
			//remaining elements
			Iterator<String> iterator2=reverse.keySet().iterator();
			while(iterator2.hasNext()) {
				System.out.println("remaining element : "+map.get(iterator2.next()));
			}
	}

}
