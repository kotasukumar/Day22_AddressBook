package com.addressbook;

import java.util.ArrayList;

public class ContactStorage {
    private ArrayList<Contact> contactList = new ArrayList<>();
    private ArrayList<ArrayList<Contact>> bookList = new ArrayList<ArrayList<Contact>>();

    public void addBook(){
        bookList.add(contactList);
    }

    public void add(Contact contact){
        contactList.add(contact);
    }

    public ArrayList<Contact> getContactList(){
        return contactList;
    }

    public ArrayList<ArrayList<Contact>> getBookList(){
        return bookList;
    }

    public Contact getName(String name){
        for (Contact c: contactList) {
            if (name.equals(c.firstName)){
                return c;
            }
        }
        return null;
    }

    public void remove(Contact contact){
        contactList.remove(contact);
    }

    /*public void print(){
        System.out.println(contactList);
    }*/
}
