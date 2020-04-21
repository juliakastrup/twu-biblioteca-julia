package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Book {
    int id;
    String author;
    String title;
    int published_year;
    boolean availability;

    public Book(int id, String title, String author, int published_year, boolean availability) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.published_year = published_year;
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "ID: "+ id + " - Title: "+ title + " - Author: " + author + " - Year: " + published_year;
    }

    public int getId() {
        return id;
    }


    public void checkout() {
        this.availability = false;
    }

    public Boolean getAvailability(){
        return availability;
    }

}
