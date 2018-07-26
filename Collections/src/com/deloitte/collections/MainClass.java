package com.deloitte.collections;


class Point<T>{
	private T x;
	private T y;
	public T getX() {
		return x;
	}
	public void setX(T x) {
		this.x = x;
	}
	public T getY() {
		return y;
	}
	public void setY(T y) {
		this.y = y;
	}
}
public class MainClass {
	public static void main(String[] args) {
		
		Point<Float> point1 = new Point<Float>();
		point1.setX(5.5f);
		point1.setY(6.2f);
		
		System.out.println(point1.getX()+","+point1.getY());
		
		Point<Double> point2 = new Point<Double>();
		point2.setX(5.555);
		point2.setY(6.222);
		
		System.out.println(point2.getX()+","+point2.getY());
		
		Point<String> point3 = new Point<String>();
		point3.setX("Sushanth");
		point3.setY("Sreenivas");
		
		System.out.println(point3.getX()+","+point3.getY());		
	}
}
