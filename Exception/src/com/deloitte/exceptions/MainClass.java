package com.deloitte.exceptions;


public class MainClass {

	public static void main(String[] args) {

		
		try {
			System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args [1]));
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Enter 2 entries");
			
		}
		catch(NumberFormatException e) {
			System.out.println("Enter 2 valid numbers");
		}
		catch(ArithmeticException ex) {
			System.out.println("Cannot divide by 0");
		}
	
	}

}
