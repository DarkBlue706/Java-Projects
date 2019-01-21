package com.pratice;

import java.util.Scanner;

public class Main {
    public static MobilePhone mobilePhone = new MobilePhone();
    private static Contacts contacts = new Contacts("N/A","N/A");
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        boolean choice = true;
        while (choice){
            System.out.println("These are the following options");
            printOptions();
            int option = scanner.nextInt();
            switch(option){
                case 0:
                    choice = quit();
                    break;
                case 1:
                    printContact();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchContact();
                    break;
            }
        }

    }

    private static void printOptions(){
        System.out.println("0 is to quit");
        System.out.println("1 is to print all contacts");
        System.out.println("2 is to add a contact");
        System.out.println("3 is to update a contact");
        System.out.println("4 is to remove a contact");
        System.out.println("5 is to search for a contact");
    }
    private static boolean quit(){
       return mobilePhone.quit();
    }
    private static void printContact(){
        mobilePhone.printContacts();
    }
    private static void addContact(){
        mobilePhone.addContacts();
    }
    private static void updateContact(){
        mobilePhone.updateContacts();
    }
    private static void removeContact(){
        mobilePhone.removeContacts();
    }
    private static void searchContact(){
        mobilePhone.searchForContacts();
    }
}
