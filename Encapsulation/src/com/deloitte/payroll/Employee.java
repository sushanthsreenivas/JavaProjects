package com.deloitte.payroll;

public class Employee {
		
		private int empID;
	 	private String firstName;
		private String lastName;
		private int deptID;
		public int getEmpID() {
			return empID;
		}
		public void setEmpID(int empID) {
			this.empID = empID;
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
		public int getDeptID() {
			return deptID;
		}
		public void setDeptID(int deptID) {
			this.deptID = deptID;
		}
}
