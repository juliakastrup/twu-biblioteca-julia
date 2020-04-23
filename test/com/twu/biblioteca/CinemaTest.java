package com.twu.biblioteca;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;


public class CinemaTest {

    @Test
    public void testIfShowsMovieList() {
        Cinema cinema = new Cinema(Cinema.getDefaultMovies());
        final ByteArrayOutputStream outPut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outPut));
        cinema.show();
        assertEquals("ID: 1 - Name: O menino do pijama listrado - Year: 2008 - Director: Mark Herman - Rating: 5\n" +
        "ID: 2 - Name: Você não estava aqui - Year: 2019 - Director: Ken Loach - Rating: 5\n" +
        "ID: 3 - Name: Parasita - Year: 2019 - Director: Bong Joon-ho - Rating: 5\n" ,outPut.toString());
    }

    @Test
    public void testIfMovieIsCheckedOut() {
        Cinema cinema = new Cinema(Cinema.getDefaultMovies());
        final ByteArrayOutputStream outPut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outPut));
        cinema.checkoutMovie("1");
        assertEquals("Thank you! Enjoy the movie!\n", outPut.toString());
    }

}
