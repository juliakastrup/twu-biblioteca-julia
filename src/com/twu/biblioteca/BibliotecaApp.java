package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaApp {

    public static void main(String[] args) {
        BibliotecaApp.showWelcomeMessage();
        BibliotecaApp.showBookList();

    }

    public static void showWelcomeMessage(){
        String welcomeMessage = "Hello! Welcome to Bangalore Public Library!";
        System.out.println(welcomeMessage);
    }

    public static void showBookList(){
        List bookList = new ArrayList();
        bookList.add(new Book("A menina que roubava livros","Markus Zusak", 2005, "Intrínseca"));
        bookList.add(new Book("Moby Dick", "Herman Melville", 2008, "Cosac Naify"));
        bookList.add(new Book("Cachalote", "Daniel Galera", 2010, "Quadrinhos na Cia"));
        bookList.forEach((book) -> System.out.println(book.toString()));
    }

}
