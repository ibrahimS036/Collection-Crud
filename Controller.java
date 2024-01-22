package com.CRUD;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Controller {

	public static void main(String[] args) {
		Scanner o = new Scanner(System.in);
		Logic v = new Logic();
		while (true) {
			System.out.println("Insert" + "\n" + "Display" + "\n" + "Remove" + " " + "\n" + "Exit");
			String methods = o.next();
			if (methods.equalsIgnoreCase("Insert")) {
				v.insert();
			} else if (methods.equalsIgnoreCase("Display")) {
				v.display();
			} else if (methods.equalsIgnoreCase("Remove")) {
				v.remove();
			} else if (methods.equalsIgnoreCase("Exit")) {
				System.out.println("Thank You For Using The Programe.");
				break;
			}

		}
	}

}
