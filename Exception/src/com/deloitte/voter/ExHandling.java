package com.deloitte.voter;

class IllegalAgeException extends Exception{
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Should be above the age of 18";
	}
	
}

class Voter{
	public void resgister(int age) throws IllegalAgeException {
		if(age<18) {
			throw new IllegalAgeException();
		}
		System.out.println("Registered");
	}
}

public class ExHandling {

	public static void main(String[] args) {
		
		Voter v1= new Voter();
		
		try {
			v1.resgister(13);
		} catch (IllegalAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
