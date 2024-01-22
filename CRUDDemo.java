package com.CRUD;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class CRUDDemo {

	public static void main(String[] args) {
		List<Employee> c = new ArrayList<Employee>();
		Scanner sc = new Scanner(System.in);
		Employee e = null;
		int ch;
		do {
			System.out.println("1.INSERT");
			System.out.println("2.DISPLAY");
			System.out.println("3.SEARCH");
			System.out.println("4.DELETE");
			System.out.println("5.UPDATE");
			System.out.println("Enter Your Choice :");
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.print("Enter Employeee Number :");
				int eno = sc.nextInt();
				System.out.print("Enter Employee Name :");
				String ename = sc.next();
				System.out.print("Enter Employee Salary :");
				int salary = sc.nextInt();
				c.add(new Employee(eno, ename, salary));
				break;
			case 2:
				System.out.println("--------------------------------------");
				Iterator<Employee> itr = c.iterator();
				while (itr.hasNext()) {
					e = itr.next();
					System.out.println(e);
				}

				if (e == null) {
					System.out.println("You Didn't insert any data :");
				} else if (e != null) {
					System.out.println("This is your'e data :");
				}
				//System.out.println(e);
				System.out.println("---------------------------------------");
				break;
			case 3:
				boolean found = false;
				System.out.println("Enter Employee no to search :");
				int empno = sc.nextInt();
				System.out.println("----------------------------------------");
				Iterator<Employee> i = c.iterator();
				while (i.hasNext()) {
					Employee e1 = i.next();
					if (e1.GetEmpno() == empno) {
						System.out.println(e1);
						System.out.println("----------------------------------------");
						found = true;
					}

				}
				if (!found) {
					System.out.println("No data available :");
					System.out.println("------------------------------------");
				}
				break;
			case 4:
				found = false;
				System.out.println("Enter Employee no you want to delete :");
				empno = sc.nextInt();
				System.out.println("------------------------------------");
				i = c.iterator();
				while (i.hasNext()) {
					Employee e3 = i.next();
					if (e3.GetEmpno() == empno) {
						i.remove();
						found = true;
					}
				}
				if (!found) {
					System.out.println("Data not found :");
				} else {
					System.out.println("Data deleted successfully :");
				}
				System.out.println("------------------------------------");

				break;
			case 5:
				found = false;
				System.out.println("Enter Employee no to Update :");
				empno = sc.nextInt();
				System.out.println("------------------------------------");
				ListIterator<Employee> li = c.listIterator();
				while (li.hasNext()) {
					Employee e5 = li.next();
					if (e5.GetEmpno() == empno) {
						System.out.println("Enter new name :");
						ename = sc.next();
						System.out.println("Enter Salary :");
						salary = sc.nextInt();
						li.set(new Employee(empno, ename, salary));
						found = true;
					}
				}

				break;
			}

		} while (ch != 0);
	}

}
