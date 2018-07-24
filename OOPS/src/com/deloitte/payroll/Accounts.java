package com.deloitte.payroll;

public class Accounts {
	
	public void processSalary(Employee employee) {
		if(employee!=null) {
			
			if(employee instanceof ConfirmedEmployee) {
				ConfirmedEmployee confirmedEmployee = (ConfirmedEmployee)employee;
				confirmedEmployee.transportFacility(); 
			}
			employee.netSalary();
		}
		else if(employee==null) {
			System.out.println("No employee present");
		}
	}

	

}
