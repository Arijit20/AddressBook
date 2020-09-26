package com.cg;

public class AddressBookMain {
	
	private String firstName, lastName, address, city, state, zip, phoneNo, email;
	
	public AddressBookMain() {
	}
	 public AddressBookMain(String firstName, String lastName, String address, String city, String state, String zip, String phoneNo, String email) {
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.address = address;
    	this.city = city;
    	this.state = state;
    	this.zip = zip;
    	this.phoneNo = phoneNo;
    	this.email = email;
    }
	 @Override
	 public String toString() {
		 return "First Name :" + firstName +
		         "\nLast Name :" + lastName +
		         "\nAddress :" + address +
		         "\nCity :" + city+
		         "\nState :" + state +
		         "\nZip :" + zip +
		         "\nPhone No :" + phoneNo +
		         "\nEmail :" + email;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("Welcome to Address Book Program.");
    AddressBookMain contact1 = new AddressBookMain("Arijit" , "Dey" ,"Kolkata", "Kolkata", "WB", "700111", "98765", "a@mail");
	System.out.println(contact1);
	}

}
