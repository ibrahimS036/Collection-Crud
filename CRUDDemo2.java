package com.CRUD;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import javax.management.MBeanAttributeInfo;

public class CRUDDemo2 {

	public static void main(String[] args) {
		List<MyBean> al = new ArrayList<MyBean>();
		MyBean mb = new MyBean(null, 0, null, null);
		Scanner sc = new Scanner(System.in);
		int ch;
		do {
			System.out.println("1:INSERT");
			System.out.println("2:DISPLAY");
			System.out.println("3:SEARCHH");
			System.out.println("4:DELETE");
			System.out.println("5:UPDATE");
			System.out.println("Enter Your Choice");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.print("Enter Student Name :");
				String name = sc.next();
				System.out.print("Enter Student Roll NO :");
				int rollno = sc.nextInt();
				System.out.print("Enter Student City :");
				String city = sc.next();
				System.out.print("Enter Student Hobby :");
				String hobby = sc.next();
				al.add(new MyBean(name, rollno, city, hobby));
				break;
			case 2:
				System.out.println("-------------------------------------------------------------------------------");
				Iterator<MyBean> itr = al.iterator();
				while (itr.hasNext()) {
					System.out.println(itr.next());
					System.out.println("---------------------------------------------------------------------------");
				}
				break;
			case 3:
				Boolean found = false;
				System.out.println("Enter RollNo You Want To Search :");
				rollno = sc.nextInt();
				itr = al.iterator();
				while (itr.hasNext()) {
					MyBean mb1 = itr.next();
					if (mb1.getStudentrollno() == rollno) {
						System.out.println("--------------------------------------------------------------");
						System.out.println(mb1);
						System.out.println("--------------------------------------------------------------");
						// found = true;
					}
				}

				break;
			case 4:
				found = false;
				System.out.println("Enter RollNo You Want To Delete : ");
				rollno = sc.nextInt();
				itr = al.iterator();
				while (itr.hasNext()) {
					MyBean mb1 = itr.next();
					if (mb1.getStudentrollno() == rollno) {
						itr.remove();
						found = true;

					}
					if (found == true) {
						System.out.println("Data Deleted Successfully :");
						System.out.println(
								"----------------------------------------------------------------------------");
					}

				}
				break;
			case 5:
				found = false;
				System.out.println("Enter RollNo You Want To Update :");
				rollno = sc.nextInt();
				System.out.println("-----------------------------------------------------------------------------");
				ListIterator<MyBean> itr2 = al.listIterator();
				while (itr2.hasNext()) {
					MyBean p = itr2.next();
					if (p.getStudentrollno() == rollno) {
						System.out.print("Enter New Student Name :");
						name = sc.next();
						System.out.print("Enter New Student City :");
						city = sc.next();
						System.out.print("Enter New Student Hobby :");
						hobby = sc.next();
						itr2.set(new MyBean(name, rollno, city, hobby));
						found = true;

					}
				}
				break;

			}

		} while (ch != 0);
	}

}
