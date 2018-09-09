package com.mukesh.collections.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
public static void main(String[] args) {
	List<String> items=new ArrayList<String>();
	items.add("FICO");
	items.add("MicroSoft");
	items.add("Amazon");
	items.add("Azure");
	Stream<String> stream=items.stream();
	//stream.filter(item->item.startsWith("a"));
	//System.out.println(items);
	//stream.map(item->item.toUpperCase());
	List<String> filtered=items.stream().filter(item->item.startsWith("A")).collect(Collectors.toList());
	System.out.println(filtered);
	String shortest=items.stream().min(Comparator.comparing(item->item.length())).get();
	System.out.println(shortest);
	String longest=items.stream().max(Comparator.comparing(item->item.length())).get();
	System.out.println(longest);
	long count=items.stream().filter(item->item.startsWith("A")).count();
	System.out.println(count);
	String reduce1=items.stream().reduce((acc,item)->acc+" "+item).get();
	System.out.println(reduce1);
	String reduce2=items.stream().filter(item->item.startsWith("A")).reduce("", (acc,item)->acc+" "+item);
	System.out.println(reduce2);
}
}
