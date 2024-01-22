package com.CRUD;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo2 {
	Scanner s = new Scanner(System.in);
	static List<MyBean2> list = new ArrayList<MyBean2>();

	public void insert() {
		System.out.println("How Many Data You Want To Insert:");
		int data = s.nextInt();
		for (int i = 1; i <= data; i++) {
			System.out.print("Enter Your id:");
			int id = s.nextInt();
			System.out.print("Enter Your name:");
			String name = s.next();
			System.out.print("Enter Your Course:");
			String course = s.next();
			System.out.print("Enter Your City:");
			String city = s.next();
			System.out.print("Enter Your Mobile No:");
			long mobileno = s.nextLong();
			list.add(new MyBean2(id, name, course, city, mobileno));

		}

	}

	public List<MyBean2> get() {
		return list;
	}

	public void search() {
		System.out.println("Enter id You Want to search:");
		int id = s.nextInt();
		Iterator<MyBean2> itr = list.iterator();
		while (itr.hasNext()) {
			MyBean2 b = itr.next();
			if (b.getId() == id) {
				System.out.println(b);
			}
		}
	}

	public void update() {
		System.out.println("Enter id You Want to Update:");
		int id = s.nextInt();
		ListIterator<MyBean2> itr2 = list.listIterator();
		while (itr2.hasNext()) {
			MyBean2 b = itr2.next();
			if (b.getId() == id) {
				System.out.println("Enter New Name:");
				String name = s.next();
				System.out.println("Enter New Coures:");
				String coures = s.next();
				System.out.println("Enter New City:");
				String city = s.next();
				System.out.println("Enter New Mobile No:");
				long mobileNo = s.nextLong();
				itr2.set(new MyBean2(id, name, coures, city, mobileNo));

			}
		}

	}

	public void delete() {
		System.out.println("Enter id You Want To Remove:");
		int id = s.nextInt();
		Iterator<MyBean2> itr = list.iterator();
		while (itr.hasNext()) {
			MyBean2 b = itr.next();
			if (b.getId() == id) {
				itr.remove();
			}
		}

	}

}
