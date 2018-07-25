package com.deloitte.payroll.main;

import java.util.Date;
import java.util.Scanner;

import com.deloitte.payroll.Accounts;
import com.deloitte.payroll.ConfirmedEmployee;
import com.deloitte.payroll.ContractEmployee;
import com.deloitte.payroll.Employee;
import com.deloitte.payroll.HR;
import com.deloitte.payroll.Intern;

public class MainClass {

	public static void main(String[] args) {
		
	
		Employee employee;
		HR hr = new HR();
		Accounts accounts = new Accounts();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee type");
		char Emp = sc.next().charAt(0);
		sc.close();
		
		employee = hr.recruit(Emp);
		accounts.processSalary(employee);
		

	}

}
