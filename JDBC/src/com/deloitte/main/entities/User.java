package com.deloitte.main.entities;

public class User {
	private long ID;
	private String userName;
	private String firstName;
	private String lastName;
	private String passwd;
	private String status;
	
	public User(long ID,String userName,String firstName,String lastName,String passwd,String status)
	{
		this.ID=ID;
		this.userName=userName;
		this.firstName=firstName;
		this.lastName=lastName;
		this.passwd=passwd;
		this.status=status;
		
	}
	
	public long getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

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

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	

}
