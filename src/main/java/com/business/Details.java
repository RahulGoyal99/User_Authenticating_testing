package com.business;

import java.util.Scanner;

public abstract class Details {

	public static Scanner sc = new Scanner(System.in);
	public static String Userid = "tom@gmail.com";
	public static String Userpass = "jerry#123";
	public static String pass;
	public static String id;

	static void inputID() {
		System.out.println("Enter ID: ");
		id = sc.next();
	}

	static void inputPassword() {
		System.out.println("Enter Password: ");
		pass = sc.next();
	}

	public static boolean authenticate() {
		if (id.equals(Userid) && pass.equals(Userpass))
			return true;
		else
			return false;
	}

}