package com.library.controller;

import com.library.model.Book;
import com.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/library/books")
    public List<Book> getAllBooks() {
        List<Book> listOfBooks = bookService.getAllBooks();
        return listOfBooks;
    }

    @GetMapping("/library/book/{id}")
    public Book getSpecificBook(@PathVariable Long id) {
        Book book = bookService.getSpecificBook(id);
        return book;
    }

    @DeleteMapping("/library/books/delete/{id}")
    public void deleteBook(@PathVariable("id") Long id) {
        bookService.delete(id);
    }

    @PostMapping("/library/book/add")
    public Book addBook(@RequestBody Book book) {
        Book newBook = getSpecificBook(book.getId());
        List<Book> allBooks = getAllBooks();
        allBooks.add(newBook);
        return bookService.insertBook(book);
    }

}
