package org.airtrib;

import org.airtrib.model.Book;
import org.airtrib.model.Patron;
import org.airtrib.service.Library;
import java.util.*;

public class LibraryManagementSystem {
    private static LibraryManagementSystem instance;
    private Library library;

    private LibraryManagementSystem() {
        this.library = new Library();
    }

    public static LibraryManagementSystem getInstance() {
        if (instance == null) {
            instance = new LibraryManagementSystem();
        }
        return instance;
    }

    public Library getLibrary() {
        return library;
    }

    public static void main(String[] args) {
        LibraryManagementSystem system = LibraryManagementSystem.getInstance();
        Library library = system.getLibrary();

        // Adding books and patrons
        Book book1 = new Book("Title1", "Author1", "ISBN1", 2001);
        Book book2 = new Book("Title2", "Author2", "ISBN2", 2002);
        Patron patron1 = new Patron("Patron1", "P1");

        library.addBook(book1);
        library.addBook(book2);
        library.addPatron(patron1);

        // Searching books
        List<Book> foundBooks = library.searchBooks("Title1");
        System.out.println("Found books: " + foundBooks.size());

        // Checking out and returning books
        boolean checkoutSuccess = library.checkoutBook(patron1, book1);
        if (checkoutSuccess) {
            System.out.println("Successfully checked out Book1");
        } else {
            System.out.println("Book1 is not available for checkout");
        }

        library.returnBook(patron1, book1);
        System.out.println("Book1 is available: " + book1.isAvailable());
    }
}

