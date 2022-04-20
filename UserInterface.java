package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    public void print(ArrayList<Contact> contactList) {
        for (Object o : contactList) {
            System.out.println(o);
        }
    }

    public int showMainMenu(){
        System.out.println("Enter the operation you want to do");
        System.out.println("1-add\n2-remove\n3-update\n4-print\n5-exit");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }

    public int showUpdateMenu(){
        System.out.println("Enter the parameter to update");
        System.out.println("1-first name\n2-last name\n3-address\n4-city\n5-state\n6-zip\n7-contactNumber\n8-email id");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}
