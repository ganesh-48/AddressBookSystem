package com.addressbooksystem;

import java.util.Scanner;

public class AddressBook {
	public void addressbook() {
		System.out.println("Welcome to Address Book Problem");
			
		
		//Create contacts in address book
		String firstName,lastName,address,city,state,email;
		int zip;
		long phoneNumber;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first name :");
		firstName = sc.nextLine();
		System.out.println("Enter the last name :");
		lastName = sc.nextLine();
		System.out.println("Enter the address :");
		address = sc.nextLine();
		System.out.println("Enter the city :");
		city = sc.nextLine();
		System.out.println("Enter the state :");
		state = sc.nextLine();
		System.out.println("Enter the email :");
		email = sc.nextLine();
		System.out.println("Enter the zip :");
		zip = sc.nextInt();
		System.out.println("Enter the phoneNumber :");
		phoneNumber = sc.nextLong();
	
		System.out.println(firstName + " " + lastName + " " + address + " " + city + " " + state + " " + email + " " + zip + " " + phoneNumber);
	
	}	
	public static void main(String[] args) {
		AddressBook ab = new AddressBook();
		ab.addressbook();
	}
}
