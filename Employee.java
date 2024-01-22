package com.CRUD;

public class Employee {
	private int empno;
	private String ename;
	private int salary;

	Employee(int empno, String ename, int salary) {
		this.empno = empno;
		this.ename = ename;
		this.salary = salary;
	}

	public int GetEmpno() {
		return empno;
	}

	public String GetEname() {
		return ename;
	}

	public int GetSalary() {	
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", salary=" + salary + "]";
	}
 

	

}
