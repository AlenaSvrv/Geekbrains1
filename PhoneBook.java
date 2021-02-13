package Lesson4;

import java.util.HashMap;
import java.util.HashSet;

public class PhoneBook {
    HashMap<String, HashSet<Integer>> phoneBooks;

    PhoneBook() {
        this.phoneBooks = new HashMap<>();
    }

    void add(String surname, int num) {
        HashSet<Integer> phoneBook = phoneBooks.getOrDefault(surname, new HashSet<>());
        phoneBook.add(num);
        phoneBooks.put(surname, phoneBook);
    }

    void get(String surname) {

        System.out.println("Contact " + surname + ": " + phoneBooks.getOrDefault(surname, new HashSet<>()));
    }
}
