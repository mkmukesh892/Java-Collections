package com.mukesh.collections.set;
import java.util.*;
/*interface XXX{
	public static void set() {
		
	}
}*/
public class SortedSetExample {

	public static void main(String[] args) {
		SortedSet<String> sotredNames=new TreeSet<String>();
		sotredNames.add("java");
		sotredNames.add("SQL");
		sotredNames.add("HTML");
		sotredNames.add("CSS");
		System.out.println("Sorted set: "+sotredNames);
		System.out.println("First: "+sotredNames.first());
		System.out.println("Last: "+sotredNames.last());
		SortedSet<String> ssBeforeCSS=sotredNames.headSet("CSS");
		System.out.println(ssBeforeCSS);
		SortedSet<String> ssBetweenCSSAndHTML=sotredNames.subSet("CSS", "HTML");
		System.out.println(ssBetweenCSSAndHTML);
		SortedSet<String> ssCSSAndAfter=sotredNames.tailSet("CSS");
		System.out.println(ssCSSAndAfter);
		/*System.out.println(SortedSetExample.print1(9.9, 8.9f));*/
		
	}
	/*public static int print1(double x,float y) {
		System.out.println(x+y);
		return 1;
	}
	public static void print1(double x,float y) {
		System.out.println(x-y);
	}*/
}
