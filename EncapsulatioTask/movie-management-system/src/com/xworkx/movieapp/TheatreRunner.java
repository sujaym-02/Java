package com.xworkx.movieapp;

import com.xworkx.movieapp.theatre.Theatre;
import com.xworkz.theatre.movie.Movie;

public class TheatreRunner {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setMovieId("M007");
        movie.setTitle("Spiderman -Brand New Day");
        movie.setDirector("Marvel");
        movie.setGenre("Sci-Fi");
        movie.setDuration(155);
        movie.setReleaseDate("15/08/2026");

        Theatre theatre = new Theatre();
        if (theatre.addMovie(movie)) {
            theatre.getMovieDetails();
        } else {
            System.out.println("FAILED TO GET MOVIE DETAILS");
        }
    }
}
