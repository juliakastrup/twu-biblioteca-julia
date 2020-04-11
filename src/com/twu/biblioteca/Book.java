package com.twu.biblioteca;

public class Book {
    String author;
    String title;
    int year;
    String publisher;

    public Book(String title, String author, int year, String publisher) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Title: "+ title + " - Author: " + author + " - Year: " + year + " - Publisher: " + publisher;
    }

}
