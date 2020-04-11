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
        assertEquals("Hello! Welcome to Bangalore Public Library!" + "\n",outPut.toString());
    }

    @Test
    public void testIfShowsBookList() {
        final ByteArrayOutputStream outPut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outPut));
        BibliotecaApp.showBookList();
        assertEquals("Title: A menina que roubava livros - Author: Markus Zusak - Year: 2005 - Publisher: Intrínseca\n" +
                "Title: Moby Dick - Author: Herman Melville - Year: 2008 - Publisher: Cosac Naify\n" +
                "Title: Cachalote - Author: Daniel Galera - Year: 2010 - Publisher: Quadrinhos na Cia" + "\n",outPut.toString());
    }
}