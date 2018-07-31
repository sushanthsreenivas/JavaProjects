package com.deloitte.web.model;

import java.io.Serializable;

public class UserBean implements Serializable {
	private String firstName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public boolean authenticate(String username,String password){

		if (username != null && password != null) {
			if (username.equalsIgnoreCase("Sushanth") && password.equals("messi10")) {
				firstName="Sushanth";
				lastName="Sreenivas";
				
				return true;
			} else {
				return false;
			}
		}
		return false;
	}


}
