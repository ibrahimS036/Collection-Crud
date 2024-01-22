package com.CRUD;

public class Bean {

	private int empid;
	private String designation;
	private int salary;

	Bean(int empid, String designation, int salary) {
		this.empid = empid;
		this.designation = designation;
		this.salary = salary;
	}

	int Getempid() {
		return empid;
	}

	String Getdesignation() {
		return designation;
	}

	int Getsalary() {
		return salary;
	}

	public String toString() {
		return "Employee ID:" + empid + " " + "Employee Designation:" + designation + " " + "Employee Salary:" + salary;
	}

}
