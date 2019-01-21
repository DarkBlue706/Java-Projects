package com.pratice;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    private  ArrayList<Contacts> contactsArray;
    private  Scanner scanner = new Scanner(System.in);
    public boolean quit(){
        return false;
    }

    public MobilePhone() {

        this.contactsArray = new ArrayList<>();
    }

    public void printContacts() {
        if (contactsArray.isEmpty()) {
            System.out.println("No contacts currently in mobile phone");
        } else {
            for (int i = 0; i < this.contactsArray.size(); i++) {
                System.out.print(i + 1 + ". Name: " + this.contactsArray.get(i).getName());
                System.out.println(" Phone number: " + this.contactsArray.get(i).getPhoneNumber());
            }

        }
    }

    public void addContacts() {

            System.out.println("Please enter the name");
            String name = scanner.nextLine();
            System.out.println("Now enter the phone number");
            String phoneNumber = scanner.nextLine();
            this.contactsArray.add(Contacts.addContact(name, phoneNumber));

    }
    public void updateContacts(){
        System.out.println("Which contact would you like to update?");
        String input = scanner.nextLine();
        int position = findContactIndex(input);
        System.out.println("What should the new number be?");
        String phoneNumber = scanner.nextLine();
        contactsArray.remove(position);
        this.contactsArray.add(Contacts.addContact(input, phoneNumber ));
        System.out.println("Contact updated");

    }
    public void removeContacts(){
        int position;
        System.out.println("Which contact would you like to remove? ");
        String temp = scanner.nextLine();
        position = findContactIndex(temp);
        if(position >= 0) {
            contactsArray.remove(position);
            System.out.println("Contact removed");
        }
        else{
            System.out.println("Contact not found");
        }
    }
    public void searchForContacts(){
        System.out.println("Which contact would you like to find?");
        String input = scanner.nextLine();
        int position = findContactIndex(input);
        System.out.println(contactsArray.get(position).getName());
        System.out.println(contactsArray.get(position).getPhoneNumber());
    }
    private int findContactIndex(String contactName){
        for(int i=0;i<this.contactsArray.size();i++){
            Contacts contacts = this.contactsArray.get(i);
            if(contacts.getName().equals(contactName))
                return i;
        }
        return -1;
    }
}
