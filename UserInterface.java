package com.addressbook;

import java.util.ArrayList;

public class UserInterface {
    public void print(ArrayList<Contact> contactList) {
        for (Object o : contactList) {
            System.out.println(o);
        }
    }
}
