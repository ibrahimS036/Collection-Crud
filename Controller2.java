package com.CRUD;

import java.util.Scanner;

public class Controller2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Demo2 d = new Demo2();
		while (true) {

			System.out.println("Insert:");
			System.out.println("Display:");
			System.out.println("Search:");
			System.out.println("Update:");
			System.out.println("Delete:");
			System.out.println("Exit:");
			System.out.println("---------------------------------------------");

			String a = sc.next();
			if (a.equalsIgnoreCase("Insert")) {
				d.insert();
			} else if (a.equalsIgnoreCase("Display")) {
				System.out.println(d.get());
			} else if (a.equalsIgnoreCase("Search")) {
				d.search();
			} else if (a.equalsIgnoreCase("Update")) {
				d.update();
			} else if (a.equalsIgnoreCase("Delete")) {
				d.delete();
			} else if (a.equalsIgnoreCase("Exit")) {
				System.out.println("ThankYou For Using The Programme.");
				break;
			}

		}

	}

}
