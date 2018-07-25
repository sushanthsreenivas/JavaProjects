package com.deloitte.cui;

public class Bird extends Animal implements Flyer {

	@Override
	public void takeoff() {
		System.out.println("Bird Taking Off");

	}

	@Override
	public void land() {
		System.out.println("Bird landing");

	}

	@Override
	public void fly() {
		System.out.println("Bird flying");

	}
	
	public void buildNest() {
		System.out.println("Building Nest");
	}
	
	public void layEggs() {
		System.out.println("Laying Eggs");
	}

}
