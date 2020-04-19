package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.twu.biblioteca.Book.populateLibrary;

public class Menu {
    public void show() {
        showMenu();
        Scanner scan = new Scanner(System.in);
        String selectedOption = scan.next();
        redirectToOption(selectedOption);
    }

    private static void showMenuOptions() {
        List menuOptions = new ArrayList();
        menuOptions.add("1 - List of books\n");
        menuOptions.forEach(option -> System.out.println(option));
    }

    private void redirectToOption(String selectedOption) {
        if (selectedOption.contentEquals("1")) {
            showBookList();
        } else {
            showInvalidOptionMessage();
        }
    }

    private void showBookList(){
        BookList bookList = new BookList(populateLibrary());
        bookList.show();
    }

    private void showInvalidOptionMessage() {
        System.out.println("Please select a valid option!");
    }

    private void showMenu(){
        System.out.println("Enter the number of your choice:");
        showMenuOptions();
    }
}
