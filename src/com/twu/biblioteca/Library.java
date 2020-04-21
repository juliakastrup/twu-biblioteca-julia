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
        List<String> newList;
        newList = listAvailableItems();
        newList.forEach(book -> System.out.println(book));
    }

    public List listAvailableItems(){
        List<String> newList = new ArrayList<>();
        for (Book book : bookList) {
            if(book.getAvailability() == true) {
                newList.add(book.toString());
            }
        }
        return newList;
    }

    public Book getById(int id) {
        Book bookObj = bookList.stream()
                .filter(book -> book.getId() == id)
                .collect(toList()).get(0);
        return bookObj;
    }

        public void checkoutBook(String string_id) {
        int id = Integer.parseInt(string_id);
        Book book = getById(id);
        book.checkout();
        System.out.println("Thank you! Enjoy the book!");
    }

    public static List<Book> getDefaultBooks() {
        List bookList = new ArrayList();
        bookList.add(new Book(1, "A menina que roubava livros","Markus Zusak", 2005, true));
        bookList.add(new Book(2, "Moby Dick", "Herman Melville", 2008, true));
        bookList.add(new Book(3, "Cachalote", "Daniel Galera", 2010, true));
        return bookList;
    }



}
