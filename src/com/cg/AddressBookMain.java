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
	public void createContact(String firstName, String lastName, String address, String city, String state, String zip,
			String phoneNo, String email) {
		String name = (firstName + lastName).toLowerCase();
		Boolean keyPresent = contactMap.containsKey(name);
		if (keyPresent) {
			System.out.println("This name is already present\n");
		} else {
			Contacts person = new Contacts(firstName, lastName, address, city, state, zip, phoneNo, email);
			contactList.add(person);
			contactMap.put(name, person);
		}
	}

	@Override
	public void editContact(String firstName, String lastName) {
		String name = (firstName + lastName).toLowerCase();
		Boolean keyPresent = contactMap.containsKey(name);
		if (keyPresent) {
			System.out.println("What do you want to update?");
			Scanner sc = new Scanner(System.in);
			String s = sc.next().toLowerCase();
			switch (s) {
			case ("address"):
				System.out.println("Enter address");
				contactMap.get(name).setAddress(sc.next());

				break;
			case ("city"):
				System.out.println("Enter city");
				contactMap.get(name).setCity(sc.next());

				break;
			case ("state"):
				System.out.println("Enter state");
				contactMap.get(name).setState(sc.next());

				break;
			case ("zip"):
				System.out.println("Enter zip");
				contactMap.get(name).setZip(sc.next());

				break;
			case ("phoneno"):
				System.out.println("Enter phone no");
				contactMap.get(name).setPhoneNo(sc.next());

				break;
			case ("email"):
				System.out.println("Enter email");
				contactMap.get(name).setEmail(sc.next());

				break;
			}
		} else {
			System.out.println("This name is not present in the address book.");
		}
	}

	@Override
	public void deleteContact(String firstName, String lastName) {
		String name = (firstName + lastName).toLowerCase();
		Boolean keyPresent = contactMap.containsKey(name);
		if (keyPresent) {
			contactMap.remove(name);
		} else {
			System.out.println("This name is not present in address book.");
		}
	}

	@Override
	public void showDetails() {
		if (contactList.size() == 0)
		System.out.println("No contacts to show");
		for (int i = 0; i < contactList.size(); i++) {
			Contacts person = contactList.get(i);
			System.out.println("\nContact :" + (i + 1));
			System.out.println(person);
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program.");
		AddressBookMain contact1 = new AddressBookMain();
		AddressBookMain contact2 = new AddressBookMain();

		Scanner in = new Scanner(System.in);
		int option = 0;
		while (option != 4) {
			System.out.println("2 AddressBooks are available");
			System.out.println("\nTo add new contact press 1");
			System.out.println("To edit existing contact press 2");
			System.out.println("To delete existing press 3");
			System.out.println("to exit press 4");
			option = in.nextInt();

			if (option == 1) {
				System.out.println("Which Address Book? Enter 1 or 2");
				// for 1st address book
				if (in.nextInt() == 1) {
					System.out.println(
							"Enter First Name , Last Name, Address, City, State, Zip, Phone No, Email Id in the given order");

					contact1.createContact(in.next(), in.next(), in.next(), in.next(), in.next(), in.next(), in.next(),
							in.next());

				}
				// for 2nd address book
				else {
					System.out.println(
							"Enter First Name , Last Name, Address, City, State, Zip, Phone No, Email Id in the given order");

					contact2.createContact(in.next(), in.next(), in.next(), in.next(), in.next(), in.next(), in.next(),
							in.next());

				}
			}

			else if (option == 2) {
				System.out.println("Which Address Book? Enter 1 or 2");
				// for 1st address book
				if (in.nextInt() == 1) {
					System.out.println("Enter your first name.");
					String firstName = in.next();
					System.out.println("Enter your last name.");
					String lastName = in.next();
					contact1.editContact(firstName, lastName);

				}
				// for 2nd address book
				else {
					System.out.println("Enter your first name.");
					String firstName = in.next();
					System.out.println("Enter your last name.");
					String lastName = in.next();
					contact2.editContact(firstName, lastName);

				}
			} else if (option == 3) {
				System.out.println("Which Address Book? Enter 1 or 2");
				// for 1st address book
				if (in.nextInt() == 1) {
					System.out.println("Enter your first name.");
					String firstName = in.next();
					System.out.println("Enter your last name.");
					String lastName = in.next();
					contact1.deleteContact(firstName, lastName);

				}
				// for 2nd address book
				else {
					System.out.println("Enter your first name.");
					String firstName = in.next();
					System.out.println("Enter your last name.");
					String lastName = in.next();
					contact2.deleteContact(firstName, lastName);

				}
			}
			System.out.println("\nAddress Book 1");
			contact1.showDetails();
			System.out.println("\nAddress Book 2");
			contact2.showDetails();
			System.out.println("\nThank You");
		}

	}
}
