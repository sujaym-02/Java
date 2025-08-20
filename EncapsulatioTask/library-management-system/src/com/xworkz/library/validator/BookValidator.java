package com.xworkz.library.validator;

import com.xworkz.library.book.Book;

public class BookValidator {

    public boolean bookValid(Book book) {
        boolean isBookValid = false;
        boolean idValid = false;
        boolean titleValid = false;
        boolean authorValid = false;
        boolean genreValid = false;

        if (book.getBookId() != null && !book.getBookId().isEmpty()) {
            idValid = true;
        } else {
            System.out.println("BOOK ID NOT VALID");
        }

        if (book.getTitle() != null && !book.getTitle().isEmpty()) {
            titleValid = true;
        } else {
            System.out.println("BOOK TITLE NOT VALID");
        }

        if (book.getAuthor() != null && !book.getAuthor().isEmpty()) {
            authorValid = true;
        } else {
            System.out.println("BOOK AUTHOR NOT VALID");
        }

        if (book.getGenre() != null && !book.getGenre().isEmpty()) {
            genreValid = true;
        } else {
            System.out.println("BOOK GENRE NOT VALID");
        }

        if (idValid && titleValid && authorValid && genreValid) {
            isBookValid = true;
        }

        return isBookValid;
    }
}
