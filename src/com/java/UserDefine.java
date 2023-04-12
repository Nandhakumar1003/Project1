package com.java;

import java.util.Scanner;

public class UserDefine {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String mail = s.nextLine();
		System.out.println("Mail is " + mail);

		String Name = s.nextLine();
		System.out.println("Name is " + Name);

		String Address = s.nextLine();
		System.out.println("Address is " + Address);

		String DOB = s.nextLine();
		System.out.println("DOB is " + DOB);

		String DOJ = s.nextLine();
		System.out.println("Date of Joining " + DOJ);

		long Mobile = s.nextLong();
		System.out.println("Mobile num is " + Mobile);

		short Id = s.nextShort();
		System.out.println("ID is " + Id);

		char Gender = s.next().charAt(0);
		System.out.println("Gender is " + Gender);

		int Salary = s.nextInt();
		System.out.println("Salary is " + Salary);

	}
}
