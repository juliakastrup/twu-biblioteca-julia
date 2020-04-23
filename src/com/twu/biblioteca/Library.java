package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Library {

    private List<Book> bookList;

    public Library(List<Book> bookList) {
        this.bookList = bookList;
    }

    public void show() {
        List newList;
        newList = listAvailableItems();
        newList.forEach(book -> System.out.println(book));
    }

    public void showAllBooks() {
        List<String> newList = new ArrayList<>();
        for (Book book : bookList) {
            newList.add(book.toString());
        }
        newList.forEach(book -> System.out.println(book));
    }

    public List listAvailableItems(){
        List<String> newList = new ArrayList<>();
        for (Book book : bookList) {
            if(book.getAvailability()) {
                newList.add(book.toString());
            }
        }
        return newList;
    }

    public Book getById(int id) {
        List<Book> bookList = this.bookList.stream()
                .filter(book -> book.getId() == id)
                .collect(toList());
        if(bookList.isEmpty()){
            return null;
        } else {
            return bookList.get(0);
        }
    }

        public void checkoutBook(String string_id) {
        int id = Integer.parseInt(string_id);
        Book book = getById(id);
        if(book == null) {
            System.out.println("Sorry, that book is not available");
            return;
        }
        book.checkoutItem();
        System.out.println("Thank you! Enjoy the book!");

    }

    public void returnBook(String string_id) {
        int id = Integer.parseInt(string_id);
        Book book = getById(id);
        if(book == null) {
            System.out.println("That is not a valid book to return");
            return;
        }
        book.returnItem();
        System.out.println("Thank you for returning the book!");
    }

    public static List getDefaultBooks() {
        List bookList = new ArrayList();
        bookList.add(new Book(1, "A menina que roubava livros","Markus Zusak", 2005, true));
        bookList.add(new Book(2, "Moby Dick", "Herman Melville", 2008, true));
        bookList.add(new Book(3, "Cachalote", "Daniel Galera", 2010, true));
        return bookList;
    }





}
