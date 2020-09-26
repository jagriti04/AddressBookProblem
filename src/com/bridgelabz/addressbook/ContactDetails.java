package com.bridgelabz.addressbook;

public class ContactDetails {
	public String firstName, lastName, address, city, state, email;
	public long zip;
	public long phoneNo;
	
	public ContactDetails(String fName, String lName, String address, String city,
						String state, long zip, long phoneNo, String email){
		this.firstName = fName;
		this.lastName = lName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNo = phoneNo;
		this.email = email;
	}
	
}
