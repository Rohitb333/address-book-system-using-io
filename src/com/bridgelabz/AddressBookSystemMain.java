package com.bridgelabz;

public class AddressBookSystemMain {
    public static void main(String[] args) {
        System.out.println("Welcome To AddressBook management System");

        AddressBookSystemDetails details = new AddressBookSystemDetails();

        details.addDetails();
        details.display();
    }
}
