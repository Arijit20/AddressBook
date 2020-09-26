package com.cg;
import java.util.Scanner;

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

       //getters and setters
		public String getFirstName() {
			return firstName;
		}


		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}


		public String getLastName() {
			return lastName;
		}


		public void setLastName(String lastName) {
			this.lastName = lastName;
		}


		public String getAddress() {
			return address;
		}


		public void setAddress(String address) {
			this.address = address;
		}


		public String getCity() {
			return city;
		}


		public void setCity(String city) {
			this.city = city;
		}


		public String getState() {
			return state;
		}


		public void setState(String state) {
			this.state = state;
		}


		public String getZip() {
			return zip;
		}


		public void setZip(String zip) {
			this.zip = zip;
		}


		public String getPhoneNo() {
			return phoneNo;
		}


		public void setPhoneNo(String phoneNo) {
			this.phoneNo = phoneNo;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}
	 @Override
	 public String toString() {
		 return "First Name :" + firstName +"\nLast Name :" + lastName +"\nAddress :" + address +"\nCity :" + city+"\nState :" + state +"\nZip :" + zip +"\nPhone No :" + phoneNo +"\nEmail :" + email;
	 }
		
	public static void main(String[] args) {
		
    System.out.println("Welcome to Address Book Program.");
    System.out.println("Do you wnat to add a new contact?");
    System.out.println("Press 1 for yes , 2 for No");
    
    Scanner in = new Scanner(System.in);
    int option = in.nextInt();
    if(option == 1) {
    System.out.println("Enter First Name , Last Name, Address, City, State, Zip, Phone No, Email Id in the given order");
    AddressBookMain contact1 = new AddressBookMain(in.next(), in.next(), in.next(),in.next(),in.next(),in.next(), in.next(),in.next() );
    System.out.println(contact1);
    }
    System.out.println("Thank You");
	}

}
