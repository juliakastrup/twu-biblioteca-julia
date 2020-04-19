package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Book {
    String author;
    String title;
    int published_year;

    public Book(String title, String author, int published_year) {
        this.title = title;
        this.author = author;
        this.published_year = published_year;
    }

    @Override
    public String toString() {
        return "Title: "+ title + " - Author: " + author + " - Year: " + published_year;
    }

    public static List<Book> populateLibrary() {
        List bookList = new ArrayList();
        bookList.add(new Book("A menina que roubava livros","Markus Zusak", 2005));
        bookList.add(new Book("Moby Dick", "Herman Melville", 2008));
        bookList.add(new Book("Cachalote", "Daniel Galera", 2010));
        return bookList;
    }




}
