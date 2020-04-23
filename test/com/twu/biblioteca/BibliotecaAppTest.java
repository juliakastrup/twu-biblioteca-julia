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
    public void testIfShowsMenu() {
        final ByteArrayOutputStream outPut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outPut));
        BibliotecaApp.showInputMenu();
        assertEquals("==================M=E=N=U==================\n" +
        "Enter the number of your choice:\n" +
        "1 - List of books\n" +
        "2 - Checkout book\n" +
        "3 - Return book\n" +
        "4 - List of movies\n" +
        "5 - Checkout movie\n" +
        "0 - Quit\n",outPut.toString());
    }



}