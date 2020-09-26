package com.bridgelabz.addressbook;

public class AddressBook {
	
	public static void main(String[] args) {
		System.out.println("Welcome to the address book system.");
		
		ContactDetails contact = new ContactDetails("Jag", "Agni", "Type 2",
									"Pune", "Maha", 208016, 812345678, "ja@gm.cm");
		System.out.println("contact created for:" + contact.firstName + " "+ contact.lastName);
	}
}
