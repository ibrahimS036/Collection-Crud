package com.CRUD;

import java.util.Scanner;

public class Controller3 {

	public static void main(String[] args) {

		while (true) {
			Scanner ref = new Scanner(System.in);
			Demo3 obj = new Demo3();
			System.out.println("1:Insert");
			System.out.println("2:Display");
			System.out.println("3:Update");
			System.out.println("4:Remove");
			System.out.println("----------------------------------------------");
			String option = ref.next();
			if (option.equalsIgnoreCase("Insert")) {
				obj.insert();
			}
			if (option.equalsIgnoreCase("Display")) {
				System.out.println(obj.get());
			}
			if (option.equals("Update")) {
				obj.update();
			}
			if (option.equalsIgnoreCase("remove")) {
				obj.remove();
			}

		}

	}

}
