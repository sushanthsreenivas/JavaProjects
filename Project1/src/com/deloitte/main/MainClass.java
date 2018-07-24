package com.deloitte.main;

class Points{
	public int x;
	public int y;
}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Points [] point;
		
		point = new Points[3];
		
		point[0]= new Points();

		point[2]= new Points();
		
		point[0].x=2;
		point[0].y=8;
	
		point[2].x=4;
		point[2].y=12;
		
		for(Points target: point) {
			if(target!=null) {
			System.out.println(target.x+","+target.y);
		}
		}
		
		
	}
}


