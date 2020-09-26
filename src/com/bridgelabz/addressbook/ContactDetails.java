package com.bridgelabz.addressbook;

public class ContactDetails {
	public String firstName;
	public String lastName;
	public String address;
	public String city;
	public String state;
	public double zip;
	public double phoneNo;
	public String email;
	
	public ContactDetails(String fName, String lName, String address, String city,
						String state, double zip, double phoneNo, String email){
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
