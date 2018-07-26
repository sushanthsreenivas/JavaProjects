package com.deloitte.collections.list;

import java.util.HashSet;

public class MainClass {
	public static void main(String[] args) {
		
		HashSet<String> result=new HashSet<String>();
		
		result.add("M");
		result.add("E");
		result.add("S");
		result.add("S");
		result.add("I");
		
		for(String element:result) {
			System.out.println(element);
		}
		
	}

}
