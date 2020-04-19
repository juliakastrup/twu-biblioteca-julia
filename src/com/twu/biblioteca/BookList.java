package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BookList {

    private static List<Book> bookList;

    public BookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public static void show() {
        List<Book> books = new ArrayList<>();
        List<String> newList = new ArrayList<>();
        for (Book book : bookList) {
            newList.add(book.toString());
        }
        newList.forEach(book -> System.out.println(book));
    }



}
