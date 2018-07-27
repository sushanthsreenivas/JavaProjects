package com.deloitte.main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MainClass {

	public static void main(String[] args) {
		HashMap<Integer,String> result = new HashMap<Integer,String>();
		
		result.put(123, "abc");
		result.put(911, "efd");
		result.put(687, "Pikachu");
		result.put(911, "Messi");
		
		System.out.println(result.size());
		System.out.println(result.get(911));
		
		Set<Integer> keys=result.keySet();
		
		for(Integer key: keys) {
			System.out.println(key+":"+result.get(key));
		}
		
		Iterator<Integer> itr=keys.iterator();
		Integer key;
		while(itr.hasNext()) {
			key=itr.next();
			System.out.println(key+":"+result.get(key));
		}
		
	}

}
