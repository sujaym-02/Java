package com.xworkx.movieapp.theatre;

import com.xworkx.movieapp.validator.MovieValidator;
import com.xworkz.theatre.movie.Movie;


public class Theatre {
    private Movie movie;

    public boolean addMovie(Movie movie) {
        boolean isAdded = false;
        MovieValidator validator = new MovieValidator();
        boolean valid = validator.movieValid(movie);

        if (valid) {
            this.movie = movie;
            System.out.println("MOVIE ADDED SUCCESSFULLY TO THEATRE");
            isAdded = true;
        } else {
            System.out.println("ADDING MOVIE FAILED");
        }

        return isAdded;
    }

    public void getMovieDetails() {
        System.out.println("MOVIE ID     : " + movie.getMovieId());
        System.out.println("TITLE        : " + movie.getTitle());
        System.out.println("DIRECTOR     : " + movie.getDirector());
        System.out.println("GENRE        : " + movie.getGenre());
        System.out.println("DURATION     : " + movie.getDuration() + " minutes");
        System.out.println("RELEASE DATE : " + movie.getReleaseDate());
    }
}
