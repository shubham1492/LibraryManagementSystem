package org.airtrib.model;

import java.util.ArrayList;
import java.util.List;

public class Patron {
    private String name;
    private String patronId;
    private List<Book> borrowingHistory;

    public Patron(String name, String patronId) {
        this.name = name;
        this.patronId = patronId;
        this.borrowingHistory = new ArrayList<>();
    }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronId() {
        return patronId;
    }

    public void setPatronId(String patronId) {
        this.patronId = patronId;
    }

    public List<Book> getBorrowingHistory() {
        return borrowingHistory;
    }

    public void setBorrowingHistory(List<Book> borrowingHistory) {
        this.borrowingHistory = borrowingHistory;
    }
}
