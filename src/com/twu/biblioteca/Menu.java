package com.twu.biblioteca;

import com.sun.javafx.scene.control.behavior.SliderBehavior;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.twu.biblioteca.Library.getDefaultBooks;

public class Menu {
    public void show() {
        showMenu();
    }

    public void setOptionInput() {
        Scanner scan = new Scanner(System.in);
        String selectedOption = scan.next();
        redirectToOption(selectedOption);
    }

    private static void showMenuOptions() {
        List menuOptions = new ArrayList();
        menuOptions.add("1 - List of books");
        menuOptions.add("2 - Checkout book");
        menuOptions.add("3 - Return book");
        menuOptions.add("0 - Quit");
        menuOptions.forEach(option -> System.out.println(option));
    }

    private void redirectToOption(String selectedOption) {
        Library library = new Library(getDefaultBooks());
        switch (selectedOption){
            case "1":
                showBookList(library);
                break;
            case "2":
                checkoutBook(library);
                break;
            case "3":
                checkinBook(library);
                break;
            case "0":
                quitApplication();
                break;
            default:
                showInvalidOptionMessage();
        }
    }

    private void showBookList(Library library){
        library.show();
    }

    private void showFullBookList(Library library){
        library.showAllBooks();
    }


    private void checkoutBook(Library library){
        showBookList(library);
        System.out.println("Enter the number of your desired book!");
        Scanner scan = new Scanner(System.in);
        String selectedOption = scan.next();
        library.checkoutBook(selectedOption);
    }

    private void checkinBook(Library library){
        showFullBookList(library);
        System.out.println("Enter the number of the book you want to return!");
        Scanner scan = new Scanner(System.in);
        String selectedOption = scan.next();
        library.checkinBook(selectedOption);
    }

    private void quitApplication() {
        System.out.println("Thanks for the visit! Goodbye!");
    }

    private void showInvalidOptionMessage() {
        System.out.println("Please select a valid option!");
    }

    private void showMenu(){
        System.out.println("Enter the number of your choice:");
        showMenuOptions();
    }
}
