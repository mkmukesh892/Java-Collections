package com.mukesh.collections.stack;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<String> stack=new Stack<>();
		//adding element to stack
		stack.push("1");
		stack.push("2");
		stack.push("3");
		//look at top element of stack
		String top=stack.peek();
		System.out.println("top element is : "+top);
		//removing top element from stack
		String deletedElement=stack.pop();
		System.out.println("Deleted element is "+deletedElement);
		//searching an object from stack
		
		stack.push("mukesh kumar");
		System.out.println(stack.search("mukesh kumar"));
		System.out.println(stack.search("1"));
		System.out.println(stack.search("2"));
//		System.out.println(stack.peek());
//		System.out.println("object found at index "+index);
//		System.out.println(stack.elementAt(index));
		//System.out.println(stack.size());

	}

}
