package com.bridgelabz.addressbook;

import java.util.*;

public class AddressBook {
	
	private ArrayList<ContactDetails> contactDetailList;

	public AddressBook() {
		contactDetailList = new ArrayList<ContactDetails>();
	}
	
	public void addContacts(ContactDetails contactPerson) {
		System.out.println("-------Adding a Contact---- " + contactPerson.firstName);
		contactDetailList.add(contactPerson);
	}
	
	public ContactDetails getContactInfo() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first name:");
		String fName = sc.nextLine();
		System.out.println("Enter last name:");
		String lName = sc.nextLine();
		System.out.println("Enter the address:");
		String address = sc.nextLine();
		System.out.println("Enter the city");
		String city = sc.nextLine();
		System.out.println("Enter the state:");
		String state = sc.nextLine();
		System.out.println("zip");
		long zip = sc.nextLong();
		System.out.println("Enter the phone no:");
		long phoneNo = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the email:");
		String email = sc.nextLine();
		
		ContactDetails contact = new ContactDetails(fName, lName, address, city, state, zip, phoneNo, email);
		return contact;
	}
	
	public void viewContacts() {
		if (contactDetailList.size() == 0) {
			System.out.println("No contacts added.");
		} else {
			for(int i = 0; i<contactDetailList.size(); i++) {
				int num = i+1;
				System.out.println("Showing contact details contact no. "+ num);
				System.out.println(contactDetailList.get(i).firstName + " " + contactDetailList.get(i).lastName);
				System.out.println(contactDetailList.get(i).address+ " "+ contactDetailList.get(i).city + " "+ 
									contactDetailList.get(i).state+ " " + contactDetailList.get(i).zip);
				System.out.println(contactDetailList.get(i).phoneNo);
				System.out.println(contactDetailList.get(i).email);
			}
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the address book system. Choose your option");
		AddressBook addBook = new AddressBook();
		while(true) {
			System.out.println("Press 1 for adding contact \nPress 2 to view contacts \nPress 3 to exit");
			int ch = sc.nextInt();
			
			switch(ch) {
				case 1: System.out.println("---- Add contact details ---- ");
						ContactDetails contactPerson = addBook.getContactInfo();
						addBook.addContacts(contactPerson);
						System.out.println("Contact added for " + contactPerson.firstName + " " + contactPerson.lastName);
						break;
				case 2: System.out.println("----view contacts --- ");
						addBook.viewContacts();
						break;
				case 3: System.out.println("exit");
						return;
				default: System.out.println("No correct option chosen");
					
				
			}
		}
		
	}
}
