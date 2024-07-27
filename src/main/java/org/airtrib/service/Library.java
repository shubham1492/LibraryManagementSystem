package org.airtrib.service;
import org.airtrib.model.Book;
import org.airtrib.model.Patron;

import java.util.*;
import java.util.stream.Collectors;

public class Library {
    private List<Book> books;
    private List<Patron> patrons;

    public Library() {
        this.books = new ArrayList<>();
        this.patrons = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void updateBook(Book oldBook, Book newBook) {
        int index = books.indexOf(oldBook);
        if (index != -1) {
            books.set(index, newBook);
        }
    }

    public List<Book> searchBooks(String keyword) {
        return books.stream()
                .filter(book -> book.getTitle().contains(keyword) || book.getAuthor().contains(keyword) || book.getISBN().contains(keyword))
                .collect(Collectors.toList());
    }

    public void addPatron(Patron patron) {
        patrons.add(patron);
    }

    public void updatePatron(Patron oldPatron, Patron newPatron) {
        int index = patrons.indexOf(oldPatron);
        if (index != -1) {
            patrons.set(index, newPatron);
        }
    }

    public List<Book> getBorrowingHistory(Patron patron) {
        return patron.getBorrowingHistory();
    }

    public boolean checkoutBook(Patron patron, Book book) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            patron.getBorrowingHistory().add(book);
        }
        return false;
    }

    public void returnBook(Patron patron, Book book) {
        if (!book.isAvailable()) {
            book.setAvailable(true);
            patron.getBorrowingHistory().remove(book);
        }
    }
}

