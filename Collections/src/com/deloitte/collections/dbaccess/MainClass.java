package com.deloitte.collections.dbaccess;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

class DbAccess{
	public Collection<String> getResult(){
		HashSet<String> result=new HashSet<String>();
		
		result.add("M");
		result.add("E");
		result.add("S");
		result.add("S");
		result.add("I");
		
		return result;
	}
}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DbAccess dba = new DbAccess();
		
		Collection<String> dbResult = dba.getResult();
		System.out.println(dbResult);
		
		for(String element:dbResult) {
			System.out.println(element);
		}
		
	
	}

}
