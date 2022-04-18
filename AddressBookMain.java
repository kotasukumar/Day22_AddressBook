package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book program");

        Scanner scanner = new Scanner(System.in);
        Contact contact1 = new Contact();
        contact1.firstName = scanner.nextLine();
        contact1.lastName = scanner.nextLine();
        contact1.address = scanner.nextLine();
        contact1.city = scanner.nextLine();
        contact1.state = scanner.nextLine();
        contact1.zip = scanner.nextLong();
        contact1.contactNumber = scanner.nextLong();
        contact1.emailID = scanner.nextLine();

        ContactStorage contactStorage = new ContactStorage();
        contactStorage.add(contact1);

        UserInterface userInterface = new UserInterface();
        ArrayList contactList = contactStorage.getContactList();
        userInterface.print(contactList);
    }
}
