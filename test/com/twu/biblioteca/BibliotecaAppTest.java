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
}