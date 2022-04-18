package com.addressbook;

import java.util.ArrayList;

public class Contact {
    String firstName, lastName, address, city, state, emailID;
    long zip, contactNumber;

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", emailID='" + emailID + '\'' +
                ", zip=" + zip +
                ", contactNumber=" + contactNumber +
                '}';
    }
}
