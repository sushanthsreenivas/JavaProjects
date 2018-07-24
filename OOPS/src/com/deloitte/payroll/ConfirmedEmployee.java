package com.deloitte.payroll;

public class ConfirmedEmployee extends Employee{

	@Override
	public void netSalary() {
		
		System.out.println("Confirmed Employee's Salary");
	}
	
	public void transportFacility() {
		System.out.println("Transportation");
	}

}
