package com.deloitte.main;

public class ScopeExample {

	private int i=1;
	
	public void firstMethod() {
		int i=4,j=5;
		
		this.i = i+j;
		secondmethod(7);
		
	}

	public void secondmethod(int i) {
		int j=8;
		this.i=i+j;
		System.out.println(this.i);
		
	}

}
