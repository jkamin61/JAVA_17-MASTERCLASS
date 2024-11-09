package org.example.exercise44;

public class Main {
    public static void main(String[] args) {
        Contact mark = new Contact("Mark", "57373822");
        MobilePhone myPhone = new MobilePhone("21212121");

        myPhone.addNewContact(mark);
        myPhone.printContacts();
    }
}
