package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
    ContactStorage contactStorage = new ContactStorage();
    UserInterface userInterface = new UserInterface();

    public void userHandle(){
        int choice = userInterface.showMainMenu();
        while (choice != 5){
            switch (choice){
                case 1:
                    addContact();
                    break;
                case 2:
                    System.out.println("Enter the name of the person you want to remove");
                    Scanner scanner = new Scanner(System.in);
                    String name = scanner.nextLine();
                    Contact nameToRemove = contactStorage.getName(name);
                    contactStorage.remove(nameToRemove);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
    }

    public void addContact() {
        Scanner scanner = new Scanner(System.in);
        Contact contact1 = new Contact();
        System.out.println("Enter first name");
        contact1.firstName = scanner.nextLine();
        System.out.println("Enter last name");
        contact1.lastName = scanner.nextLine();
        System.out.println("Enter address");
        contact1.address = scanner.nextLine();
        System.out.println("Enter city");
        contact1.city = scanner.nextLine();
        System.out.println("Enter state");
        contact1.state = scanner.nextLine();
        System.out.println("Enter zip code");
        contact1.zip = scanner.nextLong();
        System.out.println("Enter contact number");
        contact1.contactNumber = scanner.nextLong();
        System.out.println("Enter emailID");
        contact1.emailID = scanner.nextLine();

        contactStorage.add(contact1);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book program");

        AddressBookMain addressBookMain = new AddressBookMain();
        addressBookMain.userHandle();

        UserInterface userInterface = new UserInterface();
        userInterface.print(contactStorage.getContactList());
    }
}
