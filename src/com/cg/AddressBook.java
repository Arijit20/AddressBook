package com.cg;

public interface AddressBook {
  public void createContact(String firstName, String lastName, String address, String city, String state, String zip, String phoneNo, String email);
  public void editContact(String firstName, String lastName);
  public void deleteContact(String firstName, String lastName);
}
