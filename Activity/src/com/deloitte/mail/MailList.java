package com.deloitte.mail;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;



class Address {
	private String name;
	private String street;
	private String city;
	private String state;
	private String code;
	private int id;
	
	Address(String n,String s,String c,String st,String cd, int _id){
		name=n;
		street=s;
		city=c;
		state=st;
		code=cd;
		id=_id;
	}
	
	public String toString() {
		return name + "\n" + street + "\n" + city + " " + state + " " + code;
	}
	
	@Override
	public boolean equals(Object target) {
		// TODO Auto-generated method stub
		if(target!=null) {
			Address castedTarget=(Address)target;
			if(name==castedTarget.name && street==castedTarget.street && city==castedTarget.city && state==castedTarget.state && code==castedTarget.code && id==castedTarget.id) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.id;
	}
	
}

public class MailList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Address> m1 = new HashSet<Address>();
		
		m1.add(new Address("J.W. West","11 Oak Ave","Urbana","IL","61801",5));
		m1.add(new Address("Tom Carlton","867 Elm St","Champaign","IL","61820",7));
		m1.add(new Address("Tom Carlton","867 Elm St","Champaign","IL","61820",7));
		
		  Iterator<Address> itr = m1.iterator(); 
		    while(itr.hasNext()) { 
		    	
		      Address element = itr.next();
		    
		      System.out.print(element);
		   
		    } 		 

	}

}
