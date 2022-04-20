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
}
