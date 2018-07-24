package com.deloitte.payroll;

public class HR {
	
	public Employee recruit(char empType) {
		Employee employee=null;
		if(empType=='I') {
			employee = new Intern();
		}
		else if (empType=='P') {
			employee = new ConfirmedEmployee();
		}
		else if (empType=='C') {
			employee = new ContractEmployee();
		}
		
		return employee;
	}
	
}
