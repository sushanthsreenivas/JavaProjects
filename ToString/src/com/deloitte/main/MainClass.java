package com.deloitte.main;

class Point{
	public int x;
	public int y;
	
	public Point(int a, int b) {
		this.x=a;
		this.y=b;
	}
	
	@Override
	public String toString() {
		
		return x+","+y;
	}
	
	@Override
	public boolean equals(Object target) {
		
		if(target!=null) {
			Point castedTarget=(Point)target;
			if(x==castedTarget.x && y==castedTarget.y) {
				return true;
			}
		}
		return false;
	}
}

public class MainClass {

	public static void main(String[] args) {
		Point point = new Point(6,5);
		Point point1 = new Point(6,5);
		String con;
		
		con = "X and Y:"+point;
		System.out.println(con);
		System.out.println(point.toString());
		
		System.out.println(point.equals(point1));
	}
}
