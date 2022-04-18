package com.addressbook;

import java.util.ArrayList;
import java.util.Set;

public class ContactStorage {
    private ArrayList<Contact> contactList = new ArrayList<>();

    public void add(Contact contact){
        contactList.add(contact);
    }

    public ArrayList<Contact> getContactList(){
        return contactList;
    }

    /*public void print(){
        System.out.println(contactList);
    }*/
}
