package Lesson4;

import java.util.*;

public class MainPhoneBook {

    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Gerasimov", 9696373);
        phoneBook.add("Ivanov", 9564715);
        phoneBook.add("Kuznetcov", 9666273);
        phoneBook.add("Gerasimov", 9697382);
        phoneBook.add("Petrov", 5748937);
        phoneBook.add("Sidorov", 5748937);
        phoneBook.add("Gerasimov", 9698216);
        phoneBook.add("Ulyanov", 9578362);


        phoneBook.get("Gerasimov");

    }
}