package com.deloitte.cui;

public class Harbor {

	public static void main(String[] args) {
		Harbor harbor = new Harbor();
		RiverBarge barge = new RiverBarge();
		SeaPlane sPlane = new SeaPlane();
		
		harbor.givePermissionToLand(barge);
		harbor.givePermissionToLand(sPlane);
	}
	
	private void givePermissionToLand(Sailor s) {
		s.cruise();
		s.dock();
	}
	
}
