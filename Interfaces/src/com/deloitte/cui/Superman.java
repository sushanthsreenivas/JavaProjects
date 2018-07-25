package com.deloitte.cui;

public class Superman extends Kryptonian implements Flyer {

	@Override
	public void takeoff() {
		System.out.println("Superman Taking Off");
	}

	@Override
	public void land() {
		System.out.println("Superman Landing");
	}

	@Override
	public void fly() {
		System.out.println("Superman Flying");

	}
	public void leapBuildings() {
		System.out.println("Leaping Buildings");
	}
	
	public void stopBullet() {
		System.out.println("Stopping Bullets");
	}


}
