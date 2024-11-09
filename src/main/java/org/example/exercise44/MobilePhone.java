package org.example.exercise44;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> myContacts;
    private String myNumber;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already on file");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact updatedContact) {
        if (findContact(oldContact) < 0) {
            System.out.println("Contact does not exist");
            return false;
        }
        myContacts.set(myContacts.indexOf(oldContact), updatedContact);
        return true;
    }

    public boolean removeContact(Contact contact) {
        if (findContact(contact) < 0) {
            System.out.println("Contact does not exist");
            return false;
        }
        myContacts.remove(contact);
        System.out.println("Contact removed");
        return true;
    }

    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    private int findContact(String name) {
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            if (contact.getName().equals(name)) {
                System.out.printf("Contact exists at %d", i);
                return i;
            }
        }
        System.out.println("Contact does not exist");
        return -1;
    }

    public Contact queryContact(String name) {
        int index = findContact(name);
        return myContacts.get(index);
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (Contact contact : myContacts) {
            int index = myContacts.indexOf(contact) + 1;
            System.out.println(index + ". " + contact.getName() + " -> " + contact.getPhoneNumber());
        }
    }
}
