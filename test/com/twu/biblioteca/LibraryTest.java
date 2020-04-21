package com.twu.biblioteca;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

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
    public void testIfBookIsCheckedOut() {
        Library library = new Library(Library.getDefaultBooks());
        final ByteArrayOutputStream outPut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outPut));
        library.checkoutBook("1");
        assertEquals("Thank you! Enjoy the book!\n", outPut.toString());
    }

    @Test
    public void testIfOnlyAvailableBooksAppear() {
        Library library = new Library(Library.getDefaultBooks());
        library.show();

    }







}