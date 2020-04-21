package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    @Test
    public void testIfBookIsAvailable() {
        Book book = new Book(1, "A menina que roubava livros","Markus Zusak", 2005, true);
        boolean book_available = true;
        assertEquals(book.availability, book_available);
    }

    @Test
    public void testIfBookIsCheckedOut() {
        Book book = new Book(1, "A menina que roubava livros","Markus Zusak", 2005, true);
        book.checkout();
        assertEquals(book.availability, false);
    }

}
