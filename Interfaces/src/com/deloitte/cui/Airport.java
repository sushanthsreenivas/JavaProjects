package com.deloitte.cui;

public class Airport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Airport bangaloreAirport = new Airport();
			Helicopter chopper = new Helicopter();
			SeaPlane submarine = new SeaPlane();
			Superman superman = new Superman();
			
			bangaloreAirport.givePermissionToLand(chopper);
			bangaloreAirport.givePermissionToLand(submarine);
			bangaloreAirport.givePermissionToLand(superman);
	}

	private void givePermissionToLand(Flyer f) {
		f.land();
		f.fly();
		f.takeoff();
		
	}

}
