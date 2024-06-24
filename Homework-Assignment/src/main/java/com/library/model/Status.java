package com.library.model;

public enum Status {

    BOOK_IN_THE_SHELF("Book in the shelf"),
    BOOK_OUT_OF_SHELF("Out of shelf"),
    NO_BOOKS_ASSIGNED("No books assigned");

    private final String bookStatus;

    Status(String bookStatus) {
        this.bookStatus = bookStatus;
    }

    public String getBookStatus() {
        return bookStatus;
    }
}
