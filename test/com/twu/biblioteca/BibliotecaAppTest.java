package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class BibliotecaAppTest {


    @Test
    public void testIfShowsWelcomeMessage() {
        final ByteArrayOutputStream outPut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outPut));
        BibliotecaApp.showWelcomeMessage();
        assertEquals("Welcome to Biblioteca. You one-stop-shop for great book titles in Bangalore!" + "\n",outPut.toString());
    }

    @Test
    public void testIfShowsBookList() {
        BookList bookList = new BookList(Book.populateLibrary());
        final ByteArrayOutputStream outPut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outPut));
        bookList.show();
        assertEquals("Title: A menina que roubava livros - Author: Markus Zusak - Year: 2005\n" +
                "Title: Moby Dick - Author: Herman Melville - Year: 2008\n" +
                "Title: Cachalote - Author: Daniel Galera - Year: 2010\n",outPut.toString());
    }

    @Test
    public void testIfShowsMenu() {

    }

//    @Test
//    public void testIfShowsMenu(){
//        String outPut = Menu.showMenu();
//        assertEquals("1) List of books", outPut);
//    }
}