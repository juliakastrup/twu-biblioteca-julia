package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Cinema {

    private List<Movie> movieList;

    public Cinema(List<Movie> movieList) {
        this.movieList = movieList;
    }

    public void show() {
        List<String> newList;
        newList = listAvailableItems();
        newList.forEach(movie -> System.out.println(movie));
    }

    public List listAvailableItems(){
        List<String> newList = new ArrayList<>();
        for (Movie movie : movieList) {
            if(movie.getAvailability() == true) {
                newList.add(movie.toString());
            }
        }
        return newList;
    }

    public Movie getById(int id) {
        Movie movieObj = movieList.stream()
                .filter(movie -> {
                    try {
                        return movie.getId() == id;
                    } catch (IndexOutOfBoundsException e) {
                        //
                    }
                    return false;
                })
                .collect(toList()).get(0);
        return movieObj;
    }

    public void checkoutMovie(String string_id){
        int id = Integer.parseInt(string_id);
        Movie movie = getById(id);
        movie.checkout();
        System.out.println("Thank you! Enjoy the movie!");
    }


    public static List<Movie> getDefaultMovies() {
        List movieList = new ArrayList();
        movieList.add(new Movie(1, "O menino do pijama listrado",2008, "Mark Herman", 5, true));
        movieList.add(new Movie(2, "Você não estava aqui", 2019, "Ken Loach", 5, true));
        movieList.add(new Movie(3, "Parasita", 2019, "Bong Joon-ho", 5, true));
        return movieList;
    }
}
