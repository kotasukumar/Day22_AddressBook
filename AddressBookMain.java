package com.addressbook;

import java.util.ArrayList;

public class AddressBookMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book program");

        Contact contact1 = new Contact();
        contact1.firstName = "Kota";
        contact1.lastName = "Sukumar";
        contact1.address = "1-1, xyz street";
        contact1.city = "CTR";
        contact1.state = "AP";
        contact1.zip = 123456;
        contact1.contactNumber = 1234567895;
        contact1.emailID = "xyz@gmail.com";

        ContactStorage contactStorage = new ContactStorage();
        contactStorage.add(contact1);

        UserInterface userInterface = new UserInterface();
        ArrayList contactList = contactStorage.getContactList();
        userInterface.print(contactList);
    }
}
