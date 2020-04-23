package com.twu.biblioteca;

public class Movie {
    int id;
    String name;
    int year;
    String director;
    int rating;
    boolean availability;

    public Movie(int id, String name, int year, String director, int rating, boolean availability) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.director = director;
        this.rating = rating;
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "ID: " + id + " - Name: " + name + " - Year: " + year + " - Director: " + director + " - Rating: " + rating;
    }

    public int getId() {
        return id;
    }

    public void checkout() {
        this.availability = false;
    }

    public Boolean getAvailability() {
        return availability;
    }
}

