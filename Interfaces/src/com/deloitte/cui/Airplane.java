package com.deloitte.cui;

public class Airplane extends Vehicles implements Flyer {

	@Override
	public void takeoff() {
		System.out.println("Taking Off");

	}

	@Override
	public void land() {
		System.out.println("Landing");


	}

	@Override
	public void fly() {
		System.out.println("Flying");


	}

}
