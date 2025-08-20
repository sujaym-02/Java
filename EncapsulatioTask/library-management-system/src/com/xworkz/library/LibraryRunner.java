package com.xworkz.library;

import com.xworkz.library.book.Book;
import com.xworkz.library.librarystore.Library;

public class LibraryRunner {
    public static void main(String[] args) {
        Book book = new Book();
        book.setBookId("B101");
        book.setTitle("Game Of Thrones");
        book.setAuthor("G R R M");
        book.setGenre("Fantasy World");

        Library library = new Library();
        if (library.addBook(book)) {
            library.getBookDetails();
        } else {
            System.out.println("GETTING BOOK DETAILS FAILED");
        }
    }
}
