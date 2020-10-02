package com.bridgelabz.addressbook;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class AdressBookManage {
	
	private Map<String, AddressBook> nameToAddressBookMap;
	
	public AdressBookManage( ) {
		nameToAddressBookMap = new HashMap<>();
	}
	
	public void addAddressBook(String addBookName, AddressBook addBook) {
		nameToAddressBookMap.put(addBookName, addBook);
	}
	public boolean createAddBooks() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num of address books to create");
		int num = sc.nextInt();
		sc.nextLine();
		
		for (int i =0; i< num ; i++) {
			int serialNo = i+1;
			System.out.println("Enter the name of add. book num. " + serialNo);
			String aBookName = sc.nextLine();
			AddressBook addBookObj = new AddressBook();
			addBookObj = addBookObj.addressBookOption();
			addAddressBook(aBookName, addBookObj);
		}
		return true;
	}
	public void viewAddBooks() {
		for(int i=0; i< nameToAddressBookMap.size(); i++) {
			System.out.println(i + "Name of add. book are : "+ nameToAddressBookMap);
		}
	}
	
	public void findPersonByCityState(String place, int isCity) {
		nameToAddressBookMap.forEach((key, addresBookValue) -> {
			if (addresBookValue.nameToContactDetailsMap.size() >0) {
				addresBookValue.nameToContactDetailsMap.forEach((name, contactValue) -> {
					if (isCity == 1) {
						if (contactValue.city.equals(place)) {
							System.out.println("Person name---"+ contactValue.firstName+ " " + contactValue.lastName);
						}
					} else if (isCity == 0) {
						if (contactValue.state.equals(place)) {
							System.out.println("Person name---"+ contactValue.firstName+ " " + contactValue.lastName);
						}
					}
				});
			} else {
				System.out.println("Contact list empty");
			}
		});
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("welcome and create address books ");
		AdressBookManage addBookManage = new AdressBookManage();
		boolean created = addBookManage.createAddBooks();
		System.out.println("Successfully created address books");
		addBookManage.viewAddBooks();
		
		if (created) {
			System.out.println("Enter 1 to find by state \nEnter 2 to find by city");
			int ch = sc.nextInt();
			sc.nextLine();
			switch (ch) {
				case 1: System.out.println("Enter the name of state: ");
						String stateName = sc.nextLine();
						addBookManage.findPersonByCityState(stateName,0);
						break;
				
				case 2: System.out.println("Enter the name of city: ");
						String cityName = sc.nextLine();
						addBookManage.findPersonByCityState(cityName,1);
						break;
						
				default:
					break;
			}
			
		}
		
	}
}
