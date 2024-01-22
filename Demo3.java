package com.CRUD;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Demo3 {

	

	static Map<Integer, Bean3> map = new HashMap<>();
	Scanner sc = new Scanner(System.in);

	public void insert() {

		System.out.println("How Many Data You Want to Insert:");
		int data = sc.nextInt();
		for (int i = 1; i <= data; i++) {
			System.out.print("Enter Your id:");
			int id = sc.nextInt();
			System.out.print("Enter Your name:");
			String name = sc.next();
			System.out.print("Entr Your City:");
			String city = sc.next();
			Bean3 bean = new Bean3(id, name, city);

			map.put(bean.getId(), bean);
			System.out.println("----------------------------------------------");
		}

	}

	public void save(Bean3 bean) { // map.put(bean.getId(), bean);

	}

	public Map<Integer, Bean3> get() {
		return map;
	}

	public void update() {
		System.out.println("Enter id to update:");
		int idToupdate = sc.nextInt();
		if (map.containsKey(idToupdate)) {
			System.out.println("Enter new Name:");
			String newName = sc.next();
			System.out.println("Enter New City:");
			String newCity = sc.next();
			Bean3 updateBean = new Bean3(idToupdate, newName, newCity);
			save(updateBean);
			System.out.println("Record Update Successfully!");
		} else {
			System.out.println("Record Not Found!");
		}
	}

	public void remove() {
		System.out.println("Enter Id To Rmove:");
		int idRemove = sc.nextInt();
		if (map.containsKey(idRemove)) {
			map.remove(idRemove);
			System.out.println("Record Remove Successfulluy!");
		} else {
			System.out.println("record Not Found!");
		}
	}
	public void Modify() 
		{
		
		}

}
