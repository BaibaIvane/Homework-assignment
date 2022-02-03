package com.library.controller;

import com.library.model.Book;
import com.library.service.BookCollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookCollectionController {

    BookCollectionService service;

    @Autowired
    public BookCollectionController(BookCollectionService service) {
        this.service = service;
    }

    @GetMapping("/getBookCollection")
    public List<Book> getMessage() {
        List<Book> listOfBooks = service.getAllBooks();
        return listOfBooks;
    }
}
