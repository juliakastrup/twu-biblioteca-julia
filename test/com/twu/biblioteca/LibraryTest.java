package com.twu.biblioteca;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class LibraryTest {
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
    public void testIfItGetsBookByIdWithValidId() {
        Library library = new Library(Library.getDefaultBooks());
        Book book = library.getById(1);
        int book_id = book.getId();
        assertEquals(1, book_id);
    }

    @Test
    public void testIfItReturnsNullWithInvalidId() {
        Library library = new Library(Library.getDefaultBooks());
        Book book = library.getById(5);
        assertNull(book);
    }

    @Test
    public void testIfBookIsCheckedOut() {
        Library library = new Library(Library.getDefaultBooks());
        final ByteArrayOutputStream outPut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outPut));
        library.checkoutBook("1");
        assertEquals("Thank you! Enjoy the book!\n", outPut.toString());
    }

    @Test
    public void testIfItShowsInvalidMessageIfTheIdIsInvalidAtCheckout(){
        Library library = new Library(Library.getDefaultBooks());
        final ByteArrayOutputStream outPut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outPut));
        library.checkoutBook("5");
        assertEquals("Sorry, that book is not available\n", outPut.toString());
    }

    @Test
    public void testIfItShowsInvalidMessageIfTheIdIsInvalidAtReturn(){
        Library library = new Library(Library.getDefaultBooks());
        final ByteArrayOutputStream outPut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outPut));
        library.returnBook("5");
        assertEquals("That is not a valid book to return\n", outPut.toString());
    }








}