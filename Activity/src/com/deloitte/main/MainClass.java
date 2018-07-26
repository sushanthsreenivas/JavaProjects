package com.deloitte.main;

import java.util.LinkedList;

public class MainClass {
	public static void main(String[] args) {
		
		LinkedList<String> result = new LinkedList<String>();
		
		//Add elements to collection
		result.add("B");
		result.add("C");
		result.add("D");
		result.add("X");
		result.add("Y");
		result.addLast("Z");
		result.addFirst("A");
		
		result.add(1, "A2");
		
		System.out.println("original contents of result: " + result);
		
		//remove elements from collection
		result.remove("F");
		result.remove(2);
		System.out.println("Contents of result after deletion: " + result);
		
		//remove first and last elements
		result.removeFirst();
		result.removeLast();
		
		System.out.println("result after deletion of first and last: " + result);
		
		//Get and set a value
		String val=result.get(2);
		result.set(2, val + "changed");
		
		System.out.println("result after change: " + result);
		
		
	}

}
