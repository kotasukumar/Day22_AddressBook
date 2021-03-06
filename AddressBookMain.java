package com.addressbook;

import java.util.Scanner;

public class AddressBookMain {
    String name;
    ContactStorage contactStorage = new ContactStorage();
    UserInterface userInterface = new UserInterface();

    public void userHandle(int choice, String bookName){
        switch (choice){
            case 1:
                addContact();
                break;
            case 2:
                System.out.println("Enter the name of the person you want to remove");
                Scanner scanner = new Scanner(System.in);
                name = scanner.nextLine();
                Contact nameToRemove = contactStorage.getName(name);
                contactStorage.remove(nameToRemove);
                    break;
            case 3:
                System.out.println("Enter the first name of the person you want to update");
                Scanner scanner1 = new Scanner(System.in);
                name = scanner1.nextLine();
                Contact nameToUpdate = contactStorage.getName(name);
                update(nameToUpdate);
                break;
            case 4:
                System.out.println(bookName);
//                userInterface.print(contactStorage.getContactList());
                userInterface.printBook(contactStorage.getBookList());
                break;
            case 5:
                int choice1 = userInterface.getBookName();
                work(choice1);
                break;
            default:
                System.out.println("Invalid input");
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
        contact1.emailID = scanner.next();

        contactStorage.add(contact1);
        contactStorage.addBook();
    }

    public void update(Contact contact){
        Scanner scanner = new Scanner(System.in);
        int choice = userInterface.showUpdateMenu();
        switch (choice){
            case 1:
                System.out.println("Enter the new first name");
                contact.firstName = scanner.nextLine();
                break;
            case 2:
                System.out.println("Enter the new last name");
                contact.lastName = scanner.nextLine();
                break;
            case 3:
                System.out.println("Enter the new address");
                contact.address = scanner.nextLine();
                break;
            case 4:
                System.out.println("Enter the new city");
                contact.city = scanner.nextLine();
                break;
            case 5:
                System.out.println("Enter the new state");
                contact.state = scanner.nextLine();
                break;
            case 6:
                System.out.println("Enter the new zip");
                contact.zip = scanner.nextLong();
                break;
            case 7:
                System.out.println("Enter the new contact number");
                contact.contactNumber = scanner.nextLong();
                break;
            case 8:
                System.out.println("Enter the new email id");
                contact.emailID = scanner.nextLine();
                break;
            default:
                System.out.println("Invalid input");
        }
    }

    public void work(int choice){
        AddressBookMain addressBookMain = new AddressBookMain();
        UserInterface userInterface = new UserInterface();

        while (choice == 1){
            //           choice = userInterface.getBookName();
            System.out.println("Enter name of book");
            Scanner scanner = new Scanner(System.in);
            String bookName = scanner.nextLine();
            while (choice != 5) {
                choice = userInterface.showMainMenu();
                addressBookMain.userHandle(choice, bookName);
            }
        }
    }

    public static void main(String[] args) {
        AddressBookMain addressBookMain = new AddressBookMain();
        System.out.println("Welcome to Address Book program");

        addressBookMain.work(1);
    }
}
