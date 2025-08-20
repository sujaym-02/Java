package com.xworkz.library.librarystore;

import com.xworkz.library.book.Book;
import com.xworkz.library.validator.BookValidator;

public class Library {
    private Book book;

    public boolean addBook(Book book) {
        boolean isBookAdded = false;
        BookValidator validator = new BookValidator();
        boolean validBook = validator.bookValid(book);

        if (validBook) {
            this.book = book;
            System.out.println("BOOK ADDED TO LIBRARY SUCCESSFULLY");
            isBookAdded = true;
        } else {
            System.out.println("ADDING BOOK FAILED");
        }
        return isBookAdded;
    }

    public void getBookDetails() {
        if (book == null) {
            System.out.println("NO BOOK AVAILABLE IN LIBRARY");
            return;
        }

        System.out.println("BOOK ID   : " + book.getBookId());
        System.out.println("TITLE     : " + book.getTitle());
        System.out.println("AUTHOR    : " + book.getAuthor());
        System.out.println("GENRE     : " + book.getGenre());
    }
}
