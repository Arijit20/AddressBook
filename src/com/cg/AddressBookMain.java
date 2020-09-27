package com.cg;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class AddressBookMain implements AddressBook {
	
	private ArrayList<Contacts> contactList = new ArrayList<>();
	 Map<String, Contacts> contactMap = new HashMap<>();
	
	public AddressBookMain() {
		contactList = new ArrayList<>();
		contactMap = new HashMap<>();
	}
	@Override
	public void createContact(String firstName, String lastName, String address, String city, String state, String zip, String phoneNo, String email) {
		String name = (firstName+lastName).toLowerCase();
		Contacts person = new Contacts(firstName, lastName, address, city, state, zip, phoneNo, email);
		contactList.add(person);
		contactMap.put(name, person); 
	}
	  @Override
	  public void editContact(String firstName, String lastName) {
	  String name = (firstName+lastName).toLowerCase();
	  Boolean keyPresent = contactMap.containsKey(name);
	 if(keyPresent) {
		  System.out.println("What do you want to update?");
		  Scanner sc = new Scanner(System.in);
		  String s = sc.next().toLowerCase();
		  switch(s) {
		  case("address"):
			  System.out.println("Enter address");
			  contactMap.get(name).setAddress(sc.next());
			 
			  break;
		  case("city"):
			  System.out.println("Enter city");
			  contactMap.get(name).setCity(sc.next());
			 
			  break;
		  case("state"):
			  System.out.println("Enter state");
			  contactMap.get(name).setState(sc.next());
			 
			  break;
		  case("zip"):
			  System.out.println("Enter zip");
			  contactMap.get(name).setZip(sc.next());
			  
			  break;
		  case("phoneno"):
			  System.out.println("Enter phone no");
			  contactMap.get(name).setPhoneNo(sc.next());
			  
			  break;
		  case("email"):
			  System.out.println("Enter email");
			  contactMap.get(name).setEmail(sc.next());
			  
			  break;
		  }
	 }
	 else {
		  System.out.println("This name is not present in the address book.");
	 }
	  }
	  @Override
	  public void deleteContact(String firstName, String lastName) {
		  
	  }
	  public void showDetails() {
	  for(int i = 0; i < contactList.size(); i++) {
		  Contacts person = contactList.get(i);
		  System.out.println(person);
	  }
	  }
		
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program.");
		AddressBookMain contact1 = new AddressBookMain();
		
		Scanner in = new Scanner(System.in);
		int option = 0;
		while(option != 3) {	
    
    System.out.println("\nTo add new contact press 1.");
    System.out.println("To edit existing contact press 2.");
    System.out.println("To exit press 3.");
    option = in.nextInt();
    
    if(option == 1) {
    System.out.println("Enter First Name , Last Name, Address, City, State, Zip, Phone No, Email Id in the given order");
   
    contact1.createContact(in.next(), in.next(), in.next(),in.next(),in.next(),in.next(), in.next(),in.next());
    contact1.showDetails();
    }
    
    else if(option == 2) {
  
    System.out.println("Enter your first name.");
    String firstName = in.next();
    System.out.println("Enter your last name.");
    String lastName = in.next();
    contact1.editContact(firstName , lastName);
    contact1.showDetails();
    }
     
    System.out.println("\nThank You");
    }
	
	}
}
