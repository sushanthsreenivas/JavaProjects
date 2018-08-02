package com.deloitte.pojos;

public class Point {
		private int x;
		private int y;
		
		Point(){
			System.out.println("Point Instantiated");
		}
		
		public void init() {
			System.out.println("Initialized");
		}
		public int getX() {
			return x;
		}
		public void setX(int x) {
			this.x = x;
		}
		public int getY() {
			return y;
		}
		public void setY(int y) {
			this.y = y;
		}
		
		public void destroy() {
			System.out.println("Destroyed");
		}
		
		
		@Override
		public String toString() {
		
		return x+","+y;
		}
		
		
}
