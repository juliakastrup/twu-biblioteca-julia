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
        Library library = new Library(Library.getDefaultBooks());
        final ByteArrayOutputStream outPut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outPut));
        library.show();
        assertEquals("ID: 1 - Title: A menina que roubava livros - Author: Markus Zusak - Year: 2005\n" +
                "ID: 2 - Title: Moby Dick - Author: Herman Melville - Year: 2008\n" +
                "ID: 3 - Title: Cachalote - Author: Daniel Galera - Year: 2010\n",outPut.toString());
    }

    @Test
    public void testIfShowsMenu() {
        final ByteArrayOutputStream outPut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outPut));
        BibliotecaApp.showInputMenu();
        assertEquals("Enter the number of your choice:\n" +
                "1 - List of books\n" +
                "2 - Checkout book\n" +
                "0 - Quit\n",outPut.toString());
    }



}