package com.deloitte.main.act;

import java.util.ArrayDeque;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<String> adq = new ArrayDeque<String>();
		
		adq.push("A");
		adq.push("B");
		adq.push("D");
		adq.push("E");
		adq.push("F");
		
		System.out.println("Popping the stack:");
		
		while(adq.peek()!=null) {
			System.out.print(adq.pop() + " ");
		}
		
		System.out.println();
		
	}

}
