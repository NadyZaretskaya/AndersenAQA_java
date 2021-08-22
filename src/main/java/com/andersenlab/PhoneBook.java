package com.andersenlab;

import java.util.*;

public class PhoneBook {
    private HashMap<String, List<String>> phoneBook;

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public void add(String surname, String phoneNumber) {
        List<String> personNumber = new ArrayList<>();
        if (this.phoneBook.containsKey(surname)) {
            if (this.phoneBook.get(surname).toString().contains(phoneNumber)) {
                System.out.println("Телефонный номер \"" + phoneNumber + "\" для фамилии \""
                        + surname + "\" уже добавлен в эту книгу!");
            } else {
                personNumber = this.phoneBook.get(surname);
                personNumber.add(phoneNumber);
                this.phoneBook.put(surname, personNumber);
            }
        } else {
            personNumber.add(phoneNumber);
            this.phoneBook.put(surname, personNumber);
        }
    }

    public void get(String surname) {
        if (this.phoneBook.containsKey(surname)) {
            System.out.println("Фамилия: " + surname + "\nТел.:\t" + this.phoneBook.get(surname).toString()
                    .replace('[', ' ').replace(']', ' '));
        } else
            System.out.println("В книге нет телефонных номеров для человека с фамилией " + surname);
    }
}
