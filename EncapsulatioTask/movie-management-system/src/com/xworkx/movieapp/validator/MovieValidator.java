package com.xworkx.movieapp.validator;

import com.xworkz.theatre.movie.Movie;

public class MovieValidator {

    public boolean movieValid(Movie movie) {
        boolean isValid = false;

        boolean idValid = false;
        boolean titleValid = false;
        boolean directorValid = false;
        boolean genreValid = false;
        boolean durationValid = false;
        boolean releaseDateValid = false;

        if (movie.getMovieId() != null && !movie.getMovieId().isEmpty()) {
            idValid = true;
        } else {
            System.out.println("MOVIE ID NOT VALID");
        }

        if (movie.getTitle() != null && !movie.getTitle().isEmpty()) {
            titleValid = true;
        } else {
            System.out.println("TITLE NOT VALID");
        }

        if (movie.getDirector() != null && !movie.getDirector().isEmpty()) {
            directorValid = true;
        } else {
            System.out.println("DIRECTOR NOT VALID");
        }

        if (movie.getGenre() != null && !movie.getGenre().isEmpty()) {
            genreValid = true;
        } else {
            System.out.println("GENRE NOT VALID");
        }

        if (movie.getDuration() > 30) {
            durationValid = true;
        } else {
            System.out.println("DURATION NOT VALID (must be > 30 minutes)");
        }

        if (movie.getReleaseDate() != null && !movie.getReleaseDate().isEmpty()) {
            releaseDateValid = true;
        } else {
            System.out.println("RELEASE DATE NOT VALID");
        }

        if (idValid && titleValid && directorValid && genreValid && durationValid && releaseDateValid) {
            isValid = true;
        }

        return isValid;
    }
}
