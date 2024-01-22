package com.CRUD;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Logic extends Controller {
	List<Bean> al = new ArrayList<Bean>();

	public void insert() {
		Scanner sc = new Scanner(System.in);
		System.out.println("How Many Data You Want To Insert :");
		int j = sc.nextInt();
		for (int i = 1; i <= j; i++) {
			System.out.print("Enter Employe ID:");
			int e = sc.nextInt();
			System.out.print("Enter Employee Designation:");
			String d = sc.next();
			System.out.print("Enter Employee Salary:");
			int s = sc.nextInt();
			al.add(new Bean(e, d, s));
			System.out.println("--------------------------------------");

		}

	}
	
	public void display() {
		System.out.println("-------------------------------------------");
		System.out.println(al);
	}

	void remove() {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter id you want to delete:");
		int id = s1.nextInt();
		Iterator<Bean> itr = al.iterator();
		while (itr.hasNext()) {
			Bean e = itr.next();
			if (e.Getempid() == id) {
				itr.remove();
				System.out.println("Data Deleted Successfully:");
				System.out.println("----------------------------");
			}
		}
	}
}
